package com.ufmg.pedagio.model.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name="TBL_PEDAGIO")
public class PedagioEntity implements Serializable{

	private static final long serialVersionUID = 1l;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_PEDAGIO")
	private Integer idPedagio;

	@Column(name="DS_RODOVIA")
	private String rodovia;
	
	@Column(name="NM_PEDAGIO")
	private Integer numeroPedagio;
	
	@OneToOne(mappedBy ="pedagio",cascade=CascadeType.ALL)
	private LoggerEntity loggerEntity;

	public Integer getIdPedagio() {
		return idPedagio;
	}

	public void setIdPedagio(Integer idPedagio) {
		this.idPedagio = idPedagio;
	}

	public String getRodovia() {
		return rodovia;
	}

	public void setRodovia(String rodovia) {
		this.rodovia = rodovia;
	}

	public Integer getNumeroPedagio() {
		return numeroPedagio;
	}

	public void setNumeroPedagio(Integer numeroPedagio) {
		this.numeroPedagio = numeroPedagio;
	}

	public LoggerEntity getLoggerEntity() {
		return loggerEntity;
	}

	public void setLoggerEntity(LoggerEntity loggerEntity) {
		this.loggerEntity = loggerEntity;
	}

}
