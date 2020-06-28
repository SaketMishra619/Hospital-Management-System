<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	.one{
		background-color: #0c9ac9;
		height: 150px;
		border-style: solid;
		border-width: 2px;
	}
	div > h1{
		text-align: center;
		margin: 20px;
	}
	table{
		position: relative;
		left: 300px;
	}
	table td{
		padding: 15px;
	}
	
	.dropbtn {
	  background-color: #3275a8;
	  color: white;
	  padding: 16px;
	  font-size: 16px;
	  border: none;
	}

	.dropdown1 {
	  position: relative;
	  display: inline-block;
	  left: 70px;
	}
	.dropdown2{
	  position: relative;
	  display: inline-block;
	  left: 270px;
	}
	.dropdown3 {
	  position: relative;
	  display: inline-block;
	  left: 470px;
	}

	.dropdown-content {
	  display: none;
	  position: absolute;
	  background-color: #f1f1f1;
	  min-width: 160px;
	  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
	  z-index: 1;
	  font-weight: normal;
	}
	.dropdown-content a {
	  color: black;
	  padding: 12px 16px;
	  text-decoration: none;
	  display: block;
	}

	.dropdown-content a:hover {background-color: #ddd;}
	
	.dropdown1:hover .dropdown-content {display: block;}
	.dropdown1:hover .dropbtn {background-color: #323aa8;}
	
	.dropdown2:hover .dropdown-content {display: block;}
	.dropdown2:hover .dropbtn {background-color: #323aa8;}
	
	.dropdown3:hover .dropdown-content {display: block;}
	.dropdown3:hover .dropbtn {background-color: #323aa8;}	
</style>


</head>
<body>
	<div class="one">
		<h1>Hospital Management System</h1>
		<table>
		<tr>
			<td>
				<div class="dropdown1">
				  <button class="dropbtn">Patient</button>
				  <div class="dropdown-content">
				    <a href="#">Registration </a>
				    <a href="#">Update Patient </a>
				    <a href="#">Delete Patient </a>
				    <a href="#">View Patients </a>
				    <a href="#">Search Patient </a>
				  </div>
				</div>
			</td>
			
			<td>
				<div class="dropdown2">
				  <button class="dropbtn">Pharmacy</button>
				  <div class="dropdown-content">
				    <a href="#">Patient Details</a>
				    <a href="#">Medicines Issued</a>
				  </div>
				</div>
			</td>
			<td>
				<div class="dropdown3">
				  <button class="dropbtn">Diagnostics</button>
				  <div class="dropdown-content">
				    <a href="#">Diagnostic conducted</a>
				    
				  </div>
				</div>
			</td>
		</tr>
		
	</table>
		
	</div>
	
	
	
	
</body>
</html>