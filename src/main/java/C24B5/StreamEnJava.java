package C24B5;

import java.util.Arrays;
import java.util.List;

public class StreamEnJava {

    public static void main(String[] args) {




        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println("Numeros pares:");



       // numeros.stream().filter(n-> n%2==0).forEach(System.out::println);

        // ejemplo sume todos los numeros pares

        int sumados=numeros.stream().filter(n-> n%2==0).mapToInt(Integer::intValue).sum();

        System.out.println(sumados);



        }
}
