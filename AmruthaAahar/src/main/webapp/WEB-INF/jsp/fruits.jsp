<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Retail</title>
</head>
<body style="background-color:lightgreen">
<hr>
<center>
<h1 style="color:red">AMRUTHA AAHAR</h1>
<hr>
<br>
<br>
<br>
<h2 style="color:blue">"Amrutha Aahar"</h2>
<h3>(AA)</h3>
where the natural food grows!
<br>
<br>
<a href ="/home"><button style="background-color:blue;color:white">HOME</button></a>
&nbsp;&nbsp;
<a href ="/veggies"><button style="background-color:blue;color:white">VEGGIES</button></a>
&nbsp;&nbsp;
<a href ="/fruits"><button style="background-color:blue;color:white">FRUITS</button></a>
&nbsp;&nbsp;
<a href ="/createVeggies"><button style="background-color:blue;color:white">CREATE FRUITS</button></a>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href ="/home"><button style="background-color:blue;color:white">LOGOUT</button></a>
<br>
<br>
<br>
<h3>Fruits Details</h3>
</center>
<!-- <table border=2 width=100%>
<tr><td>S.NO.</td><td>FRUITS</td><td>COST</td></tr>
<tr><td>1.</td><td>Mango</td><td>50</td></tr>
<tr><td>2.</td><td>Watermelon</td><td>60</td></tr>
<tr><td>3.</td><td>Guava</td><td>45</td></tr>
</table>
-->
<table border=2 width=100%>
<tr><td>S.No.</td><td>Fruits</td><td>Cost/Kg</td><td>Action</td></tr>
<c:forEach items="${fruitsList}" var="fruits">
<tr><td>${fruits.fID}</td><td>${fruits.fName}</td><td>${fruits.fCost}</td><td><a href="/deleteFruits/${fruits.fID}"><button>Delete</button></a></td></tr>
</c:forEach>
</table> 
<br>
<br>
<br>
<br>
<br>
<br>
<hr>
<center>@copyrighSangeethasolution</center>
<hr>
</body>

</body>
</html>