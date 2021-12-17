package QCSClient;

public class BankPayment extends Payment {
  public BankPayment(int bankNumber, int bankPassword) {
    setPaymentNumber(bankNumber);
    setPaymentPassword(bankPassword);
  }
}
