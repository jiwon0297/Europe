<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*"%>
<%@ page import="dto.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>Periodic Element</title>
</head>
<body>
number : ${pe.getNumber()}
<c:set var="prevId" value="${pe.getNumber() - 1}" />
<c:if test="${prevId} <= 1"><c:set var="prevId" value="1" /></c:if>
<c:set var="nextId" value="${pe.getNumber() + 1}" />
<c:if test="${nextId} >= 118"><c:set var="prevId" value="118" /></c:if>

<%@ include file="menu.jsp" %>
<div class="container">
	<div class="row">
		<div class="col">
			<a href="DetailViewAction.do?number=${prevId}"><img src="./resources/left.png" width="230"></a>
		</div>
		<div class="col">
			<h1 class="display-3">
			<a href="https://en.wikipedia.org/wiki/${pe.getName()}" title="${pe.toString()}">
			${pe.getName()}
			</a>
			</h1>
			<table border="1">
			<tr>
				<td>number</td>
				<td>${pe.getNumber()}</td>
			</tr>
			<tr>
				<td>name</td>
				<td>${pe.getName()}</td>
			</tr>
			<tr>
				<td>symbol</td>
				<td>${pe.getSymbol()}</td>
			</tr>
			<tr>
				<td>weight</td>
				<td>${pe.getWeight()}</td>
			</tr>
			<tr>
				<td>numberOfNeutrons</td>
				<td>${pe.getNumberOfNeutrons()}</td>
			</tr>
			<tr>
				<td>numberOfProtons</td>
				<td>${pe.getNumberOfProtons()}</td>
			</tr>
			<tr>
				<td>numberOfElectrons</td>
				<td>${pe.getNumberOfElectrons()}</td>
			</tr>
			<tr>
				<td>period</td>
				<td>${pe.getPeriod()}</td>
			</tr>
			<tr>
				<td>group</td>
				<td>${pe.getGroup()}</td>
			</tr>
			<tr>
				<td>phase</td>
				<td>${pe.getPhase()}</td>
			</tr>
			</table>
		</div>
		<div class="col">
			<a href="DetailViewAction.do?number=${nextId}"><img src="./resources/right.png" width="230"></a>
		</div>
	</div>
</div>
</body>
</html>