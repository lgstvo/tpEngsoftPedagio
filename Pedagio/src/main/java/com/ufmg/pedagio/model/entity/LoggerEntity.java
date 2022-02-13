package com.ufmg.pedagio.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name="TBL_LOGGER")
public class LoggerEntity implements Serializable{

	private static final long serialVersionUID = 1l;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_LOGGER")
	private Integer idLogger;
	
	@JsonIgnore
	@OneToOne
	@MapsId
	@JoinColumn(name="ID_PEDAGIO")
	private PedagioEntity pedagio;
	
	@JsonIgnore
	@OneToOne
	@MapsId
	@JoinColumn(name="ID_STATUS")
	private StatusEntity status;
	
	@Column(name="NM_PEDAGIO")
	private Date horario;

	public Date getNumeroPedagio() {
		return horario;
	}

	public void setNumeroPedagio(Date horario) {
		this.horario = horario;
	}

	public PedagioEntity getPedagio() {
		return pedagio;
	}

	public void setPedagio(PedagioEntity pedagio) {
		this.pedagio = pedagio;
	}

	public StatusEntity getStatus() {
		return status;
	}

	public void setStatus(StatusEntity status) {
		this.status = status;
	}
	
}
