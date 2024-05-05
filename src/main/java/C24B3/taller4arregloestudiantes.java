package C24B3;

import java.util.Scanner;

public class taller4arregloestudiantes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int acumulador = 0;

        int[] estudiantes = new int[5];

        System.out.println("Digite la edad del estudiante 1");
        estudiantes[0] = Integer.parseInt(scanner.next());
        System.out.println("Digite la edad del estudiante 2");
        estudiantes[1] = Integer.parseInt(scanner.next());
        System.out.println("Digite la edad del estudiante 3");
        estudiantes[2] = Integer.parseInt(scanner.next());
        System.out.println("Digite la edad del estudiante 4");
        estudiantes[3] = Integer.parseInt(scanner.next());
        System.out.println("Digite la edad del estudiante 5");
        estudiantes[4] = Integer.parseInt(scanner.next());


        for(int i=0;i<5;i++) {
            acumulador = acumulador + (estudiantes[i]);


        }

                   int promedio = (acumulador/5);

            System.out.println("El promedio de las edades de los estudantes es: "+ promedio);



    }
}

