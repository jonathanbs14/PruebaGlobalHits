package com.reto.GlobalHits.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reto.GlobalHits.Dao.In;
import com.reto.GlobalHits.Dao.Out;
import com.reto.GlobalHits.Entity.Ejemplo;
import com.reto.GlobalHits.repository.EjemploRepository;


@RestController
public class Controller {
	
	@Autowired
	private EjemploRepository repository;
	
	
	@PostMapping("/codigos")
	public Out grabar(In  in) {

		
		
		
	Out afuera = new Out();


	
	repository.getTotalCarsByModelEntiy(in.getNombre(), in.getFechRegistro());
	
	
	
	afuera.setCodigo("1234526789");
	afuera.setCursor("Prueba");
	afuera.setMensaje("gracias");
	return afuera;
	}
	
	
}
