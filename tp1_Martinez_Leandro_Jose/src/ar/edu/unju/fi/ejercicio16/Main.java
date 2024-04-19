package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] nombres = new String[5];

        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese un nombre " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
        }

        System.out.println("--------- Valores del Arreglo ---------");
        for (String nombre : nombres) {
        
            System.out.println(nombre);
        }
        System.out.println("Tamaño del arreglo: " + nombres.length);
        // Solicitar al usuario el índice del elemento a eliminar
        byte indiceAEliminar;
        do {
            System.out.print("Ingrese el índice del elemento a eliminar (0-" + (nombres.length - 1) + "): ");
            indiceAEliminar = scanner.nextByte();
        } while (indiceAEliminar < 0 || indiceAEliminar >= nombres.length);

        // Eliminar el elemento del arreglo y ajustar los demás elementos
        for (int i = indiceAEliminar; i < nombres.length - 1; i++) {
            nombres[i] = nombres[i + 1];
        }
        nombres[nombres.length - 1] = "";
        
        System.out.println("---------- Nuevo arreglo ----------");
        for (String nombre : nombres) {
            if (!nombre.isEmpty()) {
                System.out.println(nombre);
            }
        }
        scanner.close();
	}

}
