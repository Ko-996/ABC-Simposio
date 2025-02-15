package com.app.webSimposio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.webSimposio.entidad.Alumno;
import com.app.webSimposio.service.AlumnoService;

@Controller
public class AlumnoController {

	@Autowired
	private AlumnoService service;
	
	@GetMapping({"/alumnos","/"})
	public String listarAlumnos(Model modelo){
		modelo.addAttribute("alumnos", service.listaDeAlumnos());
		
		/*Alumno alumno = new Alumno();
        modelo.addAttribute("alumno", alumno);*/
		
		return "alumnos";
	}
	
	@GetMapping("/alumnos/nuevo")
	public String formularioRegistro(Model modelo) {
		Alumno alumno = new Alumno();
		modelo.addAttribute("alumno",alumno);
		return "crear_registro";
		}
	
	@PostMapping("/alumnos")
	public String registrarAlumno(@ModelAttribute("alumno") Alumno alumno) {
		service.registrarAlumno(alumno);
		return "redirect:/alumnos";	
	}
	
	@GetMapping("/alumnos/editar/{id}")
	public String formularioEditar(@PathVariable Integer id, Model modelo) {
		modelo.addAttribute("alumno", service.buscarAlumnoId(id));
		return "editar_alumno";
	}
	
	@PostMapping("/alumnos/{id}")
	public String actualizarAlumnoId(@PathVariable Integer id, @ModelAttribute("alumno") Alumno alumno,Model modelo) {
		Alumno alumnoExistente = service.buscarAlumnoId(id);
		alumnoExistente.setId(id);
		alumnoExistente.setCarnet_carrera(alumno.getCarnet_carrera());
		alumnoExistente.setCarnet_ano(alumno.getCarnet_ano());
		alumnoExistente.setCarnet_serie(alumno.getCarnet_serie());
		alumnoExistente.setPrimer_nombre(alumno.getPrimer_nombre());
		alumnoExistente.setSegundo_nombre(alumno.getSegundo_nombre());
		alumnoExistente.setPrimer_apellido(alumno.getPrimer_apellido());
		alumnoExistente.setSegundo_apellido(alumno.getSegundo_apellido());
		alumnoExistente.setTelefono(alumno.getTelefono());
		alumnoExistente.setCorreo(alumno.getCorreo());
		alumnoExistente.setFecha_nacimiento(alumno.getFecha_nacimiento());
		
		service.actualizarAlumnoId(alumnoExistente);
		
		return "redirect:/alumnos";
	}
	
	@GetMapping("/alumnos/{id}")
	public String borrarAlumno(@PathVariable Integer id) {
		service.borrarAlumno(id);
		return "redirect:/alumnos";
	}
	
	
}
