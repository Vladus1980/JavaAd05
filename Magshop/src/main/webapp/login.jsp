<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Magazines Shop login</title>
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>
<h1>Сторінка входу</h1>
<form action="LoginServlet" metod="post">

<input name= "login" type= "text" placeholder="Введіть email">
<br>
<br>
<input name = "pass" type= "text" placeholder="Введіть пароль">
<br>
<br>
<input type = "submit" value="Увійти">

</form>


<jsp:include page="Footer.jsp"></jsp:include>

</body>
</html>