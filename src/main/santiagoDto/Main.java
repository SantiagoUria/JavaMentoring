package main.santiagoDto;
public class Main {
    public static void main (String[] args ){
        Perro perro1 = new Perro();
        perro1.setNombre("Rocco");
        perro1.comer();

        Gato gato1 = new Gato();
        gato1.setNombre("Michael");
        gato1.comer();
    }
}
