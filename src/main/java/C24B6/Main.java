package C24B6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;



public class Main {
    public static void main(String[] args) {
     /*   DiasSemana dia = DiasSemana.JUEVES;

        System.out.println("Hoy es: "+ dia);



        Date fecha = new Date();

        Calendar calendar = Calendar.getInstance();
        Date date = new Date();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println("Calendar: "+calendar);
        System.out.println("Fecha: "+ date);
        System.out.println("Local Date: "+localDate);
        System.out.println("Local Date Time: "+localDateTime);


        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        // Formaterar el LocalDateTime usando el formatter
        String formattedDateTime = localDateTime.format(formatter);

        // Imprimir la fecha y hora formateada
        System.out.println("Fecha y Hora formateada: "+ formattedDateTime);
*/

        Taller6ClaseCoche taller6ClaseCoche = new Taller6ClaseCoche();
        taller6ClaseCoche.acelerar(120);
        taller6ClaseCoche.frenar();






    }
}
