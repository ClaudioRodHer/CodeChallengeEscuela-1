package com.codechallenge.Escuela.ModelDAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.codechallenge.Escuela.Model.Clase;

@Repository
public class ClaseDAO implements ClaseI{
	@Autowired
	private JdbcTemplate template;
	
	@Override
	public List<Clase> listarclase() {
		String sql="SELECT * FROM Clase";
		List<Clase>clase=template.query(sql, new BeanPropertyRowMapper<Clase>(Clase.class));
		return clase;
	}

	@Override
	public Clase ListaClase(int ID_CLASE) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int nuevaClase(Clase c) {
		String sql="insert into Clase(Nombres) values (?)";
		int res=template.update(sql,c.getNombre());
		return res; 
	}

	@Override
	public void borrarClase(int ID_CLASE) {
		// TODO Auto-generated method stub
		
	}

}
