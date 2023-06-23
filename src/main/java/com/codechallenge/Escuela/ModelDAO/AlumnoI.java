package com.codechallenge.Escuela.ModelDAO;

import java.util.List;


import com.codechallenge.Escuela.Model.Alumno;

public interface AlumnoI  {//extends CrudRepository<Alumno, ID>
	public List<Alumno> listar();
	public Alumno ListaAlumno(int ID);
	public int nuevoAlumno(Alumno a);
	public void borrarAlumno(int ID);
	
}
