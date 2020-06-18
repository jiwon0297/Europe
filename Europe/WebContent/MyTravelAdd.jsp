<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>MyTravelAdd</title>
</head>
<body>
<c:if test="${userID == null}">
	<small id="fileHelp" class="form-text text-muted" style="position:relative; font-size:13pt; left:280px;">※로그인을 해야만 추가가 가능합니다.※</small>
</c:if>
</body>
</html>