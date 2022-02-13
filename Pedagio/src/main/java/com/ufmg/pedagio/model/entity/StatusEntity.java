package com.ufmg.pedagio.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name="TBL_STATUS")
public class StatusEntity implements Serializable{

	private static final long serialVersionUID = 1l;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_STATUS")
	private Integer idStatus;

	@Column(name="DS_STATUS")
	private String descricao;

	@OneToOne(mappedBy ="status")
	private LoggerEntity loggerEntity;
	
	public Integer getIdStatus() {
		return idStatus;
	}

	public void setIdStatus(Integer idStatus) {
		this.idStatus = idStatus;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LoggerEntity getLoggerEntity() {
		return loggerEntity;
	}

	public void setLoggerEntity(LoggerEntity loggerEntity) {
		this.loggerEntity = loggerEntity;
	}
	
}