package C24B3;

import java.util.Scanner;

public class Taller3numeromayor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el primer numero a comparar");
        int num1 = Integer.parseInt(scanner.next());
        System.out.println("Digite el segundo numero a comparar");
        int num2 = Integer.parseInt(scanner.next());

        if (num1 > num2) {
            System.out.println("El numero " + num1 + " Es mayor que el numero " + num2);
        }else if (num2 > num1) {
            System.out.println("El numero " + num2 + " Es mayor que el numero " + num1);


            }else{
                    System.out.println("Los numeros digitados son iguales");
                }
            }
        }


