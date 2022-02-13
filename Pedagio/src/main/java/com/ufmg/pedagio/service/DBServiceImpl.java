package com.ufmg.pedagio.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufmg.pedagio.model.entity.StatusEntity;
import com.ufmg.pedagio.repository.StatusRepository;
import com.ufmg.pedagio.service.interfaces.DBService;

@Service
public class DBServiceImpl implements DBService{
	
	@Autowired
	private StatusRepository statusRepository;

	@Override
	public void instanciarBanco() {
		
		List<StatusEntity> statusEntityList = new ArrayList<>();
		
		StatusEntity statusToAddSucess = new StatusEntity();
		statusToAddSucess.setDescricao("SUCESSO");
		
		statusEntityList.add(statusToAddSucess);
		
		
		StatusEntity statusToAddError = new StatusEntity();
		statusToAddSucess.setDescricao("ERROR");
		
		statusEntityList.add(statusToAddError);
		
		statusRepository.saveAll(statusEntityList);
	}
}
