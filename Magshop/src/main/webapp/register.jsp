<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Magazines Shop register</title>
</head>
<body>
	<jsp:include page="Header.jsp"></jsp:include>
	<h1>Реєстрація</h1>

	<form action="RegistrationServlet" method="post">
		<input name="user_firstname" type="text" placeholder="Введіть ім'я">
		<br> <br> <input name="user_lastname" type="text"
			placeholder="Введіть прізвище"> <br> <br>

		 <input name="user_email" type="text"
			placeholder="Введіть електронну адресу"> <br> <br> <input
			name="user_pass" type="text" placeholder="Введіть пароль"> <br>
		<br>
		<p>Користувач
		<input name="user_level" type="radio" id="user" checked></p>
		<p>Адміністратор
		<input name="user_level" type="radio" id="admin"></p>
		<br>
		<br>
		<input type="submit" value = "Зареєструватися">
		
	</form>


	<jsp:include page="Footer.jsp"></jsp:include>

</body>
</html>