package com.runt.prueba.service;

import java.util.List;

import com.runt.prueba.entity.Profesor;

public interface ProfesorServiceDecl {

	/**
	 * 
	 * @return
	 */
	public List<Profesor> getAllProfesor();

	/**
	 * 
	 * @param profesor
	 * @return
	 */
	public Profesor add(Profesor profesor);
}
