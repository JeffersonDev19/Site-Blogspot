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

<%
	Topico topico = new Topico();
	Usuario usuario = new Usuario();
	RepositorioTopico repTop = RepositorioTopico.getInstance();
	topico = repTop.getPorID(request.getParameter("xml"));

	List<Comentario> listaComentario = new ArrayList<Comentario>();
	RepositorioComentario repCom = RepositorioComentario.getInstance();
	listaComentario = repCom.getTodos();
	for (int i = 0; i < listaComentario.size(); i++) {
		if (listaComentario.get(i).getId_topico() != topico.getId()) {
			listaComentario.remove(listaComentario.get(i));
			i--;
		}
	}
	usuario = (Usuario) session.getAttribute("usuario");
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
								<div class="row">
									<div class="col-2 col-sm-2 col-md-2 col-lg-2"></div>
									<div id="mid-dashboard"
										class="col-8 col-sm-8 col-md-8 col-lg-8"
										style="text-align: center;">
										<%
											SimpleDateFormat f1 = new SimpleDateFormat("dd-MM-yyyy");
										%>
												<div id="topico-nome"
													class="col-12 col-sm-12 col-md-12 col-lg-12">Titulo: <%=topico.getTitulo()%></div>

												<div id="topico-texto"
													class="col-12 col-sm-12 col-md-12 col-lg-12">Texto: <%=topico.getTexto()%></div>
												<div id="topico-data"
													class="col-12 col-sm-12 col-md-12 col-lg-12">Data: <%=f1.format(topico.getData())%></div>

										<%
											if (usuario.getNome() != "guestxml") {
										%>
										<form action='ControllerCreateComentario' method='post'
											Style='margin-top: 10px; padding-left: 10px; padding-right: 10px; padding-top: 10px; padding-bottom: 10px; background-color: white; opacity: 0.9; border-radius: 5px;'>
											<div class='form-row'>
												<div class='form-group col-12 col-sm-12 col-md-12 col-lg-12'>
												</div>
												<input name='IDUsuario' hidden value=<%=usuario.getId()%>>
												<input name='IDTopico' hidden value=<%=topico.getId()%>>
											</div>
											<div class='form-group'>
												<label for='artxtTopico'>Novo Comentario</label>
												<textarea class='form-control' rows='5' id='texto'
													name='texto'></textarea>
											</div>
											<div class='form-row'>
												<div class='form-group col-5 col-sm-5 col-md-5 col-lg-5'></div>
												<button type='submit' class='btn btn-primary col-md-2'>Comentar
												</button>
												<div class='form-group col-5 col-sm-5 col-md-5 col-lg-5'></div>
											</div>
										</form>
										<%
											}
										%>
										<%
											for (Comentario comentario : listaComentario) {
												RepositorioUsuario repUsu = RepositorioUsuario.getInstance();
												Usuario usuarioCom = repUsu.getPorID(Integer.toString(comentario.getId_usuario_com()));
										%>
										<label for='nComentario'>Comentario</label>
										<div class="col-12 col-sm-12 col-md-12 col-lg-12">
											<div>
												<label for='autor'>Autor:
													<div><%=usuarioCom.getNome()%></div>
												</label>
											</div>
											<div>
												<label for='autor'>Comentario:
													<div><%=comentario.getTexto()%></div>
												</label>
											</div>
											<div>
												<label for='autor'>Data do Comentario:
													<div><%=f1.format(comentario.getData())%></div>
												</label>
											</div>
										</div>
										<%
											if (usuario.isPermissao()) {
										%>
										<form action="ControllerDeleteComentario" method="post"
											style="margin-left: 10px;">
											<input type="hidden" name="xml"
												value="<%=comentario.getId()%>" />
											<button id="post-button" type="submit" class='btn btn-danger'>Remover
												Comentario</button>
										</form>
										<%
											}
										%>
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