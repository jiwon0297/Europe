<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ page import="jdbc.ConnectionProvider" %>
<%@ page import="dao.SingerTableDAO" %>
<%@ page import="dto.SingerElementBean" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<link rel="stylesheet" href="lab3.css" type="text/css" />
<title>singerList</title>
</head>
<body>
<script type ="text/javascript">
	function deleteConfirm(number){
		if(confirm("Do you want to remove?") == true)
			location.href="DeleteSingerAction.do?number=" + number;
		else
				return;
	}
</script>
	mode : ${mode}
<% request.setCharacterEncoding("utf-8"); %>
<jsp:include page="header.jsp" /><br><br>

<div style="background-image: url('./resource/main.png'); width:100%;height:230px;">
	<br><br>
	<h1><strong>등록된 SINGER의 목록입니다.</strong></h1>
</div>
<br>
<nav id="header" >
		<ul>
                   <li><a class="link" href="AddSingerAction.do">Add</a></li>
       </ul>      
</nav>
<table>
	<tr>
		<td><h2>number</h2></td>
		<td><h2>kind</h2></td>
		<td><h2>name</h2></td>
		<td><h2>age</h2></td>
		<td><h2>gender</h2></td>
		<td><h2>area</h2></td>
		<td><h2>career</h2></td>
		<td><h2>introduction</h2></td>
		
		<c:forEach var="pe" items="${pList}">
			<tr>
				<td>${pe.getNumber()}</td>
				<td>${pe.getKind()}</td>
				<td>${pe.getName()}</td>
				<td>${pe.getAge()}</td>
				<td>${pe.getGender()}</td>
				<td>${pe.getArea()}</td>
				<td>${pe.getCareer()}</td>
				<td>${pe.getIntroduction()}</td>
				<td>
					<p><a href="EditSingerAction.do?number=${pe.getNumber()}" class="btn btn-secondary" role="button">edit &raquo; </a>
					<p><a href="#" onclick="deleteConfirm('${pe.getNumber()}')" class="btn btn-secondary" role="button">delete &raquo;</a>
				</td>
			</tr>
			</c:forEach>
		<tr>
	</table>
</body>
</html>