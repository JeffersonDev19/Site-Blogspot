package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");

	session.invalidate();

      out.write("\r\n");
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
      out.write("\r\n");
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
      out.write("\t\t\t\t\t\t\t<div id=\"xinzhao\"><img src=\"img/xz.png\" alt=\"\" style=\"width: 150px; height: 100px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<span id=\"fala\">Olá, sou o Xin Zhao, seja bem vindo ao mundo de Demacia</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"jarvan\"><img src=\"img/jarvan.png\" alt=\"\" style=\"width: 150px; height: 100px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<span id=\"fala\">Jarvan esta aqui para ajudar!</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"mid-form\" class=\"col-12 col-sm-12 col-md-12 col-lg-12\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"text-align: center;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<form action='ControllerLogin' method='post'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tstyle=\"margin-top: 10px; padding-left: 10px; padding-right: 10px; padding-top: 10px; padding-bottom: 10px; background-color: white; opacity: 0.9; border-radius: 5px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class='form-row'>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class='form-group col-6 col-sm-6 col-md-6 col-lg-6'>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label for='lbl_email'>Login</label> <input type='text'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass='form-control' id='nome' name='nome'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tplaceholder='Nome'>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class='form-group col-6 col-sm-6 col-md-6 col-lg-6'>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label for='lbl_senha'>Senha</label> <input type='password'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass='form-control' id='senha' name='senha'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tplaceholder='Senha'>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class='form-row'>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class='form-group col-5 col-sm-5 col-md-5 col-lg-5'></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<button type='submit' class='btn btn-primary col-md-2'>Logar</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class='form-group col-5 col-sm-5 col-md-5 col-lg-5'></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button id=\"button\" type=\"button\" class=\"btn btn-success\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tstyle=\"margin-top: 10px;\">Cadastrar</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"home.jsp\"><button id=\"button\" type=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"btn btn-success\" style=\"margin-top: 10px;\">Logar\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tcomo convidado</button></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-3 col-sm-3 col-md-3 col-lg-3\"></div>\r\n");
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
