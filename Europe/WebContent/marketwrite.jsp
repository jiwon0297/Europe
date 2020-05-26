<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Market WriteForm</title>
<style>
div.button{
	margin: auto;
	width : 20%;
}
</style>
</head>
<body>
<jsp:include page="header.jsp" />
<div class="jumbotron" align="center">
	<div class="container">
		<h1 class="display-3">Market</h1>
	</div>
</div>
<jsp:include page="menu.jsp" />
<br><br>
<form action="loginprocess.jsp" method="post" style ="margin:0 auto; width:1000px;">
	<fieldset>
	<div class="form-group row">
      <label for="Category" class="col-sm-2 com-form-label">�Խ���</label>
      <div class="col-sm-10">
      <select name="category1" style="width:150px; float:left;">
					<option>��������</option>
					<option>ȭ��</option>
					<option>����</option>
					<option>Ƽ��</option>
					<option>���ǰ</option>
	  </select>
	  <select name="category2" style="width:150px; float:left;">
					<option>���Ӹ�����</option>
					<option>���ؿ�</option>
					<option>�Ⱦƿ�</option>
	  </select>
	</div>
	</div>
	<div class="form-group row">
      <label for="title" class="col-sm-2 col-form-label">����</label>
      <div class="col-sm-10">
        <input type="title" class="form-control" id="title" placeholder="������ �Է����ּ���." style="width:900px;">
      </div>
     </div>
     <div class="form-group">
      <label for="inputfile">����÷��</label>
      <div class="col-sm-10" style = "float:right;">
      <input type="file" class="form-control-file" id="inputfile" aria-describedby="fileHelp">
      <small id="fileHelp" class="form-text text-muted">�۰� ���õ� ������ ÷���Ͽ� �ֽʽÿ�.</small>
    </div>
    </div>
    <div class="form-group">
      <label for="content">����</label>
      <textarea class="form-control" id="content" rows="15" placeholder="������ �Է����ּ���." ></textarea>
    </div>
	</fieldset>
	<div class="button">
	<input type="submit" class="btn btn-primary" value="�۾���">
	<input type="reset" class="btn btn-primary" value="���" onclick="location='market.jsp'">
	</div>
</form>
</body>
</html>