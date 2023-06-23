package com.codechallenge.Escuela.Model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alumno {
	@Id
	private int ID;
	@Column
	private String Nombres;
	@Column
	private String Apellidos;
	@Column
	private Date Fecha_de_Nacimiento;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNombres() {
		return Nombres;
	}
	public void setNombres(String nombres) {
		Nombres = nombres;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public Date getFecha_de_Nacimiento() {
		return Fecha_de_Nacimiento;
	}
	public void setFecha_de_Nacimiento(Date fecha_de_Nacimiento) {
		Fecha_de_Nacimiento = fecha_de_Nacimiento;
	}
//este es un comentario 2
}
