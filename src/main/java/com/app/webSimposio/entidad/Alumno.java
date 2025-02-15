package com.app.webSimposio.entidad;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name="registro_alumno")

public class Alumno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name= "carnet_carrera",nullable = false)
	private int carnet_carrera;
	
	@Column(name= "carnet_ano",nullable = false)
	private int carnet_ano;
	
	@Column(name= "carnet_serie",nullable = false)
	private int carnet_serie;
	
	@Column(name= "primer_nombre",nullable = false,length=20)
	private String primer_nombre;
	
	@Column(name= "segundo_nombre",nullable = false,length=20)
	private String segundo_nombre;
	
	@Column(name= "primer_apellido",nullable = false,length=20)
	private String primer_apellido;
	
	@Column(name= "segundo_apellido",nullable = false,length=20)
	private String segundo_apellido;
	
	@Column(name= "telefono",nullable = false)
	private int telefono;
	
	@Column(name= "correo",nullable = false,length=50,unique=true)
	private String correo;
	
	@Column(name= "fecha_nacimiento",nullable = false)
	private LocalDate fecha_nacimiento;
	
	@Column(name= "fecha_registro",nullable=true, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private LocalDateTime fecha_registro;
	
	@PrePersist
    protected void onCreate() {
        this.fecha_registro = LocalDateTime.now();
    }
	
	
	public Alumno() {
		
	}


	public Alumno(int id, int carnet_carrera, int carnet_ano, int carnet_serie, String primer_nombre,
			String segundo_nombre, String primer_apellido, String segundo_apellido, int telefono, String correo, LocalDate fecha_nacimiento, LocalDateTime fecha_registro) {
		super();
		this.id = id;
		this.carnet_carrera = carnet_carrera;
		this.carnet_ano = carnet_ano;
		this.carnet_serie = carnet_serie;
		this.primer_nombre = primer_nombre;
		this.segundo_nombre = segundo_nombre;
		this.primer_apellido = primer_apellido;
		this.segundo_apellido = segundo_apellido;
		this.telefono = telefono;
		this.correo = correo;
		this.fecha_nacimiento = fecha_nacimiento;
		this.fecha_registro = fecha_registro;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getCarnet_carrera() {
		return carnet_carrera;
	}


	public void setCarnet_carrera(int carnet_carrera) {
		this.carnet_carrera = carnet_carrera;
	}


	public int getCarnet_ano() {
		return carnet_ano;
	}


	public void setCarnet_ano(int carnet_ano) {
		this.carnet_ano = carnet_ano;
	}


	public int getCarnet_serie() {
		return carnet_serie;
	}


	public void setCarnet_serie(int carnet_serie) {
		this.carnet_serie = carnet_serie;
	}


	public String getPrimer_nombre() {
		return primer_nombre;
	}


	public void setPrimer_nombre(String primer_nombre) {
		this.primer_nombre = primer_nombre;
	}


	public String getSegundo_nombre() {
		return segundo_nombre;
	}


	public void setSegundo_nombre(String segundo_nombre) {
		this.segundo_nombre = segundo_nombre;
	}


	public String getPrimer_apellido() {
		return primer_apellido;
	}


	public void setPrimer_apellido(String primer_apellido) {
		this.primer_apellido = primer_apellido;
	}


	public String getSegundo_apellido() {
		return segundo_apellido;
	}


	public void setSegundo_apellido(String segundo_apellido) {
		this.segundo_apellido = segundo_apellido;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}


	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
	public LocalDateTime getFecha_registro() {
		return fecha_registro;
	}


	public void setFecha_registro(LocalDateTime fecha_registro) {
		this.fecha_registro = fecha_registro;
	}


	@Override
	public String toString() {
		return "Alumno [id=" + id + ", carnet_carrera=" + carnet_carrera + ", carnet_ano=" + carnet_ano
				+ ", carnet_serie=" + carnet_serie + ", primer_nombre=" + primer_nombre + ", segundo_nombre="
				+ segundo_nombre + ", primer_apellido=" + primer_apellido + ", segundo_apellido=" + segundo_apellido
				+ ", telefono=" + telefono + ", correo=" + correo + ", fecha_nacimiento="+ fecha_nacimiento +", fecha_registro="+ fecha_registro+  "]";
	}
/*	*/





}
