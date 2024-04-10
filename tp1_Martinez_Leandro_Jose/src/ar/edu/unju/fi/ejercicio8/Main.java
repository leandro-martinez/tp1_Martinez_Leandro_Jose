package ar.edu.unju.fi.ejercicio8;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese un numero entero: ");
		Integer n = scanner.nextInt();
		CalculadoraEspecial calculadora = new CalculadoraEspecial(n);
		System.out.println(calculadora.calcularSumatoria());
		System.out.println(calculadora.calcularProductoria());
		scanner.close();
	}

}
