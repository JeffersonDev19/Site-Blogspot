package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Comentario;
import repositories.RepositorioComentario;

@WebServlet(name = "ControllerDeleteComentario", urlPatterns = {"/ControllerDeleteComentario"}) 
public class ControllerDeleteComentario extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ------------------------------------------------------------------------//
		// Capturando os dados inseridos pelo usuário através do Form//
		// ------------------------------------------------------------------------//

		String id_comentario = request.getParameter("xml");

		// ------------------------------------------------------------------------//
		// Deletando os dados dentro do construtor de persistencia//
		// ------------------------------------------------------------------------//
    	RepositorioComentario repCom = RepositorioComentario.getInstance();
    	Comentario comentario = repCom.getPorID(id_comentario);    	
    	repCom.Excluir(comentario);
    	response.sendRedirect("home.jsp");
	}
}
