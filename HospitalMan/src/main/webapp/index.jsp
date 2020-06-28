<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	
	.one{
		background-color: #0c9ac9;
		height: 100px;
		border-style: solid;
		border-width: 2px;
	}
	div > h1{
		text-align: center;
		margin: 30px;
	}
	.two{
		background-color: #0c7ac9;
		height: 800px;
		border-style: solid;
		border-width: 2px;
	}
	.three{
		margin-left:auto;
		margin-right:auto;
		margin-top:130px;
		border-style: solid;
		width: 500px;
		height: 250px;
	}
	table{
		margin-left:auto;
		margin-right:auto;
		
	}
	table td{
		padding: 20px;
	}
	.four{
		text-align: center;
	}
	
</style>

</head>
<body>
	<div class="one">
		<h1>Hospital Management System</h1>
	</div>
	<div class="two">
	<form action="#" method="post">
		<div class="three">
			<p style="text-align: center; font-size: 20px; font-weight: bold">Login</p>
			<table>
				<tr>
					<td style="font-size: 18px; font-weight: bolder;">UserName</td>
					<td><input type="text" name="uname" required placeholder="username"/> </td>
				</tr>
				<tr>
					<td style="font-size: 18px; font-weight: bolder;">Password</td>
					<td><input type="password" name="pass" required placeholder="password"/></td>
				</tr>
			</table>
			
		<input type="Submit" style="border: 1px solid #eee; border-radius:20px;  background-color: black; font:bold 15px arial,sans-serif; height:40px; width:80px; color: white ; position:relative; left:100px; top:12px; " value="Login"/>
					
		
			
		</div>
	</form>
		
	</div>
	
</body>
</html>