package com.codechallenge.Escuela.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codechallenge.Escuela.Model.Clase;
import com.codechallenge.Escuela.ModelDAO.ClaseI;
@Service
public class ClaseService implements IClaseService {

	@Autowired
	private ClaseI daoclase;
	
	@Override
	public List<Clase> listarclase() {
		// TODO Auto-generated method stub
		return daoclase.listarclase();
	}

	@Override
	public Clase ListaClase(int ID_CLASE) {
		daoclase.listarclase();
		return null;
	}

	@Override
	public int nuevaClase(Clase c) {
		daoclase.nuevaClase(c);
		return 0;
	}

	@Override
	public void borrarClase(int ID_CLASE) {
		daoclase.borrarClase(ID_CLASE);
		
	}

}
