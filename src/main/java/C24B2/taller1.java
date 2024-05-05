package C24B2;

import java.util.Scanner;

public class taller1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cual es tu estudio mas reciente?");
        String estudio = scanner.next();
        System.out.println(estudio+ " excelente conocimiento");

        System.out.println(" Cual es tu numero telefonico?");
        String telefono = scanner.next();
        System.out.println(" tu numero telefonico es: "+ telefono);



        scanner.close();



    }
}


