<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Magazines Shop register</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<link rel="stylesheet" href="css/register.css">
<link rel="stylesheet" href="css/header.css">

</head>
<body>
<script type="text/javascript" src = "js/register.js"></script>
	<jsp:include page="Header.jsp"></jsp:include>
	
	<div class="container">
    	<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-login">
					<div class="panel-heading">
						<div class="row">
							<div class="col-xs-6">
								<a href="#" class="active" id="login-form-link">Login</a>
							</div>
							<div class="col-xs-6">
								<a href="#" id="register-form-link">Register</a>
							</div>
						</div>
						<hr>
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
								<form id="login-form" action="LoginServlet" method="post" role="form" style="display: block;">
									<div class="form-group">
										<input type="text" name="user_email" id="email" tabindex="1" class="form-control" placeholder="Email" value="">
									</div>
									<div class="form-group">
										<input type="password" name="user_pass" id="password" tabindex="2" class="form-control" placeholder="Пароль">
									</div>
									<div class="form-group text-center">
										<input type="checkbox" tabindex="3" class="" name="remember" id="remember">
										<label for="remember"> Remember Me</label>
									</div>
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<input type="submit" name="login-submit" id="login-submit" tabindex="4" class="form-control btn btn-login" value="Log In">
											</div>
										</div>
									</div>
									<div class="form-group">
										<div class="row">
											<div class="col-lg-12">
												<div class="text-center">
													<a href="https://phpoll.com/recover" tabindex="5" class="forgot-password">Forgot Password?</a>
												</div>
											</div>
										</div>
									</div>
								</form>
								<form id="register-form" action="RegistrationServlet" method="post" role="form" style="display: none;">
									<div class="form-group">
										<input type="text" name="user_firstname" id="username" tabindex="1" class="form-control" placeholder="Введіть ім'я" value="">
									</div>
									<div class="form-group">
										<input type="text" name="user_lastname" id="username" tabindex="1" class="form-control" placeholder="Введіть прізвище" value="">
									</div>
									<div class="form-group">
										<input type="email" name="user_email" id="email" tabindex="1" class="form-control" placeholder="Введіть Email" value="">
									</div>
									<div class="form-group">
										<input type="password" name="user_pass" id="password" tabindex="2" class="form-control" placeholder="Введіть пароль">
									</div>
									<div class="form-group">
										<input type="password" name="confirm-password" id="confirm-password" tabindex="2" class="form-control" placeholder="Введіть пароль ще раз">
									</div>
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<input type="submit" name="register-submit" id="register-submit" tabindex="4" class="form-control btn btn-register" value="Register Now">
											</div>
										</div>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>



	<jsp:include page="Footer.jsp"></jsp:include>

</body>
</html>