package QCSClient;

public class CardPayment extends Payment {
  private int cvc;

  public CardPayment(int cardNumber, int cardPassword, int cvc) {
    setPaymentNumber(cardNumber);
    setPaymentPassword(cardPassword);
    this.cvc = cvc;
  }

  public void setCVC(int cvc) {
    this.cvc = cvc;
  }

  public int getCVC() {
    return cvc;
  }
}
