package QCSServer;

import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class QCSRepository {
  private static String name;
  private static Date birthDate;
  private static String address;
  private static String phoneNumber;
  private static ArrayList<Date> vcnDates = new ArrayList<Date>();
  private static boolean visitedAbroad = false;
  private static String paymentName;
  private static String paymentNumber;
  private static String paymentPassword;
  private static String cvc;

  public static void setData(String id) {
    mapLocalData(id);
    mapRemoteData(phoneNumber);
  }

  public static void mapLocalData(String id) {
    try {
      Connection conn = DriverManager.getConnection(
              "jdbc:mysql://localhost:3306/qcs_db",
              "QCSServer",
              "1234"
      );

      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery(
              "SELECT * FROM qcs_db.accountInfo, qcs_db.payment " +
                      "WHERE qcs_db.accountinfo.dep_id='" + id + "' " +
                      "AND qcs_db.payment.dep_id='" + id + "'"
      );
      while (rs.next()) {
        name = rs.getString(1);
        birthDate = rs.getDate(2);
        phoneNumber = rs.getString(3);
        address = rs.getString(4);
        paymentName = rs.getString(6);
        paymentNumber = rs.getString(7);
        paymentPassword = rs.getString(8);
        cvc = rs.getString(9);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public static void mapRemoteData(String certNumber) {
    try {
      Connection conn = DriverManager.getConnection(
              "jdbc:mysql://localhost:3306/external_db",
              "QCSServer",
              "1234"
      );

      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery(
              "SELECT * FROM external_db.vaccinedinfo, external_db.visitabroad " +
                      "WHERE external_db.vaccinedinfo.dep_id='" + certNumber + "' " +
                      "AND external_db.visitabroad.dep_id='" + certNumber + "'"
      );
      while (rs.next()) {
        vcnDates.add(rs.getDate(1));
        Date today = Calendar.getInstance().getTime();
        Date visitDate = rs.getDate(3);
        if ((today.getTime() - visitDate.getTime() / (1000 * 24 * 60 * 60)) <= 30) {
          visitedAbroad = true;
        } else {
          visitedAbroad = false;
        }
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
  public static String getName() {
    return name;
  }

  public static void setName(String name) {
    QCSRepository.name = name;
  }

  public static Date getBirthDate() {
    return birthDate;
  }

  public static void setBirthDate(Date birthDate) {
    QCSRepository.birthDate = birthDate;
  }

  public static String getAddress() {
    return address;
  }

  public static void setAddress(String address) {
    QCSRepository.address = address;
  }

  public static String getPhoneNumber() {
    return phoneNumber;
  }

  public static void setPhoneNumber(String phoneNumber) {
    QCSRepository.phoneNumber = phoneNumber;
  }

  public static ArrayList<Date> getVcnDates() {
    return vcnDates;
  }

  public static void setVcnDates(ArrayList<Date> vcnDates) {
    QCSRepository.vcnDates = vcnDates;
  }

  public static boolean isVisitedAbroad() {
    return visitedAbroad;
  }

  public static void setVisitedAbroad(boolean visitedAbroad) {
    QCSRepository.visitedAbroad = visitedAbroad;
  }

  public static String getPaymentName() {
    return paymentName;
  }

  public static void setPaymentName(String paymentName) {
    QCSRepository.paymentName = paymentName;
  }

  public static String getPaymentNumber() {
    return paymentNumber;
  }

  public static void setPaymentNumber(String paymentNumber) {
    QCSRepository.paymentNumber = paymentNumber;
  }

  public static String getPaymentPassword() {
    return paymentPassword;
  }

  public static void setPaymentPassword(String paymentPassword) {
    QCSRepository.paymentPassword = paymentPassword;
  }

  public static String getCvc() {
    return cvc;
  }

  public static void setCvc(String cvc) {
    QCSRepository.cvc = cvc;
  }

}

