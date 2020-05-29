<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="AddAction.do" method="post" style ="margin:0 auto; width:1000px;">
	<fieldset>
	<div class="form-group row">
      <label for="Category" class="col-sm-2 com-form-label">게시판</label>
      <div class="col-sm-10">
      <select name="country" style="width:150px; float:left;">
					<option>korea</option>
					<option>england</option>
					<option>france</option>
					<option>swiss</option>
					<option>germany</option>
					<option>hungary</option>
					<option>czech</option>
					<option>italy</option>
	  </select>
	  <select name="cate1" style="width:150px; float:left;">
					<option>information</option>
					<option>market</option>
					<option>together</option>
	  </select>
	</div>
	</div>
	<div class="form-group row">
      <label for="title" class="col-sm-2 col-form-label">제목</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" id="title" placeholder="제목을 입력해주세요." style="width:900px;">
      </div>
     </div>
     <div class="form-group">
      <label for="inputfile">파일첨부</label>
      <div class="col-sm-10" style = "float:right;">
      <input type="file" class="form-control-file" id="inputfile" aria-describedby="fileHelp">
      <small id="fileHelp" class="form-text text-muted">글과 관련된 사진만 첨부하여 주십시오.</small>
    </div>
    </div>
    <div class="form-group">
      <label for="detail">내용</label>
      <textarea class="form-control" id="content" rows="15" placeholder="내용을 입력해주세요." ></textarea>
    </div>
	</fieldset>
	<div class="button">
	<input type="submit" class="btn btn-primary" value="글쓰기">
	<input type="reset" class="btn btn-primary" value="취소" onclick="location='main.jsp'">
	</div>
</form>
</body>
</html>