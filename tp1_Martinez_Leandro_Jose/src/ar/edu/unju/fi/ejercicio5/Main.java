package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un numero dentro del rango [1,9]");
		int numero = scanner.nextInt();
		
		if(numero < 1 || numero > 9) {
			System.out.println("El numero debe estar dentro del rango [1,9]");
		} else {
			for(int i = 0; i <= 10; i++) {
				System.out.println(numero + " * " + i + " = " + numero * i);
			}
		}
	}

}
