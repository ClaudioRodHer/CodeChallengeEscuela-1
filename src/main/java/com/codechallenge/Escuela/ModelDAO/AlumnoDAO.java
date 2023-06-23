package com.codechallenge.Escuela.ModelDAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.codechallenge.Escuela.Model.Alumno;

@Repository
public class AlumnoDAO implements AlumnoI{

	@Autowired
	private JdbcTemplate template;
	
	@Override
	public List<Alumno> listar() {
		String sql="SELECT * FROM Alumno";
		List<Alumno>alumnos=template.query(sql, new BeanPropertyRowMapper<Alumno>(Alumno.class));
		return alumnos;
	}

	@Override
	public Alumno ListaAlumno(int ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int nuevoAlumno(Alumno a) {
		String sql="insert into Alumno(Nombres,Apellidos,Fecha_de_Nacimiento) values (?,?,?)";
		int res=template.update(sql,a.getNombres(),a.getApellidos(),a.getFecha_de_Nacimiento());
		return res; 
	}

	@Override 
	public void borrarAlumno(int ID) {
		// TODO Auto-generated method stub
		
	}
}
