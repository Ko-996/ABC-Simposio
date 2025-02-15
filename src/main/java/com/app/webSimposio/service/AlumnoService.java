package com.app.webSimposio.service;

import java.util.List;
import com.app.webSimposio.entidad.Alumno;

public interface AlumnoService {
	
	public List<Alumno> listaDeAlumnos();
	
	public Alumno registrarAlumno(Alumno alumno);
	
	public Alumno buscarAlumnoId(Integer id);
	
	public Alumno actualizarAlumnoId(Alumno alumno);
	
	public void borrarAlumno(Integer id);

}
