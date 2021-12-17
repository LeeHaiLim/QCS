package QCSClient;

public class TempUserAccount {
  private String id;
  private String pw;
  private PersonelInfo persenelInfo;
  private Payment payment;

  public String getPw() { return pw; }

  public void setPw(String pw) { this.pw = pw; }

  public PersonelInfo getPersenelInfo() { return persenelInfo; }

  public void setPersenelInfo(PersonelInfo persenelInfo) { this.persenelInfo = persenelInfo; }

  public Payment getPayment() { return payment; }

  public void setPayment(Payment payment) { this.payment = payment; }

  public String getId() { return id; }

  public void setId(String id) { this.id = id; }
}
