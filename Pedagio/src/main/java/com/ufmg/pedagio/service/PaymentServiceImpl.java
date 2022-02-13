package com.ufmg.pedagio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufmg.pedagio.service.interfaces.PaymentService;
import com.ufmg.pedagio.service.restclient.interfaces.SignRestClient;
import com.ufmg.pedagio.service.restclient.interfaces.SmartCardRestClient;

@Service
public class PaymentServiceImpl implements PaymentService{
	
	@Autowired
	private SmartCardRestClient smartCardRestClient;
	
	@Autowired
	private SignRestClient signRestClient;
		
	@Override
	public void payWithSmartcard(String identificadorSmartcard) {
		smartCardRestClient.callSmartcardRestclient(identificadorSmartcard);
	}
	
	@Override
	public void payWithSign(String identificadorSign) {
		signRestClient.callSignRestClient(identificadorSign);
	}
	
}
