package com.runt.prueba.entity;

import java.io.Serializable;

public class AsignaturaEnvio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private String materia;
	private String profesor;
	private int grado;
	private String salon;
	private String estudiante;

	public AsignaturaEnvio() {

	}

	public AsignaturaEnvio(long id, String materia, String profesor, int grado, String salon, String estudiante) {
		this.id = id;
		this.materia = materia;
		this.profesor = profesor;
		this.grado = grado;
		this.salon = salon;
		this.estudiante = estudiante;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	public int getGrado() {
		return grado;
	}

	public void setGrado(int grado) {
		this.grado = grado;
	}

	public String getSalon() {
		return salon;
	}

	public void setSalon(String salon) {
		this.salon = salon;
	}

	public String getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(String estudiante) {
		this.estudiante = estudiante;
	}

}
