package com.ufmg.pedagio.service.restclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufmg.pedagio.service.restclient.interfaces.SmartCardRestClient;
import com.ufmg.pedagio.utils.LoggerUtils;

@Service
public class SmartCardRestClientImpl implements SmartCardRestClient{
	
	@Autowired
	private LoggerUtils loggerUtils;

	@Override
	public void callSmartcardRestclient(String identificadorSmartcard) {
		try {
			//would call restclient
			loggerUtils.saveLoggerSucces();
		}catch(Exception ex) {
			loggerUtils.saveLoggerFail();
		}
	}
	
}
