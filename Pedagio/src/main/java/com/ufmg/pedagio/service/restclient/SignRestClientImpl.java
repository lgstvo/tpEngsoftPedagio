package com.ufmg.pedagio.service.restclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufmg.pedagio.service.restclient.interfaces.SignRestClient;
import com.ufmg.pedagio.utils.LoggerUtils;

@Service
public class SignRestClientImpl implements SignRestClient{
	
	@Autowired
	private LoggerUtils loggerUtils;

	@Override
	public void callSignRestClient(String sign) {
		try {
			//would call restclient
			loggerUtils.saveLoggerSucces();
		}catch(Exception ex) {
			loggerUtils.saveLoggerFail();
		}
		
	}
	

}
