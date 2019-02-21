<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="model.Usuario"%>
<%@page import="model.Topico"%>
<%@page import="repositories.RepositorioTopico"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.text.SimpleDateFormat"%>

<!DOCTYPE html>

<%
	Usuario usuario = new Usuario();
	List<Topico> listaTopico = new ArrayList<Topico>();
	RepositorioTopico repTop = RepositorioTopico.getInstance();
	listaTopico.addAll(repTop.getTodos());
	if (session.isNew()) {
		usuario.setNome("guestxml");
		usuario.setApelido("guestxml");
		usuario.setEmail("guest@guest");
		usuario.setId(-1);
		usuario.setPermissao(false);
		session.setAttribute("usuario", usuario);
	} else if (!session.isNew()) {
		usuario = (Usuario) session.getAttribute("usuario");
	}
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
									<div id="mid-form" class="col-8 col-sm-8 col-md-8 col-lg-8"
										hidden style="text-align: center; margin-top: 10px;"></div>
									<div id="mid-dashboard"
										class="col-8 col-sm-8 col-md-8 col-lg-8"
										style="text-align: center; margin-top: 10px; padding-bottom:10px;">
										<div id="first-row" style="height: 50px; font-size: 26px;">
											Olá seja bem vindo usuário
											<%=usuario.getApelido()%></div>
										<%
											if (usuario.isPermissao() == true) {
										%>
										<a href="criarpost.jsp"><button id="post-button"
												class='btn btn-primary'>Nova Postagem</button></a>
										<form action="ControllerGerencia" method="post"
											style="margin-top: 10px;">
											<input type="hidden" name="udp" value="<%=usuario.getNome()%>" />
											<button id="post-button" type="submit" class='btn btn-danger'>Gerenciar
												Usuários</button>
										</form>
										<%
											}
										%>

										<%
											for (Topico topico : listaTopico) {
										%>
										<div class="row" class="col-12 col-sm-12 col-md-12 col-lg-12"
											style="text-align: center;">
											<div id="topico"
												style="margin-top: 50px; margin-left: auto; margin-right: auto;">
												<div id="topico-nome"
													class="col-12 col-sm-12 col-md-12 col-lg-12">
													Título:<%=topico.getTitulo()%></div>
												<input name="IDtopico" hidden value=<%=topico.getId()%>>
												<%
													SimpleDateFormat f1 = new SimpleDateFormat("dd-MM-yyyy");
												%>
												<div id="topico-data"
													class="col-12 col-sm-12 col-md-12 col-lg-12">
													Data:<%=f1.format(topico.getData().getTime())%></div>
												<div class="row">
													<form action="exibepost.jsp" style="margin-left: auto; margin-right: auto;"">
														<input type="hidden" name="xml"
															value="<%=topico.getId()%>" />
														<button id="post-button" type="submit"
															class='btn btn-primary'>Ver Postagem</button>
													</form>
													<%
														if (usuario.isPermissao() == true && topico.isComentado() == false) {
													%>
													<form action="editapost.jsp" style="margin-left: 10px;">
														<input type="hidden" name="xml"
															value="<%=topico.getId()%>" />
														<button id="post-button" type="submit"
															class='btn btn-primary'>Editar Postagem</button>
													</form>
													<%
														}
													%>
													<%
														if (usuario.isPermissao() == true) {
													%>
													<form action="ControllerDeleteTopico" method="post"
														style="margin-left: 10px;">
														<input type="hidden" name="deletetopico"
															value="<%=topico.getId()%>" />
														<button id="post-button" type="submit"
															class='btn btn-danger'>Remover Postagem</button>
													</form>
													<%
														}
													%>
												</div>
											</div>
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