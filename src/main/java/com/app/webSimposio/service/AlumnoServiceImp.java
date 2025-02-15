package com.app.webSimposio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.webSimposio.entidad.Alumno;
import com.app.webSimposio.repository.AlumnoRepository;

@Service
public class AlumnoServiceImp implements AlumnoService{

	@Autowired
	private AlumnoRepository repository;
	
	
	@Override
	public List<Alumno> listaDeAlumnos() {
		return repository.findAll();
	}

	@Override
	public Alumno registrarAlumno(Alumno alumno) {
		return repository.save(alumno);
		
	}

	@Override
	public Alumno buscarAlumnoId(Integer id) {
		return repository.findById(id).get();
		
	}

	@Override
	public Alumno actualizarAlumnoId(Alumno alumno) {
		return repository.save(alumno);
	}

	@Override
	public void borrarAlumno(Integer id) {
		repository.deleteById(id);
		
	}

}
