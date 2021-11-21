package ejercicio3;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        final double pi = Math.PI;
        Scanner input = new Scanner(System.in);
        Double radio, area;
        try {
            System.out.println("Calculador de área de círculo");
            System.out.println("Por favor ingrese el radio del círculo: ");
            radio = Double.parseDouble(input.nextLine());
            area = pi * (Math.pow(radio, 2));
            System.out.println("El área del círculo es: " + area);
        }catch (Exception e){
            System.out.println("El dato ingresado es incorrecto");
        }
    }
}
