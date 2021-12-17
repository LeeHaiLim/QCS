package QCSClient;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class HealthInfo {
  private ArrayList<Date> vcnDates;
  private String vcnStatus;
  private boolean visitedAbroad;

  public HealthInfo(ArrayList<Date> vcnDates, boolean visitedAbroad) {
    this.vcnDates = vcnDates;
    this.visitedAbroad = visitedAbroad;
    this.vcnStatus = setVcnStatus(vcnDates);
  }

  private String setVcnStatus(ArrayList<Date> vcnDates) {
    String vcnStatus;
    Date today = Calendar.getInstance().getTime();
    if (vcnDates.size() == 0) {
      vcnStatus = "미접종자입니다.";
    } else {
      Date lastVCNed = vcnDates.get(vcnDates.size() - 1);
      long vcnDuration = (today.getTime() - lastVCNed.getTime()) / (1000 * 24 * 60 * 60);
      if (vcnDuration <= 14) {
        vcnStatus = vcnDates.size() + "차 접종 후 14일 미만입니다.";
      } else if (vcnDuration <= 90) {
        vcnStatus = vcnDates.size() + "차 접종 후 14일 경과하였습니다.";
      } else {
        vcnStatus = vcnDates.size() + "차 접종 후 90일 경과하였습니다.";
      }
    }
    return vcnStatus;
  }

  public ArrayList<Date> getVcnDates() { return vcnDates; }

  public void setVcnDates(ArrayList<Date> vcnDates) {
    this.vcnDates = vcnDates;
    this.vcnStatus = setVcnStatus(vcnDates);
  }

  public String getVcnStatus() { return vcnStatus; }

  public boolean isVisitedAbroad() { return visitedAbroad; }

  public void setVisitedAbroad(boolean visitedAbroad) {
    this.visitedAbroad = visitedAbroad;
  }
}
