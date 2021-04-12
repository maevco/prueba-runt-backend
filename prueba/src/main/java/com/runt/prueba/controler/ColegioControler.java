package com.runt.prueba.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.runt.prueba.entity.Colegio;
import com.runt.prueba.service.ColegioServiceDecl;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/colegio/")
public class ColegioControler {
	
	@Autowired
	private ColegioServiceDecl colegioService;
	
	@GetMapping
	private List<Colegio> listar(){
		return colegioService.getAllColegio();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Colegio create(@RequestBody Colegio colegio) {		
		return colegioService.add(colegio);
		
	}

}
