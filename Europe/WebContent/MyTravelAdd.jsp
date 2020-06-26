<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MyTravelAdd</title>
<style type="text/css">
        #wrap {
            width: 550px;
            margin: 0 auto 0 auto;
            text-align :center;
        }
    
</style>
<script type="text/javascript">

        function chk(){
        	document.mytraveladd.submit();
        	window.close();
        }
    
    </script>
</head>
<body style="background-color:#fbfbfb">
<% request.setCharacterEncoding("utf-8"); %>
<div id="wrap">
<br>
<b><font size="5" color="skyblue">여행 추가</font></b>
<hr size="1" width="550" color="skyblue">
<br>
	<div id="MyTravelAddForm">
		<form name="mytraveladd" action="MyTravelAddAction.do" method="POST" target="mytravelForm">
			<input type="hidden" name="userid" value="${userID}">
			<div class="form-group row">
 		   	<label for="Category" class="col-sm-2 com-form-label" style="font-size:12pt;">나라 선택</label>
      		<select name="country" style="background-color:white; width:150px; float:right; position:relative; right:150px">
					<option>Korea</option>
					<option>England</option>
					<option>France</option>
					<option>Swiss</option>
					<option>Germany</option>
					<option>Hungary</option>
					<option>Czech</option>
					<option>Italy</option>
	 		 </select>
	 		 </div>
	 		 <br>
	 		 <div class="form-group row">
  			<input type="number" name="nights" min="1" max="50" style="width:40px">박 <input type="number" name="days" min="2" max="50" style="width:40px">일
  			</div>
  			<br>
  			<div class="form-group row">
  			<label for="Category" class="col-sm-2 com-form-label" style="font-size:12pt;">출발 일자</label>
  			<input type="date" name="travelDate" min="2020-06-01">
  			</div>
  			<br>
  			<br>
  			<div class="form-group row">
  			<input type="button" value="추가" style="background-color:skyblue; border: 1px solid skyblue;" onclick="chk()">
            <input type="button" value="취소" style="background-color:skyblue; border: 1px solid skyblue;" onclick="window.close()">
            </div>
 		</form>
 		</div>
 		</div>	 
</body>
</html>