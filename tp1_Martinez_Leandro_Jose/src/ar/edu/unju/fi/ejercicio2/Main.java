package ar.edu.unju.fi.ejercicio2;

public class Main {

	public static void main(String[] args) {
		String nombrePais, numeroTelefono;
		int edadPersona;
		double alturaEdificio, precioProducto, coseno;
		
		nombrePais = "Argentina";
        edadPersona = 20;
        alturaEdificio = 145.5; 
        precioProducto = 34.99;
        numeroTelefono = "+54119999";
        coseno = Math.cos(0.5);

        System.out.println("Nombre del país: " + nombrePais);
        System.out.println("Edad de la persona: " + edadPersona + " años");
        System.out.println("Altura del edificio: " + alturaEdificio + " metros");
        System.out.println("Precio del producto: $" + precioProducto);
        System.out.println("Número de teléfono: " + numeroTelefono);
        System.out.println("Coseno de 0.5: " + coseno);
	}

}
