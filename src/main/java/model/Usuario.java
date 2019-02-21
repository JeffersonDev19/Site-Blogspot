package model;

import javax.persistence.*;
@Entity
@Table(name = "usuario")
public class Usuario {
   @Id
   @GeneratedValue
   private int id;
      
   @Column(name="nome")
   private String nome;
   
   @Column(name="email")
   private String email;
   
   @Column(name="senha")
   private String senha;
   
   @Column (name="apelido")
   private String apelido;
   
   @Column (name="permissao")
   private boolean permissao;
   
	public Usuario() {
		super();
	}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getSenha() {
	return senha;
}

public void setSenha(String senha) {
	this.senha = senha;
}

public String getApelido() {
	return apelido;
}

public void setApelido(String apelido) {
	this.apelido = apelido;
}

public boolean isPermissao() {
	return permissao;
}

public void setPermissao(boolean permissao) {
	this.permissao = permissao;
}
}
