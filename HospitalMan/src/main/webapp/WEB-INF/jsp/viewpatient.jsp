<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
		left: 500px;
	}
	
	.new td{
		padding-top: 5px;
	}
	td{
		font-size: 17px;
		font-weight: bolder;
	}
	.td{
		position: relative;
		left: 50px;
	}
	.td select{
		width: 150px;
		font-size: 15px;
		
	}
	

</style>
</head>
<body>
	<%@ include file="header.jsp" %>
	<div class="two">
		<h3 style="text-align: center;">Search Patient</h3>
		
			<table class="new">
			<tr>
				<td>Patient SSN ID:</td>
				<td class="td"><input type="number" required name="ssnid"></td>
				<td><a href="#"><button style="border: 1px solid #eee; border-radius:20px;  background-color: black; font:bold 15px arial,sans-serif; height:40px; width:80px; color: white " >Search</button></a></td>
				
			</tr>
			<tr>
				<td>Patient Name:</td>
				<td class="td"><input type="text" required name="pname" readonly></td>
			</tr>
			<tr>
				<td>Patient Age:</td>
				<td class="td"><input type="number" required  min="1" max="100" name="page" readonly style="width: 160px;"></td>
			</tr>
			<tr>
				<td>Date Of Admission:</td>
				<td class="td"><input type="date" required name="doa" readonly></td>
			</tr>
			<tr>
				<td>Type of Bed:</td>
				<td class="td"><input type="text" required name="bed" readonly></td>
			</tr>
			<tr>
				<td>Address:</td>
				<td class="td"><textarea rows="3" cols="25" name="address" readonly></textarea></td>
			</tr>
			<tr>
				<td>City:</td>
				<td class="td"><input type="text" required name="city" readonly></td>
			</tr>
			<tr>
				<td>State:</td>
				<td class="td"><input type="text" required name="state" readonly></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
			</tr>
			
			<tr>
				
			</tr>
		</table>
		
		
	
	</div>
	
</body>
</html>