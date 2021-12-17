<%@ page import="QCSClient.QCSmodel" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <link href="https://fonts.googleapis.com/css?family=Do+Hyeon&display=swap&subset=korean" rel="stylesheet">
    <style type="text/css">
        body {
            background-color: #BCF5A9
        }
        h1 {
            color: black;
            font-size: 20pt;
            font-style: 돋움;
            font-weight: bold;
        }

        h2 {
            color: black;
            font-size: 5pt;
        }
    </style>
    <meta charset="UTF-8">
    <title>QRcode 생성 페이지</title>
</head>
<body>
<h2>정지수님, 환영합니다! </h2>
<button type="button" onclick="location.href='index4.jsp';"> 디자인하기</button>
<h1 style="text-align: center;"><strong>
    &lt;나만의 QRcode 만들기&gt;
</strong></h1>
<div id="cont">
    <form method="get" action="none">
        <fieldset>
            <legend>QR Code 생성</legend>
            <div style="text-align: center;">
                <button type="button" onclick="location.href='index1.jsp';"> 전자출입명부 / 결제</button>
                <br></div>
        </fieldset>
    </form>
    <div id="qrout"></div>
</div>
<br> <br> <br> <br>
<div style="text-align: center;">
    <img src="https://www.konkuk.ac.kr/img/Intro/ui_eng.gif" alt="건국대학교" width="300" height="100">
</div>
</body>
</html>

