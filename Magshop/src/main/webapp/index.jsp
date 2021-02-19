<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Magazines Shop</title>
</head>
<body>

<jsp:include page="Header.jsp"></jsp:include>
<h1>Головна сторінка </h1>
<form>
	<button type = "button" onClick= "location.href = 'register.jsp'">Реєстрація</button> <br>
	<br>
	<button type = "button" onClick= "location.href = 'login.jsp'">Увійти</button>
</form>
<br>

<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>
