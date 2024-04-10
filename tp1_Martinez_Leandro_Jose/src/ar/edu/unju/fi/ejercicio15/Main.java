package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		do {
			System.out.println("Ingrese un numero dentro del rango [5,10]: ");
			numero = scanner.nextInt();
		} while(!(numero >= 5 && numero <=10));
		
		String[] myArray = new String[numero];
		scanner.nextLine();
		for(int i = 0; i < myArray.length; i++) {
			System.out.println("Ingrese un nombre: ");
			myArray[i] = scanner.nextLine();
		}
		System.out.println("----------");
		for(int i = 0; i < myArray.length; i++) {
			System.out.println("Indice: " + i + " | " + "Valor: " + myArray[i]);
		}
		System.out.println("----------");
		for(int i = myArray.length - 1; i >= 0; i--) {
			System.out.println("Indice: " + i + " | " + "Valor: " + myArray[i]);
		}
		scanner.close();
	}	

}
