package ejercicio14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumeroMas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List listaNumeros = new ArrayList();
        try {
            System.out.println("Por favor ingrese un número entero: ");
            int numero = input.nextInt();
            for(int i = numero; i<=1000; i++){
                listaNumeros.add(i);
                i+=1;
            }
            System.out.println("Los números de 2 en 2 hasta el mil son: ");
            System.out.println(listaNumeros);
        }catch(Exception e){
            System.out.println("El dato ingresado no es un número entero");
        }

    }
}
