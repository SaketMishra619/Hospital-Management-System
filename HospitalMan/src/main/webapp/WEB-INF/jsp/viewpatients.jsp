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
		left: 390px;
		border: 2px solid ;
		
	}
	.td{
		position: relative;
		border: 1px solid;
		font-size: large;
	}
</style>
</head>
<body>
	<%@ include file="header.jsp" %>
		<div class="two">
		<h3 style="text-align: center;">View Patients</h3>
		<table class="new">
			<tr>
				<th class="td">Patient SSN ID</th>
				<th class="td">Patient Name</th>
				<th class="td">Patient Age</th>
				<th class="td">Address</th>
				<th class="td">DOA</th>
				<th class="td">Type of Room</th>
			</tr>
		
		<%--<c:forEach items="${list}" var="patient"> --%> 
			<tr>
				<td class="td">1</td>
				<td class="td">a</td>
				<td class="td">10</td>
				<td class="td">berlington road delhi</td>
				<td class="td">2-10-2020</td>
				<td class="td">Shared</td>
			</tr>
		<%--</c:forEach> --%>	
		</table>
		
	</div>
	
</body>
</html>