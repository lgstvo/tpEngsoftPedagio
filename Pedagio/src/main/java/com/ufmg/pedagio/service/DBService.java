package com.ufmg.pedagio.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufmg.pedagio.model.entity.StatusEntity;
import com.ufmg.pedagio.repository.StatusRepository;

@Service
public class DBService {

	@Autowired
	private StatusRepository statusRepository;

	public void instanciarBanco() {
		List<StatusEntity> statusEntityList = new ArrayList<>();

		StatusEntity statusToAddSucess = new StatusEntity();
		statusToAddSucess.setDescricao("SUCESSO");

		statusEntityList.add(statusToAddSucess);

		StatusEntity statusToAddError = new StatusEntity();
		statusToAddError.setDescricao("ERROR");

		statusEntityList.add(statusToAddError);

		statusRepository.saveAll(statusEntityList);

	}
}
