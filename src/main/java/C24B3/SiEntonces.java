package C24B3;

public class SiEntonces {

    public static void main(String[] args) {

       /* int edad = 21;

        if (edad > 18) {
            if (edad < 120) {

                System.out.println("Esta vivo");

            } else {
                System.out.println("No es humano");
            }

        */

        int diaDeLaSemana = 1;
        switch (diaDeLaSemana){

            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;

            default:
                System.out.println("Dia de la semana no valido");




        }

    }
}
