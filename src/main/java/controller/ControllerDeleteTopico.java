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
import repositories.RepositorioComentario;
import repositories.RepositorioTopico;


@WebServlet(name = "ControllerDeleteTopico", urlPatterns = {"/ControllerDeleteTopico"}) 
public class ControllerDeleteTopico extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ------------------------------------------------------------------------//
		// Capturando os dados inseridos pelo usuário através do Form//
		// ------------------------------------------------------------------------//

		String id_topico = request.getParameter("deletetopico");

		// ------------------------------------------------------------------------//
		// Deletando os dados dentro do construtor de persistencia//
		// ------------------------------------------------------------------------//
		RepositorioTopico repTop = RepositorioTopico.getInstance();
		Topico topico = repTop.getPorID(id_topico);
    	RepositorioComentario repCom = RepositorioComentario.getInstance();
    	List<Comentario> listaDeComentario = new ArrayList<Comentario>();
    	listaDeComentario.addAll(repCom.getTodos());
    	
    	for (Comentario comentario : listaDeComentario) {
			if(comentario.getId_topico() == topico.getId()) {
				repCom.Excluir(comentario);
			}
		}
    	repTop.Excluir(topico);
    	response.sendRedirect("home.jsp");
	}
}
