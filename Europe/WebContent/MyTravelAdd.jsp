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
    
    
        function addTravel()
        {
            var form = document.getElementById("mytraveladd");
            
            var country = form.country.value;
            var id = form.userid.value;
            var nights = form.nights.value;
            var days = form.days.value;
            var traveldate = form.traveldate.value;
            
            if(!nights)
            {
                alert("빈칸을 채워주세요.");
                return false;
            }
            else if(!days)
            {
                alert("빈칸을 채워주세요.");
                return false;
            }
            else if(!traveldate)
            {
                alert("빈칸을 채워주세요.");
                return false;
            }
            else
            {    
                var param="country="+country+"&id="+id+"&nights="+nights+"&days="+days+"&traveldate="+traveldate;
                    
                httpRequest = getXMLHttpRequest();
                httpRequest.onreadystatechange = checkFunc;
                httpRequest.open("POST", "MyTravelAddAction.co", true);    
                httpRequest.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded;charset=utf-8'); 
                httpRequest.send(param);
            }
        }
        
        function checkFunc(){
            if(httpRequest.readyState == 4){
                // 결과값을 가져온다.
                var resultText = httpRequest.responseText;
                if(resultText == 1){
                    if (opener != null) {
                        // 부모창 새로고침
                        window.opener.document.location.reload(); 
                        opener.travelAddForm = null;
                        self.close();
                    }
                }
            }
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
		<form name="mytraveladd" target="mytravelForm">
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
  			<input type="date" name="traveldate" min="2020-06-01">
  			</div>
  			<br>
  			<br>
  			<div class="form-group row">
  			<input type="button" value="추가" style="background-color:skyblue; border: 1px solid skyblue;" onclick="addTravel()">
            <input type="button" value="취소" style="background-color:skyblue; border: 1px solid skyblue;" onclick="window.close()">
            </div>
 		</form>
 		</div>
 		</div>	 
</body>
</html>