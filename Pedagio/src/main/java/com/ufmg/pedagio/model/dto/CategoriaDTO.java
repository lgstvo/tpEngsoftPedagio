package com.ufmg.pedagio.model.dto;

import java.io.Serializable;

public class CategoriaDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer idCategoria;
	private String nome;

	public CategoriaDTO() {}

	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
