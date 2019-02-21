package model;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "topico")
public class Topico {

	@Id
	@GeneratedValue
	private int id;

	@Column(name = "titulo")
	private String titulo;

	@Column(name = "texto")
	private String texto;

	@Column(name = "data")
	private java.sql.Date data;

	@Column(name = "id_usuario")
	private int id_usuario;

	@Column(name = "comentado")
	private boolean comentado;

	public Topico() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public java.sql.Date getData() {
		return data;
	}

	public void setData(java.sql.Date data) {
		this.data = data;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public boolean isComentado() {
		return comentado;
	}

	public void setComentado(boolean comentado) {
		this.comentado = comentado;
	}

}
