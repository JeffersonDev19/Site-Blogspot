<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="model.Usuario"%>
<%@page import="model.Topico"%>
<%@page import="model.Comentario"%>
<%@page import="repositories.RepositorioTopico"%>
<%@page import="repositories.RepositorioComentario"%>
<%@page import="repositories.RepositorioUsuario"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

<!DOCTYPE html>
<%	boolean sessao = (Boolean) session.getAttribute("permissao");
	if(!sessao){
		request.getRequestDispatcher("home.jsp").include(request, response);
	}
%>

<%
	RepositorioUsuario repUsu = RepositorioUsuario.getInstance();
	List<Usuario> listaUsuario = new ArrayList<Usuario>();
	listaUsuario.addAll(repUsu.getTodos());
	for (int i = 0; i < listaUsuario.size(); i++) {
		if (listaUsuario.get(i).isPermissao()) {
			listaUsuario.remove(listaUsuario.get(i));
			i--;
		}
	}
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
										class="col-8 col-sm-8 col-md-8 col-lg-8"
										style="text-align: center;">
										<%
											for (Usuario usuario : listaUsuario) {
										%>
										<label for='nComentario'>Novo Comentario</label>
										<div class="col-12 col-sm-12 col-md-12 col-lg-12">
											<div>
												<label for='autor'>Usuario:
													<div><%=usuario.getNome()%></div>
												</label>
											</div>
											<form action="ControllerDelete" method="post"
												style="margin-left: 10px;">
												<input type="hidden" name="nome"
													value="<%=usuario.getNome()%>" />
												<button id="post-button" type="submit"
													class='btn btn-danger'>Remover Usuario</button>
											</form>
										</div>
										<%
											}
										%>
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