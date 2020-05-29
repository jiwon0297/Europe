<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
	function deleteConfirm(number){
		if(confirm("Do you want to remove?")==true)
			location.href = "DeleteAction.do?number=" + number;
		else
			return;	
	}
</script>

number : ${re.getNumber()}

			<table border="1">
			<tr>
				<td>Title</td>
				<td>${re.getTitle()}</td>
			</tr>
			<tr>
				<td>Writer</td>
				<td>${re.getName()}</td>
			</tr>
			<tr>
				<td>Content</td>
				<td>${pe.getDetail()}</td>
			</tr>		
			</table>
			<p><a href="EditViewAction.do?number=${re.getNumber()}" class="btn btn-secondary" role="button">Edit &raquo;</a></p>
			<p><a href="#" onclick="deleteConfirm('${re.getNumber()}')" class="btn btn-secondary" role="button">Delete &raquo;</a></p>
</body>
</html>