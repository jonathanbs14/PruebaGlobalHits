package com.reto.GlobalHits.repository;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.reto.GlobalHits.Entity.Ejemplo;

@Repository
public interface EjemploRepository extends JpaRepository<Ejemplo, Integer> {

	
	@Procedure(name = "Ejemplo.getCodigoEjemplo")
	public void getTotalCarsByModelEntiy(@Param("nombre") String nombre, @Param("fec_registro") Date fecha);
}




