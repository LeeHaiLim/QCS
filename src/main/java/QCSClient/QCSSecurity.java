package QCSClient;

import java.security.*;
import javax.crypto.Cipher;

public class QCSSecurity {

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

  public String encrypt(String data) {
    return "";
  }

  public String decrypt(String data) {
    return "";
  }

}
