package QCSClient;

public class CardPayment extends Payment{
  private int cvc;

  public void setCvc(int cvc) {
    this.cvc = cvc;
  }

  public int getCvc() {
    return cvc;
  }
}
