package controller;

import java.io.IOException;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Topico;
import model.servicoValidacao;
import repositories.RepositorioTopico;
import repositories.RepositorioUsuario;

@WebServlet(name = "ControllerCreateTopico", urlPatterns = { "/ControllerCreateTopico" })
public class ControllerCreateTopico extends HttpServlet {
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
			Topico topico = new Topico();
			topico.setTitulo(titulo);
			topico.setTexto(texto);
			topico.setData(data);
			topico.setId_usuario(Integer.parseInt(id_usuario));
			RepositorioTopico repTop = RepositorioTopico.getInstance();
			repTop.Salvar(topico);
			response.sendRedirect("home.jsp");
		} else {
			response.sendRedirect("falha.jsp");
		}

	}

}
