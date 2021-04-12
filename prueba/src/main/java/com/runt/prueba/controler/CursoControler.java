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

import com.runt.prueba.entity.Curso;
import com.runt.prueba.service.CursoServiceDecl;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/curso/")
public class CursoControler {
	
	@Autowired
	private CursoServiceDecl cursoService;
	
	@GetMapping
	public List<Curso> listar(){
		return cursoService.getAllCurso();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Curso create(@RequestBody Curso curso) {
		return cursoService.add(curso);
	}
	

}
