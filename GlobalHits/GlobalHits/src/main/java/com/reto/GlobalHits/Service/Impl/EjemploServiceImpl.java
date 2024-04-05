package com.reto.GlobalHits.Service.Impl;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.reto.GlobalHits.Entity.Ejemplo;
import com.reto.GlobalHits.Service.EjemploService;
import com.reto.GlobalHits.repository.EjemploRepository;

import jakarta.transaction.Transactional;
@Service
public class EjemploServiceImpl implements EjemploService{
	
	@Autowired
	private EjemploRepository repository;
	
	@Override
	@Transactional
	public Ejemplo getEjemplo(String nombre, Date fecha) {
		return repository.getTotalCarsByModelEntiy(nombre,fecha);
		
	}
	
}
