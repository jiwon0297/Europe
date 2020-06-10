<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function cancel(){
		window.history.back(); 
	}
</script>
<body>
<% request.setCharacterEncoding("utf-8"); %>
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
    <div style="background-color:lightgray;">
       <jsp:include page="header.jsp"/>
    </div>
    <br><br><br><br>
    
<form action="EditAction.do" method="post" enctype="multipart/form-data" style ="margin:0 auto; width:1000px;">
	<fieldset>
	<div class="form-group row">
      <label for="Category" class="col-sm-2 com-form-label" style="position: relative; font-size:15pt; left:130px;">나라/주제</label>
      <div style="position: relative; left:95px;">
      <select name="country" style="background-color:#fbfbfb; width:150px; float:left;">
               <option value="Korea"<c:if test="${re.getCountry() =='Korea'}">selected='selected'</c:if>>Korea</option>
               <option value="England"<c:if test="${re.getCountry() =='England'}">selected='selected'</c:if>>England</option>
               <option value="France"<c:if test="${re.getCountry() =='France'}">selected='selected'</c:if>>France</option>
               <option value="Swiss"<c:if test="${re.getCountry() =='Swiss'}">selected='selected'</c:if>>Swiss</option>
               <option value="Germany"<c:if test="${re.getCountry() =='Germany'}">selected='selected'</c:if>>Germany</option>
               <option value="Hungary"<c:if test="${re.getCountry() =='Hungary'}">selected='selected'</c:if>>Hungary</option>
               <option value="Czech"<c:if test="${re.getCountry() =='Czech'}">selected='selected'</c:if>>Czech</option>
               <option value="Italy"<c:if test="${re.getCountry() =='Italy'}">selected='selected'</c:if>>Italy</option>
     </select>
     <select name="cate1" style="background-color:#fbfbfb; width:150px; float:left;">
               <option value="Information"<c:if test="${re.getCate1() =='Information'}">selected='selected'</c:if>>Information</option>
               <option value="Market"<c:if test="${re.getCate1() =='Market'}">selected='selected'</c:if>>Market</option>
               <option value="Together"<c:if test="${re.getCate1() =='Together'}">selected='selected'</c:if>>Together</option>
     </select>
	</div>
	</div>
	<div class="form-group row">
      <label for="title" class="col-sm-2 col-form-label" style="position: relative; font-size:15pt; left:130px; margin-top:10px;">제목</label>
      <input type="text" class="form-control" name="title" value="${re.getTitle()}" style="background-color:#fbfbfb; width:700px; position: relative; left:95px;">
     </div>
     <div class="form-group">
      <label for="inputfile" style="position: relative; font-size:15pt; left:130px;">파일첨부</label>
      <div class="col-sm-10" style = "position: relative; left:70px; float:right;">
      <input type="file" class="form-control-file" value = "${re.getFileRealName()}" name="file" aria-describedby="fileHelp">
      <small id="fileHelp" class="form-text text-muted" style="color:red">※글과 관련된 사진만 첨부하여 주십시오.※</small>
    </div>
    </div>
    <div class="form-group">
      <label for="detail" style="position: relative; font-size:15pt; left:130px; margin-top:10px;">내용</label>
      <br>
      <textarea class="form-control" name="detail" style="background-color:#fbfbfb; height:600px; width:830px; position: relative; left:130px;">${re.getDetail()}</textarea>
    </div>
        <input type="hidden" name="number" value="${re.getNumber()}">
	</fieldset>
	<div style="position: relative; left:350px;">
	<input type="submit" class="btn btn-default" style="color:white; background-color:#68a5f3;" value="수정">
	<input type="button" class="btn btn-default" style="color:white; background-color:#68a5f3;" value="취소" onclick="cancel()">
	</div>
	 <br><br><br><br><br>
</form>
</body>
</html>