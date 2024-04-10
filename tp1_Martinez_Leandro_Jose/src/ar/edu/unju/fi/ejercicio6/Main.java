package ar.edu.unju.fi.ejercicio6;

import java.time.LocalDate;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio6.model.Persona;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        // Crear hasta 3 objetos Persona
        for (int i = 1; i <= 3; i++) {
            System.out.println("Ingrese los datos para la persona " + i + ":");
            System.out.print("DNI: ");
            String dni = scanner.nextLine();

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Fecha de nacimiento (formato AAAA-MM-DD): ");
            String fechaNacimientoStr = scanner.nextLine();
            LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr);

            System.out.print("Provincia: ");
            String provincia = scanner.nextLine();

            // Crear el objeto Persona
            Persona persona = new Persona(dni, nombre, fechaNacimiento, provincia);
            persona.mostrarDatos();
            System.out.println("----------"); 
        }
        scanner.close();
	}

}
