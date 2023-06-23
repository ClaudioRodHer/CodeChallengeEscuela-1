package com.codechallenge.Escuela;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class CodeChallengeEscuela1Application implements CommandLineRunner{
	@Autowired
	private JdbcTemplate template;
	
	public static void main(String[] args) {
		SpringApplication.run(CodeChallengeEscuela1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		template.execute("Drop table Alumno IF EXISTS");
		template.execute("Drop Table Clase IF EXISTS");
		template.execute("Drop Table Alumnos_Clases IF EXISTS");
		template.execute("create table Alumno(\n"
				+ "ID  integer primary key auto_increment ,\n"
				+ "Nombres varchar(255),\n"
				+ "Apellidos varchar(255),\n"
				+ "Fecha_de_Nacimiento date \n"
				+ ");");
		template.execute("create table Clase(\n"
				+ "ID_Clase  integer auto_increment primary key,\n"
				+ "Nombres varchar(255)\n"
				+ ")");
		template.execute("create table Alumnos_Clases(\n"
				+ "ID_AC  int auto_increment primary key,\n"
				+ "Alumno_ID integer ,\n"
				+ "Clase_ID integer ,\n"
				+ "Foreign key(Alumno_ID) references ALUMNO (ID),\n"
				+ "Foreign key(Clase_ID) references CLASE (ID_CLASE )\n"
				+ ")");
		
		for (int i=0;i<3;i++) {

			
			template.update("insert into ALUMNO(Nombres,Apellidos,Fecha_de_Nacimiento) values ('jose"+i+"','arias','2000-02-03')");
			template.update("insert into CLASE(Nombres) values ('materia "+i+"')");
			
		}
	}
}
