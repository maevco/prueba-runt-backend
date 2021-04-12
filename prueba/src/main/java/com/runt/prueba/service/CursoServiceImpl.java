package com.runt.prueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.runt.prueba.entity.Curso;
import com.runt.prueba.repository.CursoRepository;

@Service
public class CursoServiceImpl implements CursoServiceDecl{
	
	@Autowired
	private CursoRepository cursoRepository;

	@Override
	public List<Curso> getAllCurso() {
		return cursoRepository.findAll();
	}

	@Override
	public Curso add(Curso curso) {		
		return cursoRepository.save(curso);
	}

}
