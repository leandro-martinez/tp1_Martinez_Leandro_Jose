package ar.edu.unju.fi.ejercicio18;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {
	private static Scanner scanner;
	private static List<Pais> paises;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		precargarPaises();
		
		int option = 0;
		try {
			do {
				System.out.println("=======================");
				System.out.println("1 - Alta de destino turístico");
				System.out.println("2 - Mostrar todos los destinos turísticos");
				System.out.println("3 - Modificar el país de un destino turístico");
				System.out.println("4 - Limpiar arrayList de destino turísticos");
				System.out.println("5 - Eliminar un destino turístico");
				System.out.println("6 - Mostrar destinos turísticos ordenados por nombre");
				System.out.println("7 - Mostrar todos los países");
				System.out.println("8 - Mostrar destinos turísticos por país");
				System.out.println("9 - Salir");
				System.out.println("=======================");
				
				option = scanner.nextInt();
				scanner.nextLine();
				
				switch (option) {
				case 1: System.out.println("opcion 1");
					break;
				case 2: System.out.println("opcion 2");
					break;
				case 3: System.out.println("opcion 3");
					break;
				case 4: System.out.println("opcion 4");
					break;
				case 5: System.out.println("opcion 5");
					break;
				case 6: System.out.println("opcion 6");
					break;
				case 7: mostrarPaises();
					break;
				case 8: System.out.println("opcion 8");
					break;
				case 9: System.out.println("Fin del programa...");
					break;
				default:
					System.out.println("Opcion incorrecta");
					break;
				}
			} while(option != 9);
		} catch(InputMismatchException ex){
			System.out.println("Opcion no válida");
		}
	}
	public static void precargarPaises () {
		if(paises == null) {
			paises = new ArrayList<>();
		}
		paises.add(new Pais("ARG", "Argentina"));
		paises.add(new Pais("BOL", "Bolivia"));
		paises.add(new Pais("CHL", "Chile"));	
	}
	public static void mostrarPaises() {
		System.out.println("--------- Lista de Paises ----------");
		paises.forEach(pais -> System.out.println(pais));
	}

}
