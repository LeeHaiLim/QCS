package QCSClient;

public class CardPayment extends Payment {
  private String cvc;

  public CardPayment(String cardName, String cardNumber, String cardPassword, String cvc) {
    setPaymentName(cardName);
    setPaymentNumber(cardNumber);
    setPaymentPassword(cardPassword);
    this.cvc = cvc;
  }

  public void setCVC(String cvc) {
    this.cvc = cvc;
  }

  public String getCVC() {
    return cvc;
  }
}
