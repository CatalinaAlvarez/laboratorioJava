package ejercicio7;

import java.util.Scanner;

public class MayorQueCero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double numero;
        try {
            do {
                System.out.println("Por favor ingrese un número");
                numero = input.nextDouble();
            } while (numero <= 0);
            System.out.println("El número ingresado es: " + numero);
        }catch (Exception e){
            System.out.println("El dato ingresado no es correcto");
        }
    }
}
