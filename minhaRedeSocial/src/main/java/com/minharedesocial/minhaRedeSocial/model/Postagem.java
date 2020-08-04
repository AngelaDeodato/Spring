package com.minharedesocial.minhaRedeSocial.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_postagem")//NOME DA TABELA
public class Postagem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//CHAVE PRIMARIA
	private long id;
	
	@NotNull
	private String descricao;
	
	@NotNull
	private int likes;
	
	//MUITAS POSTAGENS PARA UM TEMA
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Tema tema;
	
	//MUITAS POSTAGENS PARA UM USUARIO
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Usuario usuario;

	
	//METODOS ESPECIAIS
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
