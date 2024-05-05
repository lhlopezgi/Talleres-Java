package C24B6;

/* Este ejercicio no lo logre realizar a la fecha de entrega, el codigo que
presento es de internet lo baje como apoyo para seguir buscando con mas tiempo la solucion
al ejercicio.
*/



import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class Taller7MiEdad {

    public static void main(String[] args) {




        DateTimeFormatter Nacimiento = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse("05/08/1983", Nacimiento);
        LocalDate ahora = LocalDate.now();

        Period periodo = Period.between(fechaNac, ahora);
        System.out.printf("Tu edad es: %s años, %s meses, %s días",
                periodo.getYears(), periodo.getMonths(), periodo.getDays());


    }
}