package ejercicio1;

public class Mayor {
    public static void main(String[] args) {
        int primerNumero = 7;
        int segundoNumero = 7;
        if(primerNumero > segundoNumero){
            System.out.println(primerNumero + " es mayor que " + segundoNumero);
        }else if(primerNumero < segundoNumero){
            System.out.println(segundoNumero + " es mayor que " + primerNumero);
        }else if(primerNumero == segundoNumero){
            System.out.println("Los números son iguales");
        }
    }
}
