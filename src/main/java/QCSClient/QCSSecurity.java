package QCSClient;

import java.security.*;
import java.util.Base64;
import java.util.Calendar;
import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class QCSSecurity {

  public static String alg = "AES/CBC/PKCS5Padding";
  private final String key = Long.toString(Calendar.getInstance().getTime().getTime()/(1000*30*60));
  private final String iv = key.concat(key).concat(key).substring(0,16);

  public String hash(String data) throws NoSuchAlgorithmException {
    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
    messageDigest.update(data.getBytes());

    return bytesToHex(messageDigest.digest());
  }

  private String bytesToHex(byte[] bytes) {
    StringBuilder stringBuilder = new StringBuilder();
    for (byte b : bytes) {
      stringBuilder.append(String.format("%02x", b));
    }
    return stringBuilder.toString();
  }

  public String encrypt(String data) throws Exception {
    Cipher cipher = Cipher.getInstance(alg);
    SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(), "AES");
    IvParameterSpec ivParamSpec = new IvParameterSpec(iv.getBytes());
    cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivParamSpec);

    byte[] encrypted = cipher.doFinal(data.getBytes("UTF-8"));
    return Base64.getEncoder().encodeToString(encrypted);
  }

  public String decrypt(String data) throws Exception {
    Cipher cipher = Cipher.getInstance(alg);
    SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(), "AES");
    IvParameterSpec ivParamSpec = new IvParameterSpec(iv.getBytes());
    cipher.init(Cipher.DECRYPT_MODE, keySpec, ivParamSpec);

    byte[] decodedBytes = Base64.getDecoder().decode(data);
    byte[] decrypted = cipher.doFinal(decodedBytes);
    return new String(decrypted, "UTF-8");
  }

  public static void main(String[] args) throws NoSuchAlgorithmException {
    QCSSecurity qcsSecurity = new QCSSecurity();
    System.out.println(qcsSecurity.hash("1111"));
    System.out.println(qcsSecurity.iv);
  }

}
