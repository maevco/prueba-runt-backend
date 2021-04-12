package com.runt.prueba.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.runt.prueba.entity.Profesor;
import com.runt.prueba.service.ProfesorServiceDecl;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/profesor/")
public class ProfesorControler {

	@Autowired
	private ProfesorServiceDecl profesorService;

	@GetMapping
	public List<Profesor> listar() {
		return profesorService.getAllProfesor();
	}

	public Profesor add(@RequestBody Profesor profesor) {
		return profesorService.add(profesor);
	}

}
