package com.runt.prueba.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "curso")
public class Curso {

	private Long id;
	private int grado;
	private String salon;
	private List<Asignatura> asignaturas = new ArrayList<>();

	public Curso() {
	}

	public Curso(int grado, String salon) {
		super();
		this.grado = grado;
		this.salon = salon;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "grado")
	public int getGrado() {
		return grado;
	}

	public void setGrado(int grado) {
		this.grado = grado;
	}

	@Column(name = "salon")
	public String getSalon() {
		return salon;
	}

	public void setSalon(String salon) {
		this.salon = salon;
	}

	@OneToMany(cascade = CascadeType.ALL,targetEntity = Asignatura.class,fetch = FetchType.LAZY)
	@JoinColumn(name = "curso_id", referencedColumnName = "id")
	public List<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(List<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}
	
	

}
