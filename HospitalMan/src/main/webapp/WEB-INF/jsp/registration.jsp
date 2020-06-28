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
		<h3 style="text-align: center;">Patient Registration</h3>
		<form action="#" method="post">
			<table class="new">
			<tr>
				<td>Patient SSN ID:</td>
				<td class="td"><input type="number" required name="ssnId"></td>
			</tr>
			<tr>
				<td>Patient Name:</td>
				<td class="td"><input type="text" required name="name"></td>
			</tr>
			<tr>
				<td>Patient Age:</td>
				<td class="td"><input type="number" required  min="1" max="100" name="age" style="width: 160px;"></td>
			</tr>
			<tr>
				<td>Date Of Admission:</td>
				<td class="td"><input type="date" required name="dateOfAdmission"></td>
			</tr>
			<tr>
				<td>Type of Bed:</td>
				<td class="td">
					<select name="typeOfBed">
						<option value="select bed">select bed</option>
						<option value="Single">Single</option>
						<option value="Shared">Shared</option>
						<option value="General">General</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>Address:</td>
				<td class="td"><textarea rows="3" cols="25" name="address"></textarea></td>
			</tr>
			<tr>
				<td>City:</td>
				<td class="td">
					<select name="city">
						<option value="select state">select city</option>
						<option value="Delhi">Indore</option>
						<option value="Mumbai">Mumbai</option>
						<option value="Lucknow">Lucknow</option>
						<option value="Kolkata">Kolkata</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>State:</td>
				<td class="td">
					<select name="state">
						<option value="select state">select state</option>
						<option value="Madhya Pradesh">Madhya Pradesh</option>
						<option value="Maharashtra">Maharashtra</option>
						<option value="Uttar Pradesh">Uttar Pradesh</option>
						<option value="West Bengal">West Bengal</option>
					</select>
				</td>
			</tr>
			<tr>
				<td></td>
				<td></td>
			</tr>
			
			<tr>
				<td><input type="submit" style="border: 1px solid #eee; border-radius:20px;  background-color: black; font:bold 15px arial,sans-serif; height:40px; width:80px; color: white "></td>
				<td class="td"><input type="reset" style="border: 1px solid #eee; border-radius:20px;  background-color: black; font:bold 15px arial,sans-serif; height:40px; width:80px; color: white "></td>
			</tr>
		</table>
		</form>	
		
	
	</div>
	
</body>
</html>