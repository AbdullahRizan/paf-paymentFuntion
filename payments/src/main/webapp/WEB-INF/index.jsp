<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="views/bootstrap.min.css">
<script src="components/jquery-3.2.1.min.js"></script>
<script src="components/main.js"></script>
<head>
<meta charset="ISO-8859-1">
<title>Do payment your payments </title>
</head>
<body>
<div class="container"> 
 <div class="row">
 <div class="col-8"> 
 <h1 class="m-3">Enter your payment details</h1> 
 <form id="formStudent"> 
 </form>
 </div>
 </div>
 
 <br> 
 <div class="row">
 <div class="col-12" id="colStudents">
 
 </div>
 </div>
</div>
<div class="input-group input-group-sm mb-3">
<div class="input-group-prepend">
 <span class="input-group-text" id="lblName">amount : </span>
</div>
<input type="text" id="txtamount" name="txtamount">
</div>

<div class="input-group input-group-sm mb-3">
<div class="input-group-prepend">
 <span class="input-group-text" id="lblName">Card Name : </span>
</div>
<input type="text" id="txtCardName" name="txtCardName">
</div>

<div class="input-group input-group-sm mb-3">
<div class="input-group-prepend">
 <span class="input-group-text" id="lblNumber">Card Number : </span>
</div>
<input type="text" id="txtCardNumber" name="txtCardNumber">
</div>

<div class="input-group input-group-sm mb-3">
<div class="input-group-prepend">
 <span class="input-group-text" id="lblType">Year: </span>
</div>
<select id="ddlType" name="ddlType">
 <option value="0">--Select the card Type--</option>
 <option value="1">VISA</option>
 <option value="2">MASTER</option>
</select>
</div>
<div id="alertSuccess" class="alert alert-success"></div>
<div id="alertError" class="alert alert-danger"></div>
<input type="button" id="btnSave" value="Save" class="btn btn-primary">


<div class="row">
<div class="col-12" id="colStudents">
 
</div>
</div>


</body>
</html>