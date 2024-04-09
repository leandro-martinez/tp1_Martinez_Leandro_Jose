package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	private String nombre;
	private Integer legajo;
	private Double salario;
	private static final Double SALARIO_MINIMO = 210000.00;
	private static final Double AUMENTO_POR_MERITOS = 20000.00;
	
	public Empleado () {}

	public Empleado(String nombre, Integer legajo, Double salario) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
		if(salario >= SALARIO_MINIMO) {
			this.salario = salario;			
		} else {
			this.salario = SALARIO_MINIMO;
		}
	}
	
	public void mostrarDatos () {
		System.out.println("Nombre del empleado: " + this.getNombre() + "\n" + "Legajo: " + this.getLegajo()
		+ "\n" + "Salario: $" + this.getSalario());
	}
	
	public void darAumento () {
		this.salario = salario + AUMENTO_POR_MERITOS;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getLegajo() {
		return legajo;
	}

	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
}
