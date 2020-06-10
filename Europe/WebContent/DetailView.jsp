<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
	function deleteConfirm(number, country, category){
		if(confirm("정말로 이 글을 삭제하시겠습니까? 삭제하면 되돌릴 수 없습니다.")==true)
			location.href = "DeleteAction.do?number=" + number + "&&country=" + country + "&&cate1=" + category;
		else
			return;	
	}
</script>
<% request.setCharacterEncoding("utf-8"); %>
 <!--top place start-->
    <section class="event_part section_padding" style="background-image: url('marine/img/${re.getCountry()}.jpg'); background-size:cover; height:400px;">
            <div class="container">
            <div class="row justify-content-center" style="background-color:white; opacity:0.6; margin-top:100px">
                <div class="col-xl-6"><br><br><br><br>
                    <div class="section_tittle text-center">
                        <h2 style="font-size:40pt; color:black;">${re.getCountry()} ${re.getCate1()}</h2>
                        <br><br><br><br>
                    </div>
                </div>
            </div>
            </div>
    </section>
    <!--top place end-->
    <div style="background-color:lightgray;">
       <jsp:include page="header.jsp"/>
    </div>
    <br><br><br><br>
	<form method="post" style ="margin:0 auto; width:1000px;">
	<fieldset>
	<input type = "button"  class="btn btn-default" style="position:relative; right:20px; color:white; background-color:#68a5f3;" value="목록으로" onclick="location='${re.getCountry()}${re.getCate1()}ListViewAction.do'">
	<div class="form-group row">
      <strong><input type="text" class="form-control" name="title" value="[${re.getCountry()}/${re.getCate1()}] ${re.getTitle()}" style="text-align:center; font-size:13pt; background-color:beige; width:700px; position: relative; left:160px;" disabled/></strong>
     </div>
     <div class="form-group row" >
      <input type="text" class="form-control" name="name" value="작성자 : ${re.getName()}" style="background-color:beige; width:700px; position: relative; left:160px;" disabled/>
     </div>
    <div class="form-group row">
   		<img src="upload/${re.getFileRealName()}">
      <textarea class="form-control" name="content" style="background-color:beige; height:600px; width:700px; position: relative; left:160px; text-align:center; gravity:center;" readonly="readonly" disabled>${re.getDetail()}</textarea>
    </div>
    <input type="hidden" name="number" value="${re.getNumber()}">
	</fieldset>
	<c:if test="${userID == null}">
	<small id="fileHelp" class="form-text text-muted" style="position:relative; font-size:13pt; left:280px;">※로그인을 해야만 글 수정 및 삭제가 가능합니다.※</small>
	</c:if>
	<c:if test="${userID == re.getName()}">
	<div style="position: relative; left:350px;">
	<input type="button" class="btn btn-default" style="color:white; background-color:#68a5f3;" value="수정" onclick="location='EditViewAction.do?number=${re.getNumber()}'">
	<input type="button" class="btn btn-default" style="color:white; background-color:#68a5f3;" value="삭제" onclick="deleteConfirm('${re.getNumber()}','${re.getCountry()}','${re.getCate1()}')">
	</div>
	</c:if>
	</form>
       <br><br><br><br><br>

</body>
</html>