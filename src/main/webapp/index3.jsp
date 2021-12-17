<%@ page import="QCSClient.QCSmodel" import="QCSClient.QCSSecurity" contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.security.NoSuchAlgorithmException" %>
<%!
    QCSmodel qcSmodel = new QCSmodel();
    QCSSecurity qcsSecurity = new QCSSecurity();
    public String getData() throws Exception {
        return qcsSecurity.encryptQR(qcSmodel.getData());
    }
%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>QRcode 생성 페이지</title>
    <script type="text/javascript" src="https://unpkg.com/qr-code-styling@1.5.0/lib/qr-code-styling.js"></script>
    <link href="https://fonts.googleapis.com/css?family=Do+Hyeon&display=swap&subset=korean" rel="stylesheet">
    <style type="text/css">
        body {
            background-color: #BCF5A9
        }
        h1 {
            color: black;
            font-size: 20pt;
            font-style: 돋움;
            font-weight:bold;
        }
        h2 {
            color: black;
            font-size: 5pt;
        }
    </style>
</head>
<body>
<h2>정지수님</h2>
<h1 style="text-align: center;"><strong>QRcode 생성 완료!</strong></h1>
<br>
</center>
<div style="text-align: center;" id="canvas"></div>
<script type="text/javascript">
    const qrCode = new QRCodeStyling({
        width: 300,
        height: 300,
        type: "svg",
        data: "<%=getData()%>",
        image: "",
        dotsOptions: {
            color: "#4267b2",
            type: "rounded"
        },
        backgroundOptions: {
            color: "#e9ebee",
        },
        imageOptions: {
            crossOrigin: "anonymous",
            margin: 20
        }
    });

    qrCode.append(document.getElementById("canvas"));
</script>
</body>
</html>