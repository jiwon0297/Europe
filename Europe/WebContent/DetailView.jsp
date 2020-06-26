<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function deleteConfirm(number, country, category){
		if(confirm("정말로 이 글을 삭제하시겠습니까? 삭제하면 되돌릴 수 없습니다.")==true)
			location.href = "DeleteAction.do?number=" + number + "&&country=" + country + "&&cate1=" + category;
		else
			return;	
	}
	
	var httpRequest = null;
    
    // httpRequest 객체 생성
    function getXMLHttpRequest(){
        var httpRequest = null;
    
        if(window.ActiveXObject){
            try{
                httpRequest = new ActiveXObject("Msxml2.XMLHTTP");    
            } catch(e) {
                try{
                    httpRequest = new ActiveXObject("Microsoft.XMLHTTP");
                } catch (e2) { httpRequest = null; }
            }
        }
        else if(window.XMLHttpRequest){
            httpRequest = new window.XMLHttpRequest();
        }
        return httpRequest;    
    }
    
    // 댓글 등록
    function writeCmt()
    {
        var form = document.getElementById("writeCommentForm");
        
        var board = form.number.value;
        var id = form.comment_id.value;
        var content = form.comment_content.value;
        
        if(!content)
        {
            alert("내용을 입력하세요.");
            return false;
        }
        else
        {    
            var param="number="+board+"&comment_id="+id+"&comment_content="+content;
                
            httpRequest = getXMLHttpRequest();
            httpRequest.onreadystatechange = checkFunc;
            httpRequest.open("POST", "CommentWriteAction.co", true);    
            httpRequest.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded;charset=utf-8'); 
            httpRequest.send(param);
        }
    }
    
    function checkFunc(){
        if(httpRequest.readyState == 4){
            // 결과값을 가져온다.
            var resultText = httpRequest.responseText;
            if(resultText == 1){ 
                document.location.reload(); // 상세보기 창 새로고침
            }
        }
    }
    
    function cmDeleteOpen(comment_num){
    	var msg = confirm("댓글을 삭제하시겠습니까?");
    	
    	if(msg==true){
    		deleteCmt(comment_num);
    	}
    	else{
    		return false;
    	}
    }
    
    function deleteCmt(comment_num)
    {
        var param="comment_num="+comment_num;
        
        httpRequest = getXMLHttpRequest();
        httpRequest.onreadystatechange = checkFunc;
        httpRequest.open("POST", "CommentDeleteAction.co", true);    
        httpRequest.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded;charset=EUC-KR'); 
        httpRequest.send(param);
    }
    
 // 댓글 수정창
    function cmUpdateOpen(comment_num){
        window.name = "parentForm";
        window.open("CommentUpdateFormAction.co?num="+comment_num,
                    "updateForm", "width=570, height=350, resizable = no, scrollbars = no");
    }


</script>
</head>
<body>
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
   		<img src="upload/${re.getFileRealName()}" onerror="this.remove? this.remove() : this.removeNode();" />
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
    
    <br><br><br>
    <!-- 댓글 부분 -->
    <div id="comment" style="position:relative; left:340px;">
        <table border="1" bordercolor="lightgray">
    <!-- 댓글 목록 -->    
    <c:if test="${requestScope.commentList != null}">
        <c:forEach var="comment" items="${requestScope.commentList}">
            <tr>
                <!-- 아이디, 작성날짜 -->
                <td width="150">
                    <div>
                        <p style="text-align:center">${comment.id}</p>
                        <p style="margin-top:-24px; margin-bottom:-8px; position:relative; left:80px; font-size:9pt; color:lightgray">${comment.reg}</p>
                    </div>
                </td>
                <!-- 본문내용 -->
                <td width="550">
                    <div class="text_wrapper">
                        <p style="margin-bottom:-4px; position:relative; left:10px;">${comment.content}</p>
                    </div>
                </td>
                <!-- 버튼 -->
                <td width="100">
                    <div id="btn" style="text-align:center;">
                    <!-- 댓글 작성자만 수정, 삭제 가능하도록 -->    
                    <c:if test="${userID == comment.id}">
                        <a href="#" onclick="cmUpdateOpen(${comment.num})">수정</a> |    
                        <a href="#" onclick="cmDeleteOpen(${comment.num})">삭제</a>
                    </c:if>        
                    </div>
                </td>
            </tr>
        </c:forEach>
    </c:if>
            <c:if test="${userID == null }">
            <tr bgcolor="#F5F5F5">
            <td width="150">
            	<div style="text-align:center">댓글</div>
            </td>
            <td width = "550">
            	<div>
            		<textarea rows="4" cols="70">로그인을 해야 작성이 가능합니다.</textarea>
            	</div>
            </td>
            <td width="100">
            	<div style="text-align:center">작성</div>
            </td>
            </c:if>
            <!-- 로그인 했을 경우만 댓글 작성가능 -->
            <c:if test="${userID !=null}">
            <tr bgcolor="#F5F5F5">
            <form id="writeCommentForm">
                <input type="hidden" name="number" value="${re.getNumber()}">
                <input type="hidden" name="comment_id" value="${userID}">
                <!-- 아이디-->
                <td width="150">
                	<div style="text-align:center">
                       <i class="fa fa-user w3-padding-16"></i> ${userID}
                    </div>
                </td>
                <!-- 본문 작성-->
                <td width="550">
                    <div>
                        <textarea name="comment_content" rows="4" cols="100" ></textarea>
                    </div>
                </td>
                <!-- 댓글 등록 버튼 -->
                <td width="100">
                    <div id="btn" style="text-align:center;">
                    	<a href="#" onclick="writeCmt()">댓글등록</a>  
                    </div>
                </td>
            </form>
            </tr>
            </c:if>
    
        </table>
    </div> 
      
     <br><br><br><br><br>

</body>
</html>