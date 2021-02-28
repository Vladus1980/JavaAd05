$(function() {

    $('#login-form-link').click(function(e) {
		$("#login-form").delay(100).fadeIn(100);
 		$("#register-form").fadeOut(100);
		$('#register-form-link').removeClass('active');
		$(this).addClass('active');
		e.preventDefault();
	});
	$('#register-form-link').click(function(e) {
		$("#register-form").delay(100).fadeIn(100);
 		$("#login-form").fadeOut(100);
		$('#login-form-link').removeClass('active');
		$(this).addClass('active');
		e.preventDefault();
	});

});

function loginRegisterSwitch() {
	$('form').animate({
		height : "toggle",
		opacity : "toggle"
	}, "slow");
}

function showAlertAfterRegistration() {
	$('div.alert.alert-success').show();
}

$('.message a').click(function() {
	loginRegisterSwitch();
});

$("input.register-submit").click(function()
			{
			var user_firstname = $("form.register-form input.user_firstname").val();
			var user_lastname = $("form.register-form input.user_lastname").val();
			var user_email = $("form.register-form input.user_email").val();
			var user_pass = $("form.register-form input.user_pass").val();
			
			if(user_firstname == '' || user_lastname =='' || user_email == '' || user_pass == ''){
				alert('Заповніть всі поля!');
			}else if(user_pass.length<8){
				alert('Пароль має складатися не меньше ніж 8 символів!');
			}else{
			var userRegistration = {
				user_firstname : user_firstname,
				user_lastname : user_lastname,
				user_email : user_email,
				user_pass : user_pass
				};
				$.post("registration", userRegistration,
					function(data){
						if (data == 'Success'){
							$("form")[0].reset();
							$("form")[1].reset();
							loginRegisterSwitch();
							showAlertAfterRegistration();
							}
					});
				}
			});
$("button.login").click(function() {
	var user_email = $("form.login-form input.user_email").val();
	var user_pass = $("form.login-form input.user_pass").val();

	if (user_email == '' || user_pass == '') {
		alert("Please fill login form!");
	} else {
		var userLogin = {
			user_email : user_email,
			user_pass : user_pass
		};

		$.post("login", userLogin, function(data) {
			if(data !== ''){
				var customUrl = '';
				var urlContent = window.location.href.split('/');
				for (var i = 0; i < urlContent.length-1; i++) {
					customUrl+=urlContent[i]+'/'
				}
				customUrl+=data.destinationUrl;
				window.location = customUrl;
			}
			$("form")[1].reset();
		});
	}
});