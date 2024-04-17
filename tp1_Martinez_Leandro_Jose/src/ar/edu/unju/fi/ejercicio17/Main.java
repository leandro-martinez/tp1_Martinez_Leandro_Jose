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

		} while(option !=8);

	}
	
}
