<%--
  Created by IntelliJ IDEA.
  User: 이해림
  Date: 2021-12-18
  Time: 오전 1:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="QCSClient.QCSmodel" import="QCSClient.QCSSecurity" import="QCSClient.ViewModel" contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.security.NoSuchAlgorithmException" %>
<%!
    QCSmodel qcSmodel = new QCSmodel();
    QCSSecurity qcsSecurity = new QCSSecurity();
    public boolean checkPW(String pw) throws NoSuchAlgorithmException {
        return qcsSecurity.hash(pw).equals(qcSmodel.getPW());
    }
%>
<!DOCTYPE html>
<html>
<head>
    <head>
        <meta charset="utf-8">
        <style type="text/css">
            body {
                background-color: #BCF5A9
            }
        </style>
        <title> QRcode 생성 페이지 </title>
    </head>
</head>
  <body>
  <%
      request.setCharacterEncoding("UTF-8");
      String password = request.getParameter("password");
      if (checkPW(password)) {
          response.sendRedirect("index3.jsp");
      }
      else
        out.println("비밀 번호가 틀렸습니다.");
  %>
  </body>
</html>
