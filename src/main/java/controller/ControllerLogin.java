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

@WebServlet(name = "ControllerLogin", urlPatterns = { "/ControllerLogin" })
public class ControllerLogin extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	RepositorioUsuario repUsu = RepositorioUsuario.getInstance();
	RequestDispatcher rd;
	HttpSession sessao;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("nome");
		String senha = request.getParameter("senha");
		Usuario usuario = repUsu.getPorNome(email);
		if (email.equals(usuario.getNome()) && usuario.getSenha().equals(senha)) {
			response.setContentType("text/html");
			sessao = request.getSession();
			sessao.setAttribute("usuario", usuario);
			RepositorioTopico repTop = RepositorioTopico.getInstance();
			List<Topico> listaTopico = new ArrayList<Topico>();
			listaTopico.addAll(repTop.getTodos());
			sessao.setAttribute("listaTopico", listaTopico);

			response.sendRedirect("home.jsp");

			// -----------------------------------------------------//
			// LÓGICA PARA LISTAR TODOS OS TOPICOS EXISTENTES//
			// -----------------------------------------------------//

			// ----------------FIM DA LISTAGEM----------------------//

		}else {
			response.sendRedirect("falha.jsp");
		}
	}
}