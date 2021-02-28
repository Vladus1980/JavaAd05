<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cabinet</title>


<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">

<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.2.0/css/all.css"
	integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ"
	crossorigin="anonymous">
	<link rel="stylesheet" href="css/register.css">
<link rel="stylesheet" href="css/header.css">
</head>
<body>
	<h1>Welcome to the cabinet ${userEmail}</h1>
	<jsp:include page="Header.jsp"></jsp:include>

	<div class="container-fluid">
		<div class="row">

			<form class="createMagazine" action="ProductController" method="post" role="form">
				<div class="form-group">
					<input type="text" name="magazine_name" class="form-control magazine_name" 
						placeholder="Введіть назву журналу" value="">
				</div>

				<div class="form-group">
					<input type="text" name="magazine_pages" class="form-control magazine_pages" 
						placeholder="Введіть кількість сторінок" value="">
				</div>

				<div class="form-group">
					<input type="number" name="magazine_price" class="form-control magazine_price" 
						placeholder="Введіть ціну" value="">
				</div>

				<button class="btn btn-primary createMagazine">Submit</button>
			</form>

		</div>

	</div>



	<jsp:include page="Footer.jsp"></jsp:include>

	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"
		integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"
		integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
	<script src="js/header.js"></script>
	<script src="js/serverCalls.js"></script>
</body>
</html>