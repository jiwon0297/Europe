<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>Edit Periodic Element</title>
</head>
<body>

<jsp:include page="menu.jsp" />
<div class="jumbotron">
	<div class="container">
		<h1 class="display-3">Edit Periodic Element</h1>
	</div>
</div>
<div class="container">
	<div class="row">
		<div class="col-md-7">
			<form name="editPerioidicElement" action="EditAction.do" method="post">
				<div class="form-group row">
				<label class="col-sm-2">Periodic Element Number</label>
				<div class="col-sm-3"><input type="text" name="number" class="form-control" value="${pe.getNumber()}"> </div>
				</div>
				<div class="form-group row">
				<label class="col-sm-2">Periodic Element Name</label>
				<div class="col-sm-3"><input type="text" name="name" class="form-control" value="${pe.getName()}"> </div>
				</div>
				<div class="form-group row">
				<label class="col-sm-2">Periodic Element Symbol</label>
				<div class="col-sm-3"><input type="text" name="symbol" class="form-control" value="${pe.getSymbol()}"> </div>
				</div>
				<div class="form-group row">
				<label class="col-sm-2">Periodic Element Weight</label>
				<div class="col-sm-3"><input type="text" name="weight" class="form-control" value="${pe.getWeight()}"> </div>
				</div>
				<div class="form-group row">
				<label class="col-sm-2">Periodic Element NumberOfNeutrons</label>
				<div class="col-sm-3"><input type="text" name="numberOfNeutrons" class="form-control" value="${pe.getNumberOfNeutrons()}"> </div>
				</div>
				<div class="form-group row">
				<label class="col-sm-2">Periodic Element NumberOfProtons</label>
				<div class="col-sm-3"><input type="text" name="numberOfProtons" class="form-control" value="${pe.getNumberOfProtons()}"> </div>
				</div>
				<div class="form-group row">
				<label class="col-sm-2">Periodic Element NumberOfElectrons</label>
				<div class="col-sm-3"><input type="text" name="numberOfElectrons" class="form-control" value="${pe.getNumberOfElectrons()}"> </div>
				</div>
				
				<div class="form-group row">
				<label class="col-sm-2">Periodic Element Period</label>
				<div class="col-sm-3">
				<select name="period" class="form-control">
					<option value="1" <c:if test="${pe.getPeriod() ==1}">selected='selected'</c:if>>1</option>
					<option value="2" <c:if test="${pe.getPeriod() ==2}">selected='selected'</c:if>>2</option>
					<option value="3" <c:if test="${pe.getPeriod() ==3}">selected='selected'</c:if>>3</option>
					<option value="4" <c:if test="${pe.getPeriod() ==4}">selected='selected'</c:if>>4</option>
					<option value="5" <c:if test="${pe.getPeriod() ==5}">selected='selected'</c:if>>5</option>
					<option value="6" <c:if test="${pe.getPeriod() ==6}">selected='selected'</c:if>>6</option>
					<option value="7" <c:if test="${pe.getPeriod() ==7}">selected='selected'</c:if>>7</option>
				</select>
				</div>
				</div>
				
				<div class="form-group row">
				<label class="col-sm-2">Periodic Element Group</label>
				<div class="col-sm-3">
				<select name="group" class="form-control">
					<option value="0" <c:if test="${pe.getGroup() ==0}">selected='selected'</c:if>>0</option>
					<option value="1" <c:if test="${pe.getGroup() ==1}">selected='selected'</c:if>>1</option>
					<option value="2" <c:if test="${pe.getGroup() ==2}">selected='selected'</c:if>>2</option>
					<option value="3" <c:if test="${pe.getGroup() ==3}">selected='selected'</c:if>>3</option>
					<option value="4" <c:if test="${pe.getGroup() ==4}">selected='selected'</c:if>>4</option>
					<option value="5" <c:if test="${pe.getGroup() ==5}">selected='selected'</c:if>>5</option>
					<option value="6" <c:if test="${pe.getGroup() ==6}">selected='selected'</c:if>>6</option>
					<option value="7" <c:if test="${pe.getGroup() ==7}">selected='selected'</c:if>>7</option>
					<option value="8" <c:if test="${pe.getGroup() ==8}">selected='selected'</c:if>>8</option>
					<option value="9" <c:if test="${pe.getGroup() ==9}">selected='selected'</c:if>>9</option>
					<option value="10" <c:if test="${pe.getGroup() ==10}">selected='selected'</c:if>>10</option>
					<option value="11" <c:if test="${pe.getGroup() ==11}">selected='selected'</c:if>>11</option>
					<option value="12" <c:if test="${pe.getGroup() ==12}">selected='selected'</c:if>>12</option>
					<option value="13" <c:if test="${pe.getGroup() ==13}">selected='selected'</c:if>>13</option>
					<option value="14" <c:if test="${pe.getGroup() ==14}">selected='selected'</c:if>>14</option>
					<option value="15" <c:if test="${pe.getGroup() ==15}">selected='selected'</c:if>>15</option>
					<option value="16" <c:if test="${pe.getGroup() ==16}">selected='selected'</c:if>>16</option>
					<option value="17" <c:if test="${pe.getGroup() ==17}">selected='selected'</c:if>>17</option>
					<option value="18" <c:if test="${pe.getGroup() ==18}">selected='selected'</c:if>>18</option>
				</select>
				</div>
				</div>
				
				<div class="form-group row">
				<label class="col-sm-2">Periodic Element Phase</label>
				<div class="col-sm-3">
				<input type="radio" name="phase" value="GAS" <c:if test="${pe.getPhase() =='GAS'}">checked='checked'</c:if>>GAS
				<input type="radio" name="phase" value="SOLID" <c:if test="${pe.getPhase() =='SOLID'}">checked='checked'</c:if>>SOLID
				<input type="radio" name="phase" value="LIQUID" <c:if test="${pe.getPhase() =='LIQUID'}">checked='checked'</c:if>>LIQUID
				<input type="radio" name="phase" value="UNKNOWN" <c:if test="${pe.getPhase() =='UNKNOWN'}">checked='checked'</c:if>>UNKNOWN
				</div>
				</div>
				
				<div class="form-group row">
				<div class="col-sm-offset-2 col-sm-10">
				<input type="submit" class="btn btn-primary" value="Edit">
				</div>
				</div>
			</form>
		</div>
	</div>
</div>

</body>
</html>