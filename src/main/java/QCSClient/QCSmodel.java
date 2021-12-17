package QCSClient;

import QCSServer.QCSRepository;

public class QCSmodel {
  private TempUserAccount tempUserAccount;

  public String getData(){
    return QCSRepository.getData();
  }

  public String getPW(){
    return tempUserAccount.getPw();
  }

}
