<%@page import="repositories.RepositorioTopico"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="model.Usuario"%>
<%@page import="model.Topico"%>
<%@page import="java.text.SimpleDateFormat"%>


<!DOCTYPE html>

<%
	Usuario usuario = (Usuario) session.getAttribute("usuario");
	RepositorioTopico repTopico = RepositorioTopico.getInstance();

	Topico topico = repTopico.getPorID(request.getParameter("xml"));
%>
<html>
<head>
<link href="https://fonts.googleapis.com/css?family=ZCOOL+QingKe+HuangYou" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="css/sheet.css" media='screen and (color)'/>
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
								<div class="row">
									<div class="col-2 col-sm-2 col-md-2 col-lg-2"></div>
									<div id="mid-dashboard"
										class="col-8 col-sm-8 col-md-8 col-lg-8">
										<form action='ControllerEditTopico' method='post'
											Style='padding-left: 10px; padding-right: 10px; padding-top: 10px; padding-bottom: 10px; background-color: white; opacity: 0.9; border-radius: 5px;'>
											<div class='form-row'>
												<div class='form-group col-12 col-sm-12 col-md-12 col-lg-12'>
													<label for='lbl_titulo'>Titulo: <%=topico.getTitulo()%></label> <input type='text'
														class='form-control' id='titulo' name='titulo'
														placeholder='Novo Titulo'>
												</div>
												<input name='IDUsuario' hidden value=<%=usuario.getId()%>>
											</div>
											<div class='form-group'>
												<label for='artxtTopico'>Novo Topico</label> <input
													name="IDtopico" hidden value=<%=topico.getId()%>>
												<textarea class='form-control' rows='5' id='texto'
													name='texto'><%=topico.getTexto()%></textarea>
											</div>
											<div class='form-row'>
												<div class='form-group col-5 col-sm-5 col-md-5 col-lg-5'></div>
												<button type='submit' class='btn btn-primary col-md-2'>Confirmar
												</button>
												<div class='form-group col-5 col-sm-5 col-md-5 col-lg-5'></div>
											</div>
										</form>
									</div>
									<div class="col-2 col-sm-2 col-md-2 col-lg-2"></div>
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