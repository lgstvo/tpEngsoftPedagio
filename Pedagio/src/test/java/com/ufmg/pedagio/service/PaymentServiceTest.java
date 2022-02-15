package com.ufmg.pedagio.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.ufmg.pedagio.service.restclient.interfaces.SignRestClient;
import com.ufmg.pedagio.service.restclient.interfaces.SmartCardRestClient;

@ExtendWith(MockitoExtension.class)
public class PaymentServiceTest {

	
	@InjectMocks
	private PaymentServiceImpl paymentService;
	
	@Mock
	private SmartCardRestClient smartCardRestClient;
	
	@Mock
	private SignRestClient signRestClient;
		
	
	@Test
	void Test_PayWithSign() {
		Mockito.doNothing().when(signRestClient).callSignRestClient("sign");
		paymentService.payWithSign("sign");
	}
	
	@Test
	void Test_PayWithSmartcard() {
		Mockito.doNothing().when(smartCardRestClient).callSmartcardRestclient("smartcard");
		paymentService.payWithSmartcard("smartcard");
	}
	
}
