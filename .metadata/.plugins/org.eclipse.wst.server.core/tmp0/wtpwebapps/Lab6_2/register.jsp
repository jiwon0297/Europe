<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Register</title>
<link rel="stylesheet" href="lab3.css" type="text/css" />
</head>
<body>
<jsp:include page="header.jsp" />
<br>
<br>
<div style="background-image: url('./resource/main.png'); width:100%;height:230px;">
	<br><br>
	<h1><strong>등록하실 아티스트를 선택하세요</strong></h1>
</div>
<br>
<table class="main">
<tr>
	<td><h2>SINGER</h2></td>
	<td><h2>DANCER</h2></td>
	<td><h2>PLAYER</h2></td>
</tr>
<tr>
	<td><a href="ListSingerAction.do"><img src="./resource/singer.jpg" width="330" height="330"></a></td>
	<td><a href="ListDancerAction.do"><img src="./resource/dancer.jpg" width="330" height="330"></a></td>
	<td><a href="ListPlayerAction.do"><img src="./resource/player.jpg" width="330" height="330"></a></td>
</tr>
</table>
</body>
</html>