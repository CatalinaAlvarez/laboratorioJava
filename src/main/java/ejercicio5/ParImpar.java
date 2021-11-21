package ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class ParImpar {
    public static void main(String[] args) {
        List numerosPares = new ArrayList();
        List numerosImpares = new ArrayList();
        int numero = 1;

        while(numero<=100){
            if(numero%2==0){
                numerosPares.add(numero);
                numero++;
            }else{
                numerosImpares.add(numero);
                numero++;
            }
        }
        System.out.println("Los numeros pares son: " + numerosPares);
        System.out.println("Los numeros impares son: " + numerosImpares);
    }
}
