package ejercicio9;

import java.util.Scanner;

public class LetraE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String texto = "La sonrisa sera la mejor arma contra la tristeza";
        String textoConE =  texto.replace("a", "e");
        System.out.println("Ingrese una frase: ");
        String textoConcatenar = input.nextLine();
        System.out.println(textoConE + " " + textoConcatenar);
    }
}
