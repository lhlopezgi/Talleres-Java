package C24B5;

public class Errores {
    public static void main(String[] args) {
    try {
     int numero = 0;
     if(numero==0){
         throw new RuntimeException("No puede dividir en cero");
     }

    }catch (ArithmeticException e){
        System.out.println(e);
    }catch (NullPointerException e) {
        System.out.println(e);
    }catch (RuntimeException e) {
        System.out.println(e);
    }
        System.out.println("Continua el programa");
    }
}
