package com.ufmg.pedagio.utils;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufmg.pedagio.model.entity.LoggerEntity;
import com.ufmg.pedagio.model.entity.PedagioEntity;
import com.ufmg.pedagio.repository.LoggerRepository;
import com.ufmg.pedagio.repository.PedagioRepository;

@Service
public class LoggerUtils {

	@Autowired
	private PedagioUtils pedagioUtils;
	
	@Autowired
	private StatusUtils statusUtils;
	
	@Autowired
	private PedagioRepository pedagioRepository;
	
	@Autowired
	private LoggerRepository loggerRepository;
	
	public void saveLoggerSucces() {
		LoggerEntity logger = new LoggerEntity();
		PedagioEntity pedagioEntity = pedagioUtils.recuperatePedagioInfo();
		pedagioRepository.save(pedagioEntity);
		logger.setPedagio(pedagioEntity);
		logger.setNumeroPedagio(new Date());
		logger.setStatus(statusUtils.generateStatusSuccess());
		loggerRepository.save(logger);
	}
	
	public void saveLoggerFail() {
		LoggerEntity logger = new LoggerEntity();
		PedagioEntity pedagioEntity = pedagioUtils.recuperatePedagioInfo();
		pedagioRepository.save(pedagioEntity);
		logger.setPedagio(pedagioEntity);
		logger.setNumeroPedagio(new Date());
		logger.setStatus(statusUtils.generateStatusError());
		loggerRepository.save(logger);
	}
}
