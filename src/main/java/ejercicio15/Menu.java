package ejercicio15;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean repetir = true;
        menu();
        while(repetir){
            System.out.println("Ingrese un número: ");
            String opcion = input.nextLine();
            switch (opcion){
                case "1", "2", "3", "4","5","6","7":
                    menu();
                    break;
                case"8":
                    repetir = false;
                    break;
                default:
                    System.out.println("OPCION INCORRECTO");
                    menu();
            }
        }
    }
    public static void menu(){
        System.out.println("""
                ****** GESTION CINEMATOGRAFICA ********
                1-NUEVO ACTOR
                2-BUSCAR ACTOR
                3-ELIMINAR ACTOR
                4-MODIFICAR ACTOR
                5-VER TODOS LOS ACTORES
                6- VER PELICULAS DE LOS ACTORES
                7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES
                8-SALIR""");
    }
}
