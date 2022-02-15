package com.ufmg.pedagio.mocks.model;

import org.springframework.http.HttpStatus;

public class ResponseMocks {

	private Integer status = HttpStatus.NO_CONTENT.value();
	
	private String desc = "No_Content";

	public ResponseMocks() {
	}
	
	public ResponseMocks(Integer status, String desc) {
		this.status = status;
		this.desc = desc;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Integer getStatus() {
		return status;
	}

	public String getDesc() {
		return desc;
	}
	
}
