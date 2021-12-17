<%@ page import="QCSClient.QCSmodel" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <style type="text/css">
        body {background-color: #BCF5A9}
    </style>
    <title> QRcode 생성 페이지 </title >
</head>
<body>
<script type="text/javascript">
    password = prompt("비밀번호");
    if (password == 1111) {
        window.onload = function () {
            setTimeout("startPage()", 0);
        }

        function startPage() {
            document.location.href = "index3.jsp";
        }
    } else {
        document.write("로그인을 실패하였습니다.");
    }
</script>
</body>
</html>
