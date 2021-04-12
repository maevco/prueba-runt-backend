package com.runt.prueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.runt.prueba.entity.Asignatura;
import com.runt.prueba.entity.AsignaturaEnvio;
import com.runt.prueba.repository.AsignaturaRepository;

@Service
public class AsiganaturaServiceImpl implements AsignaturaServiceDecl {
	
	@Autowired
	private AsignaturaRepository asignaturaRepository;

	@Override
	public List<AsignaturaEnvio> getAllProfesorId(long profesorId) {
		return asignaturaRepository.buscarProfesorId(profesorId);
	}

	@Override
	public Asignatura add(Asignatura asignatura) {
		return asignaturaRepository.save(asignatura);
	}

	@Override
	public List<AsignaturaEnvio> getAllProfesorAll() {
		return asignaturaRepository.buscarProfesorAll();
	}

}
