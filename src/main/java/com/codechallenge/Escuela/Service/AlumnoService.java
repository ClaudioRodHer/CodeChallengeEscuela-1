package com.codechallenge.Escuela.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codechallenge.Escuela.Model.Alumno;
import com.codechallenge.Escuela.ModelDAO.AlumnoI;

@Service
public class AlumnoService implements IAlumnoService{
	
	@Autowired
	private AlumnoI dao;
	
	@Override
	public List<Alumno> listar() {
		// TODO Auto-generated method stub
		return dao.listar();
	}

	@Override
	public Alumno ListaAlumno(int ID) {
		dao.listar();
		return null;
	}

	@Override
	public int nuevoAlumno(Alumno a) {
		dao.nuevoAlumno(a);
		return 0;
	}

	@Override
	public void borrarAlumno(int ID) {
		// TODO Auto-generated method stub
		
	}

}
