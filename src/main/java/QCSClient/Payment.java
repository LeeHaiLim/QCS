package QCSClient;

public abstract class Payment {
  private int paymentNumber;
  private int paymentPassword;

  public void setPaymentNumber(int paymentNumber) {
    this.paymentNumber = paymentNumber;
  }

  public void setPaymentPassword(int paymentPassword) {
    this.paymentPassword = paymentPassword;
  }

  public int getPaymentNumber() {
    return paymentNumber;
  }

  public int getPaymentPassword() {
    return paymentPassword;
  }
}
