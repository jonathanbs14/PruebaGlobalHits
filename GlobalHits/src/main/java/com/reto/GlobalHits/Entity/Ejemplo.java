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
    @NamedStoredProcedureQuery(name = "Ejemplo.sp_ejemplo",
            procedureName = "sp_ejemplo",
            parameters = {
                    @StoredProcedureParameter(name = "nombre", type = String.class, mode = ParameterMode.IN),
                    @StoredProcedureParameter(name = "fec_registro", type = Date.class, mode = ParameterMode.IN),
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
    private Date fec_registro;
    @Column
	private String cursor;
    @Column
	private String  codigo;
    @Column
	private String mensaje ;
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFec_registro() {
		return fec_registro;
	}
	public void setFec_registro(Date fec_registro) {
		this.fec_registro = fec_registro;
	}
	public String getCursor() {
		return cursor;
	}
	public void setCursor(String cursor) {
		this.cursor = cursor;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}


}

