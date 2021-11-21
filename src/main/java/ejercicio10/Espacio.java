package ejercicio10;

import java.util.Scanner;

public class Espacio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Por favor ingrese una frase: ");
        String frase = input.nextLine();
        System.out.println(frase.replace(" ", ""));
    }
}
