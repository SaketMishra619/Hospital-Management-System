<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <spring:url value="/resources/s.png" var="s" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
		.two{
		background-color: #0c7ac9;
		height: 800px;
		border-style: solid;
		border-width: 2px;
		
	}
	.new{
		align-content: center;
		position: relative;
		left: 350px;
		border: 2px solid ;
		border: collapse;
		
	}
	.td{
		position: relative;
		border: 1px solid;
		font-size: large;
		}
	.new1{
		align-content: center;
		position: relative;
		left: 580px;
		border: 2px solid ;
		border: collapse;
		
	}
	
	
</style>

</head>
<body>
	<%@ include file="header.jsp" %>
	<div class="two">
		<h3 style="text-align: center;">Pharmacy</h3>
		<table class="new">
			<tr>
				<th class="td">Patient Id</th>
				<th class="td">Patient Name</th>
				<th class="td">Patient Age</th>
				<th class="td">Address</th>
				<th class="td">DOA</th>
				<th class="td">Type of Room</th>
			</tr>
			<tr>
				<td class="td"><a href="#"><img src="${s }" style="width: 20px;style="background-color:#0c7ac9 ;"></a><input type="text" style="background-color:#0c7ac9 ;"></td>
				<td class="td"></td>
				<td class="td"></td>
				<td class="td"></td>
				<td class="td"></td>
				<td class="td"></td>
			</tr>
		</table>
		<br><br><br>
		<h3 style="text-align: center;">Medicines Issued</h3>
		
		<table class="new1">
			<tr>
				<th class="td">Medicine</th>
				<th class="td">Quantity</th>
				<th class="td">Rate</th>
				<th class="td">Amount</th>
				
			</tr>
			<tr>
				<td class="td"></td>
				<td class="td"></td>
				<td class="td"></td>
				<td class="td"></td>
			</tr>
		</table>
		
		<br><br><br><br>
		
		<a href="#"><button style="position: relative;left: 700px;
		border: 1px solid #eee; border-radius:10px; 
		background-color: black; font:bold 15px arial,sans-serif;
	    height:40px; width:80px; color: white " >Issue Medicine</button></a>
		
	</div>	
</body>
</html>