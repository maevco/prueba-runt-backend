package com.runt.prueba.service;

import java.util.List;

import com.runt.prueba.entity.Colegio;

public interface ColegioServiceDecl {

	/**
	 * 
	 * @return
	 */
	public List<Colegio> getAllColegio();

	/**
	 * 
	 * @param colegio
	 * @return
	 */
	public Colegio add(Colegio colegio);

}
