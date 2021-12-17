<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <title>QR Code Styling</title>
    <script async src="https://www.googletagmanager.com/gtag/js?id=UA-149838823-1"></script>
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

        h3 {
            color: black;
            font-size: 10pt;
        }
    </style>
    <script>
        window.dataLayer = window.dataLayer || [];

        function gtag() {
            dataLayer.push(arguments);
        }

        gtag('js', new Date());

        gtag('config', 'UA-149838823-1');

    </script>
</head>
<meta charset="UTF-8">
</head>
<body>
<h2>정지수님 </h2>
<h1><strong>
    <div style="text-align: center;">
        &lt;나만의 QRcode 만들기&gt;
    </div>
</strong></h1>
<div style="text-align : center;">
    <form class="col qr-form" id="form" action="controller.jsp" method="post">
        <div style="height: auto; margin-left:20%; margin-right: 20%; border:5px solid black;">
            <h3> - 메인 옵션 - </h3>
            <div class="panel panel--open">
                <label for="form-width">너비</label>
                <div>
                    <input name="width" id="form-width" type="number" min="100" max="10000" value="300"/>
                </div>
                <label for="form-height">높이</label>
                <div>
                    <input name="height" id="form-height" type="number" min="100" max="10000" value="300"/>
                </div>
            </div>
            <br>
            <h3> - 도트 옵션 - </h3>
            <div class="panel">
                <label for="form-style">도트 스타일</label>
                <div id ="form-style">
                    <input type='radio'
                           name='style'
                           value='square'
                           onclick=/>square
                    <input type='radio'
                           name='style'
                           value='rounded'
                           onclick=/>rounded
                    <input type='radio'
                           name='style'
                           value='dots'
                           onclick=/>dots
                </div> <br>
                <label class="dotsOptionsHelper.colorType.single" for="form-dots-color">도트 색상</label>
                <div class="dotsOptionsHelper.colorType.single">
                    <input name="dotsOptions.color" id="form-dots-color" type="color" value="#ffffff"/>
                </div>
                <label class="dotsOptionsHelper.colorType.gradient" style="visibility: hidden; height: 0">Gradient
                    Type</label>
                <div class="dotsOptionsHelper.colorType.gradient space-between-container"
                     style="visibility: hidden; height: 0">
                    <div style="flex-grow: 1">
                        <input node-data-field="checked" node="dotsOptionsHelper.gradient.linear"
                               id="form-dots-gradient-type-linear" type="radio" name="dots-gradient-type"
                               checked/>
                        <label for="form-dots-gradient-type-linear">Linear</label>
                    </div>
                    <div style="flex-grow: 1">
                        <input name-data-field="checked" name="dotsOptionsHelper.gradient.radial"
                               id="form-dots-gradient-type-radial" type="radio" name="dots-gradient-type"/>
                        <label for="form-dots-gradient-type-radial">Radial</label>
                    </div>
                </div>
                <label class="dotsOptionsHelper.colorType.gradient" style="visibility: hidden; height: 0">Dots
                    Gradient</label>
                <div class="dotsOptionsHelper.colorType.gradient" style="visibility: hidden; height: 0">
                    <input name="dotsOptionsHelper.gradient.color1" type="color" value="#ffffff"/>
                    <input name="dotsOptionsHelper.gradient.color2" type="color" value="#ffffff"/>
                </div>
                <label class="dotsOptionsHelper.colorType.gradient" for="form-dots-gradient-rotation"
                       style="visibility: hidden; height: 0">Rotation</label>
                <div class="dotsOptionsHelper.colorType.gradient" style="visibility: hidden; height: 0">
                    <input name="dotsOptionsHelper.gradient.rotation" id="form-dots-gradient-rotation"
                           type="number" min="0" max="360" value="0"/>
                </div>
            </div>
            <h3> - 배경 옵션 - </h3>
            <div class="panel">
                <label class="backgroundOptionsHelper.colorType.single" for="form-background-color">배경
                    색상</label>
                <div class="backgroundOptionsHelper.colorType.single">
                    <input name="backgroundOptions.color" id="form-background-color" type="color"
                           value="#ffffff"/>
                </div>
                <label class="backgroundOptionsHelper.colorType.gradient"
                       style="visibility: hidden; height: 0">Gradient Type</label>
                <div class="backgroundOptionsHelper.colorType.gradient space-between-container"
                     style="visibility: hidden; height: 0">
                    <div style="flex-grow: 1">
                        <input name-data-field="checked" name="backgroundOptionsHelper.gradient.linear"
                               id="form-background-gradient-type-linear" type="radio"
                               name="background-gradient-type" checked/>
                        <label for="form-background-gradient-type-linear">Linear</label>
                    </div>
                    <div style="flex-grow: 1">
                        <input name-data-field="checked" name="backgroundOptionsHelper.gradient.radial"
                               id="form-background-gradient-type-radial" type="radio"
                               name="background-gradient-type"/>
                        <label for="form-background-gradient-type-radial">Radial</label>
                    </div>
                </div>
                <label class="backgroundOptionsHelper.colorType.gradient"
                       style="visibility: hidden; height: 0">Background Gradient</label>
                <div class="backgroundOptionsHelper.colorType.gradient"
                     style="visibility: hidden; height: 0">
                    <input name="backgroundOptionsHelper.gradient.color1" type="color" value="#ffffff"/>
                    <input name="backgroundOptionsHelper.gradient.color2" type="color" value="#ffffff"/>
                </div>
                <label class="backgroundOptionsHelper.colorType.gradient"
                       for="form-background-gradient-rotation"
                       style="visibility: hidden; height: 0">Rotation</label>
                <div class="backgroundOptionsHelper.colorType.gradient"
                     style="visibility: hidden; height: 0">
                    <input name="backgroundOptionsHelper.gradient.rotation"
                           id="form-background-gradient-rotation" type="number" min="0" max="360"
                           value="0"/>
                </div>
            <button type="submit"> 저장하기</button>
            <br>
        </div>
    </form>
</div>
<%!

%>
</body>
</html>
