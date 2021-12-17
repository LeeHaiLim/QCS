package QCSClient;

public class BankPayment extends Payment {
  public BankPayment(String bankName, String bankNumber, String bankPassword) {
    setPaymentName(bankName);
    setPaymentNumber(bankNumber);
    setPaymentPassword(bankPassword);
  }
}
