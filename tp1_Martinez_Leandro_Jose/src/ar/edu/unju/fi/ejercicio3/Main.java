package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un numero entero: ");
		int numero = sc.nextInt();
		if(numero % 2 == 0) {
			System.out.println("Triple: " + numero * 3);
		}else {
			System.out.println("Doble: " + numero * 2);
		}
		sc.close();
	}

}
