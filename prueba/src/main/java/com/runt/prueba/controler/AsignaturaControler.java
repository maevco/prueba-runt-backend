package com.runt.prueba.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.runt.prueba.entity.Asignatura;
import com.runt.prueba.entity.AsignaturaEnvio;
import com.runt.prueba.service.AsignaturaServiceDecl;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/asignatura/")
public class AsignaturaControler {

	@Autowired
	private AsignaturaServiceDecl asignaturaService;

	@GetMapping(path = { "/{id}" })
	public List<AsignaturaEnvio> buscarProfesorId(@PathVariable("id") Long id) {
		return asignaturaService.getAllProfesorId(id);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Asignatura add(@RequestBody Asignatura asignatura) {
		return asignaturaService.add(asignatura);
	}
	
	@GetMapping()
	public List<AsignaturaEnvio> buscarProfesorAll() {
		return asignaturaService.getAllProfesorAll();
	}

}
