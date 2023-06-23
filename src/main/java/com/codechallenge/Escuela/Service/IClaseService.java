package com.codechallenge.Escuela.Service;

import java.util.List;

import com.codechallenge.Escuela.Model.Clase;

public interface IClaseService {
	public List<Clase> listarclase();
	public Clase ListaClase(int ID_CLASE);
	public int nuevaClase(Clase c);
	public void borrarClase(int ID_CLASE);
}
