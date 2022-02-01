package com.ufmg.pedagio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ufmg.pedagio.service.PongServiceImpl;

@Controller
@RequestMapping(value = "/pong")
public class PongController {
	
	@Autowired
	private PongServiceImpl pongService;

	@RequestMapping(value = "/ping", method = RequestMethod.GET)
	public ResponseEntity<Object> buscarCategoriaPorId(@PathVariable Integer idCategoria) {
		pongService.pong();
		return ResponseEntity.ok(new Object());

	}

}
