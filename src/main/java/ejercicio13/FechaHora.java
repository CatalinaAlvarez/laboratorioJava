package ejercicio13;

import java.text.SimpleDateFormat;
import java.util.Date;


public class FechaHora {
    public static void main(String[] args) {
        Date fecha=new Date(new Date().getTime());
        String fechaFormato =new SimpleDateFormat("yyyy/MM/dd hh:mm:ss").format(fecha);

        System.out.println(fechaFormato);
    }
}
