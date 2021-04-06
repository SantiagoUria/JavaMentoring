package main.Herencia;

public class Main {
    
    public static void main(String[] args) {
        Persona info1 = new Informatico("Jorge");
        Persona depo1 = new Deportista("Diego");
        System.out.println( info1.getNombre() + " corre a una velocidad de " + info1.correr() + " km/h");
        System.out.println( depo1.getNombre() + " corre a una velocidad de " + depo1.correr() + " km/h");
        info1.setNombre("Jorge Lomoro");
        depo1.setNombre("Diego Luque");
        System.out.println("Cambio de nombre");
        System.out.println( info1.getNombre() + " corre a una velocidad de " + info1.correr() + " km/h");
        System.out.println( depo1.getNombre() + " corre a una velocidad de " + depo1.correr() + " km/h");
    }
}
