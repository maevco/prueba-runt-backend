package com.runt.prueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.runt.prueba.entity.Colegio;
import com.runt.prueba.repository.ColegioRepository;

@Service
public class ColegioServiceImpl implements ColegioServiceDecl {

	@Autowired
	private ColegioRepository colegioRepository;

	@Override
	public List<Colegio> getAllColegio() {
		return colegioRepository.findAll();
	}

	@Override
	public Colegio add(Colegio colegio) {
		return colegioRepository.save(colegio);
	}

}
