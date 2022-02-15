package com.ufmg.pedagio.service.restclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.ufmg.pedagio.mocks.service.MocksService;
import com.ufmg.pedagio.service.restclient.interfaces.SmartCardRestClient;
import com.ufmg.pedagio.utils.LoggerUtils;

@Service
public class SmartCardRestClientImpl implements SmartCardRestClient{
	
	@Autowired
	private LoggerUtils loggerUtils;
	
	@Autowired
	private MocksService mocksService;

	@SuppressWarnings("static-access")
	@Override
	public void callSmartcardRestclient(String identificadorSmartcard) {
		try {
			var response = mocksService.returnMock();
			if(response.getStatus() != HttpStatus.NO_CONTENT.value())
				throw new Exception("Erro ao Cobrar o Smartcard");
			loggerUtils.saveLoggerSucces();
		}catch(Exception ex) {
			loggerUtils.saveLoggerFail();
		}
	}
	
}
