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
	
	function cancel(){
		window.history.back(); 
	}

</script>
<%
String userID = (String)session.getAttribute("userID");
String userPW = (String)session.getAttribute("userPW"); 
%>
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
	<input type = "button" class="btn btn-default" style="color:white; background-color:#68a5f3;" value="Back" onclick="cancel()">
	<div class="form-group row">
      <strong><input type="text" class="form-control" id="title" value="[${re.getCountry()}/${re.getCate1()}] ${re.getTitle()}" style="text-align:center; font-size:13pt; background-color:beige; width:700px; position: relative; left:160px;" readonly/></strong>
     </div>
     <div class="form-group row" >
      <input type="text" class="form-control" id="title" value="작성자 : ${re.getName()}" style="background-color:beige; width:700px; position: relative; left:160px;" readonly/>
     </div>
    <div class="form-group row">
      <input class="form-control" id="content" style="background-color:beige; height:600px; width:700px; position: relative; left:160px;" value="${re.getDetail()}" readonly/>
    </div>
	</fieldset>
	<% if(userID == null && userPW == null) { %>
	<small id="fileHelp" class="form-text text-muted" style="position:relative; font-size:13pt; left:280px;">※로그인을 해야만 글 수정 및 삭제가 가능합니다.※</small>
	<%} else { %>
	<div style="position: relative; left:350px;">
	<input type="button" class="btn btn-default" style="color:white; background-color:#68a5f3;" value="수정" onclick="location='EditViewAction.do?number=${re.getNumber()}'">
	<input type="button" class="btn btn-default" style="color:white; background-color:#68a5f3;" value="삭제"onclick="deleteConfirm('${re.getNumber()}')">
	<%}%>
	</div>
	</form>
       <br><br><br><br><br>

</body>
</html>