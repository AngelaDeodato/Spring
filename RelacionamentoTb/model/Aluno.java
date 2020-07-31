package com.escola.minhaEscola.model;
//CRIANDO A CAMADA MODEL QUE SERLACIOMARA COM A TABELA TURMA 
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_aluno") //NOME DA TABELA
public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //CHAVE PRIMARIA DA TABELA
	private long id;
	
	@NotNull
	private String nome;
	
	@NotNull
	
	private String categoria;
	
	
	private boolean matriculado;
	
	
	@OneToMany(mappedBy = "aluno", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("aluno")													// FOREYNG KEY DA TABELA
	private List<Turma> turma;								//REFERENCIAMDO UMA TABELA DENTRO DA OUTRA 
														//NESSE CASO ALUNO ESTA SENDO REFERENCIADO DENTRO DE TURMA!!

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public boolean isMatriculado() {
		return matriculado;
	}

	public void setMatriculado(boolean matriculado) {
		this.matriculado = matriculado;
	}

	public List<Turma> getTurma() {
		return turma;
	}

	public void setTurma(List<Turma> turma) {
		this.turma = turma;
	}

		
	
}
