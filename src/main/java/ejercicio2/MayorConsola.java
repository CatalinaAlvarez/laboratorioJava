package ejercicio2;

import java.util.Scanner;

public class MayorConsola {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Por favor ingresa un número: ");
            double primerNumero = input.nextDouble();
            System.out.println("Por favor ingresa otro número: ");
            double segundoNumero = input.nextDouble();
            if(primerNumero > segundoNumero){
                System.out.println(primerNumero + " es mayor que " + segundoNumero);
            }else if(primerNumero < segundoNumero){
                System.out.println(primerNumero + " es menor que " + segundoNumero);
            }else if(primerNumero == segundoNumero){
                System.out.println("Los números son iguales");
            }
        }catch (Exception e){
            System.out.println("Los datos ingresados no son números");
        }

    }
}
