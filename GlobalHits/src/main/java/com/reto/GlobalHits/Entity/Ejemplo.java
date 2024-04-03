package com.reto.GlobalHits.Entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedStoredProcedureQueries;
import jakarta.persistence.NamedStoredProcedureQuery;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureParameter;
import jakarta.persistence.Table;


@Entity
@Table
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(name = "Ejemplo.getCodigoEjemplo",
            procedureName = "GET_CODIGOS",
            parameters = {
                    @StoredProcedureParameter(name = "nombre", type = String.class, mode = ParameterMode.IN),
                    @StoredProcedureParameter(name = "fec_registro", type = String.class, mode = ParameterMode.IN),
                    @StoredProcedureParameter(name = "cursor", type = String.class, mode = ParameterMode.OUT),
                    @StoredProcedureParameter(name = "codigo", type = String.class, mode = ParameterMode.OUT),
                    @StoredProcedureParameter(name = "mensaje", type = String.class, mode = ParameterMode.OUT)
            }
    )
})
public class Ejemplo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;
    
    @Column
    private String nombre;
    @Column
    private Date fechRegistro;
    @Column
	private String cursor;
    @Column
	private String  codigo;
    @Column
	private String mensaje ;
   // standard getters and setters
}

