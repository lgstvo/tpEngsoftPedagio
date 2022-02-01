package com.ufmg.pedagio.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="TBL_CATEGORIA")
public class CategoriaEntity implements Serializable{

	private static final long serialVersionUID = 1l;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_CATEGORIA")
	private Integer idCategoria;

	@Column(name="DS_NOME")
	private String nome;
	

	public CategoriaEntity() {
	}

	public CategoriaEntity(Integer idCategoria, String nome) {
		this.idCategoria = idCategoria;
		this.nome = nome;
	}

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