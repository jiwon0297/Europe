<!-- list.tag -->
<%@ tag language="java" pageEncoding="UTF-8" body-content="empty"%>
<%@ attribute name="mode" required="true"%><!-- required 속성, 필수 attribute 명시 --> 
<%@ attribute name="personList" type="java.util.List" required="true"%><!-- type 속성, 기본 값은 String --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div style="padding-top: 10px">
	<table class="table table-hover">
		<tr>
			<th>Name</th>
			<th>Age</th>
			<th>Gender</th>
			<th>Height</th>
			<th>Weight</th>
			<th>Neck</th>
			<th>Waist</th>
			<th>Hip</th>
			<th>${mode}</th>
		</tr>		
		<c:forEach var="person" items="${personList}">
		<tr>
			<td>${person.getName()}</td>
			<td>${person.getAge()}</td>
			<td>${person.getGender()}</td>
			<td>${person.getHeight()}</td>
			<td>${person.getWeight()}</td>
			<td>${person.getNeck()}</td>
			<td>${person.getWaist()}</td>
			<td>${person.getHip()}</td>
			<td>${person.getIndex()}</td>
		</tr>
		</c:forEach>
	</table>
</div>
