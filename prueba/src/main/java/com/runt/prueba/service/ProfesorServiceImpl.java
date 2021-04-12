package com.runt.prueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.runt.prueba.entity.Profesor;
import com.runt.prueba.repository.ProfesorRepository;

@Service
public class ProfesorServiceImpl implements ProfesorServiceDecl{
	
	@Autowired
	private ProfesorRepository profesorRepository;

	@Override
	public List<Profesor> getAllProfesor() {
		return profesorRepository.findAll();
	}

	@Override
	public Profesor add(Profesor profesor) {
		return profesorRepository.save(profesor);
	}

}
