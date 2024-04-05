package com.reto.GlobalHits.Service;

import java.sql.Date;

import com.reto.GlobalHits.Entity.Ejemplo;



public interface EjemploService {
	
	Ejemplo getEjemplo(String nombre,  Date fecha);
	

}
