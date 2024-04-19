package ar.edu.unju.fi.ejercicio18;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {
	private static Scanner scanner;
	private static List<Pais> paises;
	private static List<DestinoTuristico> destinosTuristicos;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		destinosTuristicos = new ArrayList<>();
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
				case 1: agregarDestino();
					break;
				case 2: mostrarDestinosTuristicos();
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
	public static void agregarDestino () {
		DestinoTuristico destino = new DestinoTuristico();
		String codigoPais = "";
		Pais paisAsociado = null;
		
		do {
			System.out.println("Ingrese el código del destino turistico (país): ");
			codigoPais = scanner.next();
		
			for (Pais pais : paises) {
				if (pais.getCodigo().equalsIgnoreCase(codigoPais)) {
					paisAsociado = pais;
				}
			}
		} while(paisAsociado == null);
		
        try {
        	destino.setPais(paisAsociado);
            System.out.println("Ingrese el codigo del destino turistico: ");
            destino.setCodigo(scanner.next());
            System.out.println("Ingrese nombre del destino: ");
            destino.setNombre(scanner.next());
            System.out.println("Ingrese el precio: ");
            destino.setPrecio(scanner.nextInt());
            System.out.println("Ingrese la cantidad de dias: ");
            destino.setCantDias(scanner.nextInt());
            
            destinosTuristicos.add(destino);
            System.out.println("Se agregó un nuevo destino turistico...");
        } catch (InputMismatchException ex) {
        	System.out.println("Tipo de dato no válido");
        }
	}
	public static void mostrarDestinosTuristicos() {
		System.out.println("----------- Destinos Turisticos ------------");
		destinosTuristicos.forEach(destino -> System.out.println(destino));
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
