package com.ufmg.pedagio.service.restclient;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;

import com.ufmg.pedagio.mocks.model.ResponseMocks;
import com.ufmg.pedagio.mocks.service.MocksService;
import com.ufmg.pedagio.utils.LoggerUtils;

@ExtendWith(MockitoExtension.class)
public class SignRestClientTest {

	@InjectMocks
	private SignRestClientImpl signRestClient;
	
	@Mock
	private LoggerUtils logger;
	
	@Mock
	private MocksService mockService;
	
	@Test
	void Sucess_PaymentWithSmartcard() {
		Mockito.doNothing().when(logger).saveLoggerSucces();
		Mockito.when(mockService.returnMock()).thenReturn(responseMockSucces());
		signRestClient.callSignRestClient("smartcard");
	}
	
	@Test
	void Error_PaymentWithSmartcard() {
		Mockito.doNothing().when(logger).saveLoggerFail();
		Mockito.when(mockService.returnMock()).thenReturn(responseMockError());
		signRestClient.callSignRestClient("smartcard");
	}
	
	private ResponseMocks responseMockSucces() {
		return new ResponseMocks(HttpStatus.NO_CONTENT.value(), "No Content");
	}
	
	private ResponseMocks responseMockError() {
		return new ResponseMocks(HttpStatus.INTERNAL_SERVER_ERROR.value(), "No Content");
	}
}
