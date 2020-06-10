<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Add Periodic Element</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
<jsp:include page="menu.jsp" />
<div class="jumbotron">
	<div class="container">
		<h1 class="display-3">Add Periodic Element</h1>
	</div>
</div>
	<div class="container">
		<form name="addPerioidicElement" action="AddAction.do" method="post">
		
			<div class="form-group row">
			<label class="col-sm-2">Periodic Element Number</label>
			<div class="col-sm-3">
			<input type="text" name="number" class="form-control">
			</div>
			</div>
			
			<div class="form-group row">
			<label class="col-sm-2">Periodic Element Name</label>
			<div class="col-sm-3">
			<input type="text" name="name" class="form-control">
			</div>
			</div>
			
			<div class="form-group row">
			<label class="col-sm-2">Periodic Element Symbol</label>
			<div class="col-sm-3">
			<input type="text" name="symbol" class="form-control">
			</div>
			</div>
			
			<div class="form-group row">
			<label class="col-sm-2">Periodic Element Weight</label>
			<div class="col-sm-3">
			<input type="text" name="weight" class="form-control">
			</div>
			</div>
			
			<div class="form-group row">
			<label class="col-sm-2">Periodic Element numberOfNeutrons</label>
			<div class="col-sm-3">
			<input type="text" name="numberOfNeutrons" class="form-control">
			</div>
			</div>
			
			<div class="form-group row">
			<label class="col-sm-2">Periodic Element numberOfProtons</label>
			<div class="col-sm-3">
			<input type="text" name="numberOfProtons" class="form-control">
			</div>
			</div>
			
			<div class="form-group row">
			<label class="col-sm-2">Periodic Element numberOfElectrons</label>
			<div class="col-sm-3">
			<input type="text" name="numberOfElectrons" class="form-control">
			</div>
			</div>
			
			<div class="form-group row">
			<label class="col-sm-2">Periodic Element Period</label>
			<div class="col-sm-3">
			<select name="period" class="form-control">
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
					<option value="6">6</option>
					<option value="7">7</option>
				</select>
			</div>
			</div>
			
			<div class="form-group row">
			<label class="col-sm-2">Periodic Element Group</label>
			<div class="col-sm-3">
			<select name="period" class="form-control">
					<option value="0"></option>
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
					<option value="6">6</option>
					<option value="7">7</option>
					<option value="8">8</option>
					<option value="9">9</option>
					<option value="10">10</option>
					<option value="11">11</option>
					<option value="12">12</option>
					<option value="13">13</option>
					<option value="14">14</option>
					<option value="15">15</option>
					<option value="16">16</option>
					<option value="17">17</option>
					<option value="18">18</option>
			</select>
			</div>
			</div>
			
			<div class="form-group row">
			<label class="col-sm-2">Periodic Element Phase</label>
			<div class="col-sm-3">
				<input type="radio" name="phase" value="GAS">GAS
				<input type="radio" name="phase" value="SOLID">SOLID
				<input type="radio" name="phase" value="LIQUID">LIQUID
				<input type="radio" name="phase" value="UNKNOWN">UNKNOWN
			</div>
			</div>
			
			<div class="form-group row">
			<div class="col-sm-offset-2 col-sm-10">
			<input type="submit" class="btn btn-primary" value="Submit">
			</div>
			</div>

		</form>
	</div>
</body>
</html>