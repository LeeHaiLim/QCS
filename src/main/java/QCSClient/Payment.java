package QCSClient;

public abstract class Payment {
  private String paymentName;
  private String paymentNumber;
  private String paymentPassword;

  public void setPaymentNumber(String paymentNumber) {
    this.paymentNumber = paymentNumber;
  }

  public void setPaymentPassword(String paymentPassword) {
    this.paymentPassword = paymentPassword;
  }

  public String getPaymentName() {
    return paymentName;
  }

  public void setPaymentName(String paymentName) {
    this.paymentName = paymentName;
  }

  public String getPaymentNumber() {
    return paymentNumber;
  }

  public String getPaymentPassword() {
    return paymentPassword;
  }
}
