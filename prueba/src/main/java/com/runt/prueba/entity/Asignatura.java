package com.runt.prueba.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "Asignatura")
@Table(name = "asignatura")
public class Asignatura {

	private Long id;
	private Materia materia;
	private Profesor profesor;
	private Curso curso;
	private List<Estudiante> estudiantes = new ArrayList<>();

	public Asignatura() {
	}

	public Asignatura(Materia materia, Profesor profesor, Curso curso) {
		this.materia = materia;
		this.profesor = profesor;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne
	@JoinColumn(name = "materia_id")
	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	@ManyToOne
	@JoinColumn(name = "profesor_id")
	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	@ManyToOne
	@JoinColumn(name = "curso_id")
	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@ManyToMany(fetch = FetchType.LAZY, cascade = {
	        CascadeType.PERSIST,
	        CascadeType.MERGE
	    })
	@JoinTable(name = "asignatura_estudiante", joinColumns = {
			@JoinColumn(name = "asignatura_id",referencedColumnName = "id") }, inverseJoinColumns = { @JoinColumn(name = "estudiante_id",referencedColumnName = "id") })
	public List<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(List<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Asignatura)) return false;
        return id != null && id.equals(((Asignatura) o).getId());
    }
 
    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

}
