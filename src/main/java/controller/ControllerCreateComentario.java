package controller;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Comentario;
import model.Topico;
import model.Usuario;
import model.servicoValidacao;
import repositories.RepositorioComentario;
import repositories.RepositorioTopico;
import repositories.RepositorioUsuario;

@WebServlet(name = "ControllerCreateComentario", urlPatterns = {"/ControllerCreateComentario"}) 
public class ControllerCreateComentario extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd;
		// ------------------------------------------------------------------------//
		// Capturando os dados inseridos pelo usuário através do Form//
		// ------------------------------------------------------------------------//

		String id_usuario = request.getParameter("IDUsuario");
		String id_topico = request.getParameter("IDTopico");
		String texto = request.getParameter("texto");
		java.sql.Date data = new java.sql.Date(new java.util.Date().getTime());

		// ------------------------------------------------------------------------//
		// Validando se não há xingamentos nos campos//
		// ------------------------------------------------------------------------//
		servicoValidacao servico = new servicoValidacao();

		boolean vTexto = servico.validarNaoXingamento(texto);
		if (vTexto) {
			// ------------------------------------------------------------------------//
			// Inserindo os dados dentro do construtor de persistencia//
			// ------------------------------------------------------------------------//
			Comentario comentario = new Comentario();
			RepositorioUsuario repUsu = RepositorioUsuario.getInstance();
			Usuario usuario = repUsu.getPorID(id_usuario);
			RepositorioTopico repTop = RepositorioTopico.getInstance();
			Topico topico = repTop.getPorID(id_topico);
			topico.setComentado(true);
			repTop.Editar(topico);
			comentario.setAutor(usuario.getNome());
			comentario.setTexto(texto);
			comentario.setData(data);
			comentario.setId_topico(Integer.parseInt(id_topico));
			comentario.setId_usuario_com(usuario.getId());

			RepositorioComentario repCom = RepositorioComentario.getInstance();
			repCom.Salvar(comentario);

			response.sendRedirect("home.jsp");
		} else {
			response.sendRedirect("falha.jsp");
		}
	}

}
