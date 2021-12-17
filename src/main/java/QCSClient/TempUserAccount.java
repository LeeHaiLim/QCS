package QCSClient;

public class TempUserAccount {
  private String id = "JisooJung";
  private String pw = "0ffe1abd1a08215353c233d6e009613e95eec4253832a761af28ff37ac5a150c";
  private PersonelInfo personelInfo;
  private Payment payment;

  public String getPw() { return pw; }

  public void setPw(String pw) { this.pw = pw; }

  public PersonelInfo getPersonelInfo() { return personelInfo; }

  public void setPersonelInfo(PersonelInfo personelInfo) { this.personelInfo = personelInfo; }

  public Payment getPayment() { return payment; }

  public void setPayment(Payment payment) { this.payment = payment; }

  public String getId() { return id; }

  public void setId(String id) { this.id = id; }
}
