package com.runt.prueba.service;

import java.util.List;

import com.runt.prueba.entity.Estudiante;

public interface EstudianteServiceDecl {

	/**
	 * 
	 * @return
	 */
	public List<Estudiante> getAllEstudiante();

	/**
	 * 
	 * @param estudiante
	 * @return
	 */
	public Estudiante add(Estudiante estudiante);

}
