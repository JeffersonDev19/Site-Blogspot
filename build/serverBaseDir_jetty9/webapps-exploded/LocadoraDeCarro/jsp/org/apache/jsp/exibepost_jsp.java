package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Usuario;
import model.Topico;
import model.Comentario;
import repositories.RepositorioTopico;
import repositories.RepositorioComentario;
import repositories.RepositorioUsuario;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;

public final class exibepost_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");

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

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://fonts.googleapis.com/css?family=ZCOOL+QingKe+HuangYou\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/sheet.css\"\r\n");
      out.write("\tmedia='screen and (color)' />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\r\n");
      out.write("<title>Blog</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"font-family: 'ZCOOL QingKe HuangYou', cursive;\">\r\n");
      out.write("\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-12 col-sm-12 col-md-12 col-lg-12\">\r\n");
      out.write("\t\t\t\t<div id=\"upper-line\" class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-4 col-sm-4 col-md-4 col-lg-4\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-4 col-sm-4 col-md-4 col-lg-4\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"text-align: center;\">\r\n");
      out.write("\t\t\t\t\t\t<img alt=\"\" src=\"img/logo.png\" height=\"70\" width=\"auto\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-4 col-sm-4 col-md-4 col-lg-4\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"top-mid-line\" class=\"row\"></div>\r\n");
      out.write("\t\t\t\t<div id=\"mid-line\" class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div id=\"mid-body\" class=\"col-12 col-sm-12 col-md-12 col-lg-12\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"mid-box\" class=\"col-12 col-sm-12 col-md-12 col-lg-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-2 col-sm-2 col-md-2 col-lg-2\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"mid-dashboard\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"col-8 col-sm-8 col-md-8 col-lg-8\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"text-align: center;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

											SimpleDateFormat f1 = new SimpleDateFormat("dd-MM-yyyy");
										
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div id=\"topico-nome\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"col-12 col-sm-12 col-md-12 col-lg-12\">Titulo: ");
      out.print(topico.getTitulo());
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div id=\"topico-texto\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"col-12 col-sm-12 col-md-12 col-lg-12\">Texto: ");
      out.print(topico.getTexto());
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div id=\"topico-data\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"col-12 col-sm-12 col-md-12 col-lg-12\">Data: ");
      out.print(f1.format(topico.getData()));
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

											if (usuario.getNome() != "guestxml") {
										
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<form action='ControllerCreateComentario' method='post'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tStyle='margin-top: 10px; padding-left: 10px; padding-right: 10px; padding-top: 10px; padding-bottom: 10px; background-color: white; opacity: 0.9; border-radius: 5px;'>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class='form-row'>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class='form-group col-12 col-sm-12 col-md-12 col-lg-12'>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input name='IDUsuario' hidden value=");
      out.print(usuario.getId());
      out.write(">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input name='IDTopico' hidden value=");
      out.print(topico.getId());
      out.write(">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class='form-group'>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label for='artxtTopico'>Novo Comentario</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<textarea class='form-control' rows='5' id='texto'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tname='texto'></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class='form-row'>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class='form-group col-5 col-sm-5 col-md-5 col-lg-5'></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<button type='submit' class='btn btn-primary col-md-2'>Comentar\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class='form-group col-5 col-sm-5 col-md-5 col-lg-5'></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

											}
										
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

											for (Comentario comentario : listaComentario) {
												RepositorioUsuario repUsu = RepositorioUsuario.getInstance();
												Usuario usuarioCom = repUsu.getPorID(Integer.toString(comentario.getId_usuario_com()));
										
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label for='nComentario'>Comentario</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-12 col-sm-12 col-md-12 col-lg-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label for='autor'>Autor:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div>");
      out.print(usuarioCom.getNome());
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label for='autor'>Comentario:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div>");
      out.print(comentario.getTexto());
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label for='autor'>Data do Comentario:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div>");
      out.print(f1.format(comentario.getData()));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

											if (usuario.isPermissao()) {
										
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<form action=\"ControllerDeleteComentario\" method=\"post\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tstyle=\"margin-left: 10px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"xml\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(comentario.getId());
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<button id=\"post-button\" type=\"submit\" class='btn btn-danger'>Remover\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tComentario</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

											}
										
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

											}
										
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-2 col-sm-2 col-md-2 col-lg-2\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-3.3.1.slim.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/popper.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\r\n");
      out.write("<script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/script.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
