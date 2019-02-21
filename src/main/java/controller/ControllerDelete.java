package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Comentario;
import model.Topico;
import model.Usuario;
import repositories.RepositorioComentario;
import repositories.RepositorioTopico;
import repositories.RepositorioUsuario;

@WebServlet(name = "ControllerDelete", urlPatterns = { "/ControllerDelete" })
public class ControllerDelete extends HttpServlet {
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

		// ------------------------------------------------------------------------//
		// Inserindo os dados dentro do construtor de persistencia//
		// ------------------------------------------------------------------------//
		RepositorioComentario repCom = RepositorioComentario.getInstance();
		RepositorioUsuario repUsu = RepositorioUsuario.getInstance();
		RepositorioTopico repTop = RepositorioTopico.getInstance();
		
		Usuario usuario = new Usuario();
		
		usuario = repUsu.getPorNome(nome);
		
		List<Comentario> listaDeComentario = new ArrayList<Comentario>();
		listaDeComentario.addAll(repCom.getTodos());
		
		List<Topico> listaDeTopico = new ArrayList<Topico>();
		listaDeTopico.addAll(repTop.getTodos());
		
		for (Comentario comentarioBanco : listaDeComentario) {
			if(comentarioBanco.getId_usuario_com() == usuario.getId()) {
				repCom.Excluir(comentarioBanco);
			}
		}
		
		for (Topico topicoBanco : listaDeTopico) {
			if(topicoBanco.getId_usuario() == usuario.getId()) {
				repTop.Excluir(topicoBanco);
			}
		}
		repUsu.Excluir(usuario);
		response.sendRedirect("home.jsp");
	}
}