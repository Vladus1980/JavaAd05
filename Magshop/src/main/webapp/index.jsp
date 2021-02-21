<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<link rel="stylesheet" href="css/register.css">
<title>Magazines Shop</title>
</head>
<body>

<jsp:include page="Header.jsp"></jsp:include>
<h1>Головна сторінка </h1>
<form>
	<button type = "button" onClick= "location.href = 'register.jsp'">Реєстрація/Увійти</button> <br>
	
</form>
<br>

<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>
