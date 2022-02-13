package com.ufmg.pedagio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ufmg.pedagio.service.PaymentServiceImpl;

@Controller
@RequestMapping(value = "/payment")
public class PaymentController {
	
	@Autowired
	private PaymentServiceImpl paymentService;

	@RequestMapping(value = "/{identificadorSmartcard}", method = RequestMethod.GET)
	public ResponseEntity<Void> payWithSmartcard(@PathVariable String identificadorSmartcard) {
		paymentService.payWithSmartcard(identificadorSmartcard);
		return ResponseEntity.ok().build();
	}
	
	@RequestMapping(value = "/{identificadorPlaca}", method = RequestMethod.GET)
	public ResponseEntity<Void> payWithSign(@PathVariable String identificadorPlaca) {
		paymentService.payWithSmartcard(identificadorPlaca);
		return ResponseEntity.ok().build();
	}

}
