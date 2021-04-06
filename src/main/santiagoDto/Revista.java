package main.santiagoDto;

public class Revista extends Publicacion {

    private int numero;

    public Revista(String code, String title, int year, int numero) {
        super(code, title, year);
        this.numero = numero;
    }

    public String toString() {
        return "Esta revista es " + getTitle() + "\n" + info() + " | Número: " + numero;
    }

}
