<%@ page import="QCSClient.QCSmodel" import="QCSClient.QCSSecurity" contentType="text/html;charset=UTF-8"
         language="java" %>
<%@ page import="java.security.NoSuchAlgorithmException" %>
<html>
<head>
    <meta charset="utf-8">
    <style type="text/css">
        body {
            background-color: #BCF5A9
        }
    </style>
    <title> QRcode 생성 페이지 </title>
</head>
<body style="text-align: center">
<br>
<label>비밀번호 입력</label>
<br><br>
<div>
    <form action="controller.jsp" method="post">
    <input name="password" type="password"/>
    <input type="submit" value="확인">
    </form>
</div>
</body>
</html>
