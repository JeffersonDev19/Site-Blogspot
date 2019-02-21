package model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "comentario")
public class Comentario {

	   @Id
	   @GeneratedValue
	   private int id;
	   
	   @Column(name="autor")
	   private String autor;
	   
	   @Column(name="texto")
	   private String texto;
	   
	   @Column(name="data")
	   private java.sql.Date data;
	   
	   @Column(name="id_topico")
	   private int id_topico;
	   
	   @Column(name="id_usuario_com")
	   private int id_usuario_com;
	   
	public Comentario() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
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

	public int getId_topico() {
		return id_topico;
	}

	public void setId_topico(int id_topico) {
		this.id_topico = id_topico;
	}

	public int getId_usuario_com() {
		return id_usuario_com;
	}

	public void setId_usuario_com(int id_usuario_com) {
		this.id_usuario_com = id_usuario_com;
	}
}
