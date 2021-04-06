package main.santiagoDto;

import main.Interfaces.Prestable;

public class Libro extends Publicacion implements Prestable {

    private boolean prestado;

    public Libro(String code, String title, int year) {
        super(code, title, year);
        prestado = false;
    }

    public void prestar() {
        prestado = true;
    }

    public void devolver() {
        prestado = false;
    }

    public boolean prestado() {
        return prestado;
    }

    public String toString() {
        if (prestado) {
            return "¿Este libro de " + getTitle() + " está prestado? Si!!\n" + info();
        } else {
            return "¿Este libro de " + getTitle() + " está prestado? No!!\n" + info();
        }
    }
}
