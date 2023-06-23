package com.codechallenge.Escuela.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Clase {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID_Clase;
	@Column
	private String Nombre;
	
	public int getID_Clase() {
		return ID_Clase;
	}
	public void setID_Clase(int iD_Clase) {
		ID_Clase = iD_Clase;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

}
