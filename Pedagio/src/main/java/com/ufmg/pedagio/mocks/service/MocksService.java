package com.ufmg.pedagio.mocks.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.ufmg.pedagio.mocks.model.ResponseMocks;

@Service
public class MocksService {

	public ResponseMocks returnMock() {
		return new ResponseMocks(HttpStatus.NO_CONTENT.value(), "No Content");
	}
}
