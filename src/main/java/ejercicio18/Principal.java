package ejercicio18;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Principal {
    public static void main(String[] args) {
        int contadorSeries = 0;
        int contadorVideojuegos = 0;
        List<Serie> listaSeries = new ArrayList<>();
        listaSeries.add(new Serie("Hannibal", "Bryan Fuller"));
        listaSeries.add(new Serie("The Following", "Kevin Williamson"));
        listaSeries.add(new Serie());
        listaSeries.add(new Serie("Dexter", 9, "Crimen", "James Manos Jr"));
        listaSeries.add(new Serie("Monster", 1, "Anime", "Tatsuhiko Urahata"));

        List<Videojuego> listaVideojuego = new ArrayList<>();
        listaVideojuego.add(new Videojuego("Crash Team Racing Nitro-Fueled", 10));
        listaVideojuego.add(new Videojuego("Mario Kart", 12, "Carreras", "Nintendo"));
        listaVideojuego.add(new Videojuego());
        listaVideojuego.add(new Videojuego("Tomb Raider", 15, "Acción", "Square Enix"));
        listaVideojuego.add(new Videojuego("Spyro", 7 , "Aventura", "Activision"));

        listaSeries.get(1).entregar();
        listaSeries.get(4).entregar();
        listaVideojuego.get(0).entregar();
        listaVideojuego.get(1).entregar();
        listaVideojuego.get(2).entregar();

        for (Serie serie : listaSeries){
            if(serie.isEntregado()==true){
                contadorSeries += 1;
                serie.devolver();
            }
        }
        for (Videojuego videojuego : listaVideojuego) {
            if(videojuego.isEntregado()== true){
                contadorVideojuegos +=1;
                videojuego.devolver();
            }
        }
        System.out.println("\n----ENTREGADOS----");
        System.out.println("El numero de series entregadas es: " + contadorSeries);
        System.out.println("El numero de videojuegos entregados es: " + contadorVideojuegos);

        System.out.println("\n---SERIE CON MAS TEMPORADAS---");
        System.out.println(listaSeries.stream().sorted((x, y)->y.compareTo(x)).findFirst().toString().replace("Optional[","").replace("]",""));

        System.out.println("\n---VIDEOJUEGO CON MAS HORAS---");
        System.out.println(listaVideojuego.stream().sorted((x, y)->y.compareTo(x)).findFirst().toString().replace("Optional[","").replace("]",""));



    }

}
