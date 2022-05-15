package payments;
import java.sql.*; 


public class paymentDetailsAPI {
	<%@page import="com.Item"%>
	<%@ page language="java", contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<!DOCTYPE html>
	<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Items Management</title>
	<link rel="stylesheet" href="Views/bootstrap.min.css">
	<script src="Components/jquery-3.2.1.min.js"></script>
	<script src="Components/items.js> </script>
	</head>
	<body> 
	<div class="container"><div class="row"><div class="col-6"> 
	<h1>Items Management V10.1</h1>
	<form id="formItem" name="formItem">
	 Item code: 
	 <input id="amount" name="amount" type="text" 
	 class="form-control form-control-sm">
	 <br> Item name: 
	 <input id="cardName" name="cardName" type="text" 
	 class="form-control form-control-sm">
	 <br> Item price: 
	 <input id="cardNumber" name="cardNumber" type="text" 
	 class="form-control form-control-sm">

	 <br>
	 <input id="btnSave" name="btnSave" type="button" value="Save" 
	 class="btn btn-primary">
	 <input type="hidden" id="hidItemIDSave" 
	 name="hidItemIDSave" value="">
	</form>
	<div id="alertSuccess" class="alert alert-success"></div>
	<div id="alertError" class="alert alert-danger"></div>
	<br>
	<div id="divItemsGrid">
	 <%
	 Item itemObj = new Item(); 
	 out.print(itemObj.readItems()); 
	 %>
	</div>
	</div> </div> </div> 
	</body>
	
	</html>

}
