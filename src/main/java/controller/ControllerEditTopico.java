package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Topico;
import model.servicoValidacao;
import repositories.RepositorioTopico;

@WebServlet(name = "ControllerEditTopico", urlPatterns = { "/ControllerEditTopico" })
public class ControllerEditTopico extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	RequestDispatcher rd;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ------------------------------------------------------------------------//
		// Capturando os dados inseridos pelo usuário através do Form//
		// ------------------------------------------------------------------------//

		String id_topico = request.getParameter("IDtopico");
		


		RepositorioTopico repTop = RepositorioTopico.getInstance();
		Topico topico = repTop.getPorID(id_topico);
		String titulo = request.getParameter("titulo");
		String texto = request.getParameter("texto");
		java.sql.Date data = new java.sql.Date(new java.util.Date().getTime());

		// ------------------------------------------------------------------------//
		// Validando se não há xingamentos nos campos//
		// ------------------------------------------------------------------------//
		servicoValidacao servico = new servicoValidacao();

		boolean vTitulo = servico.validarNaoXingamento(titulo);
		boolean vTexto = servico.validarNaoXingamento(texto);

		if (vTitulo && vTexto) {
			// ------------------------------------------------------------------------//
			// Inserindo os dados dentro do construtor de persistencia//
			// ------------------------------------------------------------------------//
			topico.setTitulo(titulo);
			topico.setTexto(texto);
			topico.setData(data);

			if (topico.isComentado() == false) {
				// ------------------------------------------------------------------------//
				// Editando os dados dentro do construtor de persistencia//
				// ------------------------------------------------------------------------//
				repTop.Editar(topico);
				response.sendRedirect("home.jsp");
			} else {
				response.sendRedirect("falha.jsp");
			}
		}
	}
}
