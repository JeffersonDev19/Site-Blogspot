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

@WebServlet(name = "ControllerRegister", urlPatterns = { "/ControllerRegister" })
public class ControllerRegister extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	RepositorioUsuario repUsu = RepositorioUsuario.getInstance();
	RequestDispatcher rd;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ------------------------------------------------------------------------//
		// Capturando os dados inseridos pelo usuário através do Form//
		// ------------------------------------------------------------------------//
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		String apelido = request.getParameter("apelido");

		// ------------------------------------------------------------------------//
		// Validando se não há xingamentos nos campos//
		// ------------------------------------------------------------------------//
		servicoValidacao servico = new servicoValidacao();

		boolean vNome = servico.validarNaoXingamento(nome);
		boolean vEmail = servico.validarNaoXingamento(email);
		boolean vSenha = servico.validarNaoXingamento(senha);
		boolean vApelido = servico.validarNaoXingamento(apelido);

		if (vNome && vEmail && vSenha && vApelido) {
			// ------------------------------------------------------------------------//
			// Inserindo os dados dentro do construtor de persistencia//
			// ------------------------------------------------------------------------//
			Usuario usuario = new Usuario();
			usuario.setNome(nome);
			usuario.setEmail(email);
			usuario.setSenha(senha);
			usuario.setApelido(apelido);
			usuario.setPermissao(false);
			repUsu.Salvar(usuario);
			response.sendRedirect("index.jsp");
		} else {
			response.sendRedirect("falha.jsp");
		}

	}
}