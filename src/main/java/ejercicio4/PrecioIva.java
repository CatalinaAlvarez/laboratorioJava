package ejercicio4;

import java.util.Scanner;

public class PrecioIva {
    public static void main(String[] args) {
        final int porcentajeIva = 21;
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Calculadora de IVA");
            System.out.println("Por favor ingrese el valor del producto sin IVA: ");
            double precioProducto = input.nextDouble();
            double ivaProducto = (precioProducto * porcentajeIva)/100;
            double precioFinal = precioProducto + ivaProducto;
            System.out.println("El precio final es: " + precioFinal);
        }catch(Exception e){
            System.out.println("El dato ingresado no es un número");
        }
    }
}
