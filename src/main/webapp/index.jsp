<%--
  Created by IntelliJ IDEA.
  User: 이해림
  Date: 2021-12-16
  Time: 오후 9:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="QCSClient.QCSmodel" contentType="text/html;charset=UTF-8" language="java" %>
<%!
    String string = "You Are So Dumb!";
    %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>QR Code Styling</title>
    <script type="text/javascript" src="https://unpkg.com/qr-code-styling@1.5.0/lib/qr-code-styling.js"></script>
</head>
<body>
<div id="canvas"></div>
<script type="text/javascript">
    const qrCode = new QRCodeStyling({
        width: 300,
        height: 300,
        type: "svg",
        data: "<%= string %>",
        image: "https://upload.wikimedia.org/wikipedia/commons/5/51/Facebook_f_logo_%282019%29.svg",
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
    qrCode.download({name: "qr", extension: "svg"});
</script>
</body>
</html>
