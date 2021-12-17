package QCSClient;

import QCSServer.QCSRepository;

public class QCSmodel {
  private TempUserAccount tempUserAccount;

  public void setTempUserAccount() {
    QCSRepository.setData(tempUserAccount.getId());
    this.tempUserAccount.setPersonelInfo(new PersonelInfo(QCSRepository.getName(), QCSRepository.getBirthDate(),
            QCSRepository.getAddress(),QCSRepository.getPhoneNumber()));
    this.tempUserAccount.getPersonelInfo().getHealthInfo().setVcnDates(QCSRepository.getVcnDates());
    this.tempUserAccount.getPersonelInfo().getHealthInfo().setVisitedAbroad(QCSRepository.isVisitedAbroad());
    if(QCSRepository.getCvc()!=null) {
      this.tempUserAccount.setPayment(new CardPayment(QCSRepository.getPaymentName(),QCSRepository.getPaymentNumber(),
              QCSRepository.getPaymentPassword(),QCSRepository.getCvc()));
    } else{
      this.tempUserAccount.setPayment(new BankPayment(QCSRepository.getPaymentName(),
              QCSRepository.getPaymentNumber(), QCSRepository.getPaymentPassword()));
    }
  }

  public String getData(){
    String userName = tempUserAccount.getPersonelInfo().getName();
    String userAddress = tempUserAccount.getPersonelInfo().getAddress();
    String userPhoneNumber = tempUserAccount.getPersonelInfo().getPhoneNumber();
    String userVcnStatus = tempUserAccount.getPersonelInfo().getHealthInfo().getVcnStatus();
    String userPaymentNo = tempUserAccount.getPayment().getPaymentNumber();
    String userPaymentPW = tempUserAccount.getPayment().getPaymentPassword();
    if(tempUserAccount.getPayment() instanceof CardPayment) {
      userPaymentPW.concat(","+((CardPayment) tempUserAccount.getPayment()).getCVC());
    };
    return userName+","+userAddress+","+userPhoneNumber+","+userVcnStatus+","+userPaymentNo+","+userPaymentPW;
  }

  public String getPW(){
    return tempUserAccount.getPw();
  }
}
