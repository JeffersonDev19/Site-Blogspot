package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;

import model.Topico;
import model.Usuario;
import model.servicoValidacao;
import repositories.RepositorioTopico;
import repositories.RepositorioUsuario;

@WebServlet(name = "ControllerGerencia", urlPatterns = { "/ControllerGerencia" })
public class ControllerGerencia extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	RepositorioUsuario repUsu = RepositorioUsuario.getInstance();
	RequestDispatcher rd;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nome = request.getParameter("udp");
		RepositorioUsuario repUsu = RepositorioUsuario.getInstance();
		Usuario usuario = repUsu.getPorNome(nome);
		HttpSession sessao = request.getSession();
		sessao.setAttribute("permissao", usuario.isPermissao());
		response.sendRedirect("gerenciausuario.jsp");
	}
}