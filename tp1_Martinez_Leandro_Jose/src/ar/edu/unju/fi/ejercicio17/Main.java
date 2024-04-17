package ar.edu.unju.fi.ejercicio17;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {
	private static Scanner scanner;
	private static List<Jugador> jugadores;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		jugadores = new ArrayList<>();
		int option = 0;
		do {
			System.out.println("=======================");
			System.out.println("1 - Alta de jugador");
			System.out.println("2 - Mostrar los datos del jugador");
			System.out.println("3 - Mostrar jugadores por apellido");
			System.out.println("4 - Modificar jugador");
			System.out.println("5 - Eliminar jugador");
			System.out.println("6 - Mostrar cantidad de Jugadores");
			System.out.println("7 - Mostrar jugadores por nacionalidad");
			System.out.println("8 - Salir");
			System.out.println("=======================");
			
			option = scanner.nextInt();
			scanner.nextLine();
			
			switch (option) {
			case 1: agregarJugador();
				break;
			case 2: System.out.println("Opcion 2");
				break;
			case 3: mostrarJugadoresPorApellido();;
				break;
			case 4: System.out.println("Opcion 4");
				break;
			case 5: System.out.println("Opcion 5");
				break;
			case 6: System.out.println("Opcion 6");
				break;
			case 7: System.out.println("Opcion 7");
				break;
			case 8: System.out.println("Fin del programa...");
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
		} while(option !=8);
	}
	public static void mostrarJugadoresPorApellido() {
		if(jugadores.isEmpty()) {
			System.out.println("Lista vacia...");
		} else {
			System.out.println("--------- Lista de jugadores por apellido ----------");
			jugadores.sort(Comparator.comparing(Jugador::getApellido));
			jugadores.forEach(player -> System.out.println(player));
		}
	}
	public static void agregarJugador() {
		Jugador jugador = new Jugador();
		Calendar fechaNacimiento = Calendar.getInstance();
		
		System.out.println("Ingrese el nombre del jugador: ");
		jugador.setNombre(scanner.nextLine());
		
		System.out.println("Ingrese el apellido del jugador: ");
		jugador.setApellido(scanner.nextLine());
		
		System.out.println("Ingrese la fecha de nacimiento del jugador (dd/mm/yyyy): ");
		String fechaNacimientoStr = scanner.nextLine();
        String[] fechaParts = fechaNacimientoStr.split("/");
        int day = Integer.parseInt(fechaParts[0]);
        int month = Integer.parseInt(fechaParts[1]) - 1;
        int year = Integer.parseInt(fechaParts[2]);
        fechaNacimiento.set(year, month, day);
        jugador.setFechaDeNacimiento(fechaNacimiento);
        
        System.out.println("Ingrese la nacionalidad del jugador: ");
        jugador.setNacionalidad(scanner.nextLine());
        
        System.out.println("Ingrese la estatura en"+ " cm "+"del jugador: ");
        jugador.setEstatura(scanner.nextInt());
        
        System.out.println("Ingrese el peso del jugador: ");
        jugador.setPeso(scanner.nextInt());
        
        System.out.println("Ingrese la posicion del jugador: ");
        jugador.setPosicion(scanner.next());
        
        jugadores.add(jugador);
        
        System.out.println("Se agregó un nuevo jugador...");
	}
	
}
