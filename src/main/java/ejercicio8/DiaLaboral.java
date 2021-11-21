package ejercicio8;

import java.util.Scanner;

public class DiaLaboral {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Por favor escriba un día de la semana: ");
        String dia = input.nextLine();
        dia = dia.toLowerCase();
        switch (dia){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("El " + dia + " es un día laboral");
                break;
            case "sabado":
            case "domingo":
                System.out.println("El " + dia + " no es un día laboral");
                break;
            default:
                System.out.println("No es un dia de la semana");
        }
    }
}
