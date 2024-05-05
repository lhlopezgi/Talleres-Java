package C24B6;

public class Taller6ClaseCoche implements Taller6InterfazVehiculo {


    @Override
    public void acelerar(int velocidad) {
        System.out.println("acelere a: "+ velocidad);
    }

    @Override
    public void frenar() {
        System.out.println("frené");

    }
}
