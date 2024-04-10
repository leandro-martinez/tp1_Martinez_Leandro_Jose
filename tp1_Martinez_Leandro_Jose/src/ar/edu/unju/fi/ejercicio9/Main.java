package ar.edu.unju.fi.ejercicio9;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        for (int i = 1; i <= 3; i++) {
            System.out.println("Ingrese los datos para el producto " + i + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.next();
            
            scanner.nextLine();
            
            System.out.print("Código: ");
            Integer codigo = scanner.nextInt();
            System.out.print("Precio: ");
            Integer precio = scanner.nextInt();   
            System.out.print("Descuento: ");
            Integer descuento = scanner.nextInt();
            Producto producto = new Producto(nombre, codigo, precio);
            producto.setDescuento(descuento);
            producto.mostrarDatos();
            System.out.println("----------");
        }
        scanner.close();
	}

}
