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
@Table(name = "profesor")
public class Profesor {

	private Long id;
	private String nombre;
	//private List<Asignatura> asignaturas = new ArrayList<>();

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "nombre")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

//	@OneToMany(cascade = CascadeType.ALL, targetEntity = Asignatura.class,fetch = FetchType.LAZY)
//	@JoinColumn(name = "profesor_id", referencedColumnName = "id")
//	public List<Asignatura> getAsignaturas() {
//		return asignaturas;
//	}
//
//	public void setAsignaturas(List<Asignatura> asignaturas) {
//		this.asignaturas = asignaturas;
//	}

}
