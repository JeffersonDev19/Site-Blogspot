<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%
	session.invalidate();
%>

<html>
<head>
<link
	href="https://fonts.googleapis.com/css?family=ZCOOL+QingKe+HuangYou"
	rel="stylesheet">
<link rel="stylesheet" type="text/css" href="css/sheet.css"
	media='screen and (color)' />
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">

<title>Blog</title>
</head>
<body style="font-family: 'ZCOOL QingKe HuangYou', cursive;">
	<div class="container-fluid">
		<div class="row">
			<div class="col-12 col-sm-12 col-md-12 col-lg-12">
				<div id="upper-line" class="row">
					<div class="col-4 col-sm-4 col-md-4 col-lg-4"></div>
					<div class="col-4 col-sm-4 col-md-4 col-lg-4"
						style="text-align: center;">
						<img alt="" src="img/logo.png" height="70" width="auto">
					</div>
					<div class="col-4 col-sm-4 col-md-4 col-lg-4"></div>
				</div>
				<div id="top-mid-line" class="row"></div>
				<div id="mid-line" class="row">
					<div id="mid-body" class="col-12 col-sm-12 col-md-12 col-lg-12">
						<div class="row">
							<div id="mid-box" class="col-12 col-sm-12 col-md-12 col-lg-12">
							<div id="xinzhao"><img src="img/xz.png" alt="" style="width: 150px; height: 100px;">
							<span id="fala">Olá, sou o Xin Zhao, seja bem vindo ao mundo de Demacia</span>
							</div>
							<div id="jarvan"><img src="img/jarvan.png" alt="" style="width: 150px; height: 100px;">
							<span id="fala">Jarvan esta aqui para ajudar!</span>
							</div>
								<div class="row">
									<div id="mid-form" class="col-12 col-sm-12 col-md-12 col-lg-12"
										style="text-align: center;">
										<form action='ControllerLogin' method='post'
											style="margin-top: 10px; padding-left: 10px; padding-right: 10px; padding-top: 10px; padding-bottom: 10px; background-color: white; opacity: 0.9; border-radius: 5px;">
											<div class='form-row'>
												<div class='form-group col-6 col-sm-6 col-md-6 col-lg-6'>
													<label for='lbl_email'>Login</label> <input type='text'
														class='form-control' id='nome' name='nome'
														placeholder='Nome'>
												</div>
												<div class='form-group col-6 col-sm-6 col-md-6 col-lg-6'>
													<label for='lbl_senha'>Senha</label> <input type='password'
														class='form-control' id='senha' name='senha'
														placeholder='Senha'>
												</div>
											</div>
											<div class='form-row'>
												<div class='form-group col-5 col-sm-5 col-md-5 col-lg-5'></div>
												<button type='submit' class='btn btn-primary col-md-2'>Logar</button>
												<div class='form-group col-5 col-sm-5 col-md-5 col-lg-5'></div>
											</div>
										</form>


										<button id="button" type="button" class="btn btn-success"
											style="margin-top: 10px;">Cadastrar</button>
										<a href="home.jsp"><button id="button" type="button"
												class="btn btn-success" style="margin-top: 10px;">Logar
												como convidado</button></a>
									</div>
									<div class="col-3 col-sm-3 col-md-3 col-lg-3"></div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>

<script type="text/javascript" src="js/jquery-3.3.1.slim.min.js"></script>
<script type="text/javascript" src="js/popper.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script type="text/javascript" src="js/script.js"></script>

</html>