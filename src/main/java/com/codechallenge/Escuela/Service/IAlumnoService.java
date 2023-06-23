package com.codechallenge.Escuela.Service;

import java.util.List;

import com.codechallenge.Escuela.Model.Alumno;

public interface IAlumnoService {
	public List<Alumno> listar();
	public Alumno ListaAlumno(int ID);
	public int nuevoAlumno(Alumno a);
	public void borrarAlumno(int ID);
}
