package QCSClient;

import java.security.*;
import java.util.Base64;
import java.util.Calendar;
import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
public class QCSSecurity {

  public static String alg = "AES/CBC/PKCS5Padding";
  private final static String secretKey = "QRCODESYSTEMSECRESTKEYQRCODESYSTEMSECRESTKEY".substring(0,32);
  private final static String secretIV = secretKey.substring(0,16);

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

  private String genKey(){
    String prim = Long.toString(Calendar.getInstance().getTime().getTime()/(1000*30*60));
    String key = prim;
    while(key.length()<32){
      key = key.concat(prim);
    }
    return key.substring(0,32);
  }

  public String encrypt(String data) throws Exception {
    Cipher cipher = Cipher.getInstance(alg);
    SecretKeySpec keySpec = new SecretKeySpec(secretKey.getBytes(), "AES");
    IvParameterSpec ivParamSpec = new IvParameterSpec(secretIV.getBytes());
    cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivParamSpec);

    byte[] encrypted = cipher.doFinal(data.getBytes("UTF-8"));
    return Base64.getEncoder().encodeToString(encrypted);
  }

  public String decrypt(String data) throws Exception {
    Cipher cipher = Cipher.getInstance(alg);
    SecretKeySpec keySpec = new SecretKeySpec(secretKey.getBytes(), "AES");
    IvParameterSpec ivParamSpec = new IvParameterSpec(secretIV.getBytes());
    cipher.init(Cipher.DECRYPT_MODE, keySpec, ivParamSpec);

    byte[] decodedBytes = Base64.getDecoder().decode(data);
    byte[] decrypted = cipher.doFinal(decodedBytes);
    return new String(decrypted, "UTF-8");
  }

  public String encryptQR(String data) throws Exception {
    Cipher cipher = Cipher.getInstance(alg);
    String key = genKey();
    String iv = key.substring(0,16);
    SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(), "AES");
    IvParameterSpec ivParamSpec = new IvParameterSpec(iv.getBytes());
    cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivParamSpec);

    byte[] encrypted = cipher.doFinal(data.getBytes("UTF-8"));
    return Base64.getEncoder().encodeToString(encrypted);
  }

  public String decryptQR(String data) throws Exception {
    Cipher cipher = Cipher.getInstance(alg);
    String key = genKey();
    String iv = key.substring(0,16);
    SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(), "AES");
    IvParameterSpec ivParamSpec = new IvParameterSpec(iv.getBytes());
    cipher.init(Cipher.DECRYPT_MODE, keySpec, ivParamSpec);

    byte[] decodedBytes = Base64.getDecoder().decode(data);
    byte[] decrypted = cipher.doFinal(decodedBytes);
    return new String(decrypted, "UTF-8");
  }

}
