package ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class ParImparFor {
    public static void main(String[] args) {
        List numerosPares = new ArrayList();
        List numerosImpares = new ArrayList();

        for(int i=1; i<=100; i++){
            if(i%2==0){
                numerosPares.add(i);
            }else{
                numerosImpares.add(i);
            }
        }
        System.out.println("Los numeros pares son: " + numerosPares);
        System.out.println("Los numeros impares son: " + numerosImpares);
    }
}
