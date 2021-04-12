package com.runt.prueba.service;

import java.util.List;

import com.runt.prueba.entity.Curso;

public interface CursoServiceDecl {

	/**
	 * 
	 * @return
	 */
	public List<Curso> getAllCurso();

	/**
	 * 
	 * @param curso
	 * @return
	 */
	public Curso add(Curso curso);
}
