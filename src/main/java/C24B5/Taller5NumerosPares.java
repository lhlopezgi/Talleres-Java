package C24B5;

import java.util.Arrays;
import java.util.List;

public class Taller5NumerosPares {

    public static void main(String[] args) {


        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Numeros pares:");


        for (int numero : numeros) {

            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
    }
}