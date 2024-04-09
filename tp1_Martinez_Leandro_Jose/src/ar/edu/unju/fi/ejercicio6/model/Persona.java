package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	private String dni;
	private String nombre;
	private LocalDate fechaDeNacimiento;
	private String provincia;
	
	public Persona () {}
	
	public int calcularEdad () {
		 LocalDate fechaActual = LocalDate.now();
		 int edad = fechaActual.getYear() - this.getFechaDeNacimiento().getYear();
		 if (fechaActual.getMonthValue() < fechaDeNacimiento.getMonthValue() ||
		    (fechaActual.getMonthValue() == fechaDeNacimiento.getMonthValue() &&
		     fechaActual.getDayOfMonth() < fechaDeNacimiento.getDayOfMonth())) {
		        edad--;
		  }
		 return edad;   
	}
	
	public void mostrarDatos () {
		String esMayorDeEdad;
		if(verificarEdad()) {
			esMayorDeEdad = "La persona es mayor de edad";
		}else {
			esMayorDeEdad = "La persona no es mayor de edad";
		}
		System.out.println("DNI: " + this.getDni() + " | " + "Nombre: " + this.getNombre() + " | " + "Fecha de Nacimiento: " + this.getFechaDeNacimiento() 
		+ " | " + "Provincia: " + this.getProvincia() + " | " + "Edad: " + calcularEdad() + " | " + esMayorDeEdad);  
	}
	
	public Boolean verificarEdad () {
		return calcularEdad() >= 18;
	}
	
	public Persona(String dni, String nombre, LocalDate fechaDeNacimiento, String provincia) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.provincia = provincia;
	}
	
	public Persona(String dni, String nombre, LocalDate fechaDeNacimiento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.provincia = "Jujuy";
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	
}
