package ejercicio11;

import java.util.Scanner;

public class LongitudFrase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Por favor ingrese una frase: ");
        String frase = input.nextLine().toLowerCase();
        int longitudFrase = frase.length();
        int vocales = 0;
        for(int i=0;i<frase.length();i++) {
            if ((frase.charAt(i)=='a') || (frase.charAt(i)=='e') || (frase.charAt(i)=='i')
                    || (frase.charAt(i)=='o') || (frase.charAt(i)=='u')){
                vocales++;
            }
        }
        System.out.println("La frase tiene una longitud de " + longitudFrase +
                " letras y tiene " + vocales + " vocales");
    }
}
