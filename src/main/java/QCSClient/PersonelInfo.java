package QCSClient;

import java.util.Date;

public class PersonelInfo {
  private String name;
  private Date birthDate;
  private String address;
  private String phoneNumber;
  private HealthInfo healthInfo;

  public PersonelInfo(String name, Date birthDate, String address, String phoneNumber) {
    this.name = name;
    this.birthDate = birthDate;
    this.address = address;
    this.phoneNumber = phoneNumber;
  }

  public String getName() { return name; }

  public void setName(String name) { this.name = name; }

  public Date getBirthDate() { return birthDate; }

  public void setBirthDate(Date birthDate) { this.birthDate = birthDate; }

  public String getAddress() { return address; }

  public void setAddress(String address) { this.address = address; }

  public String getPhoneNumber() { return phoneNumber; }

  public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

  public HealthInfo getHealthInfo() { return healthInfo; }

  public void setHealthInfo(HealthInfo healthInfo) { this.healthInfo = healthInfo; }
}
