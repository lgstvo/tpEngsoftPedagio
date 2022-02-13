package com.ufmg.pedagio.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufmg.pedagio.model.entity.StatusEntity;
import com.ufmg.pedagio.repository.StatusRepository;

@Service
public class StatusUtils {
	
	@Autowired
	private StatusRepository statusRepository;

	public StatusEntity generateStatusSuccess() {
		return statusRepository.getById(1);
	}

	public StatusEntity generateStatusError() {
		return statusRepository.getById(2);
	}
}
