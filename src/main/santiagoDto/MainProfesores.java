package main.santiagoDto;

import java.util.ArrayList;

public class MainProfesores {
    public static void main(String[] args) {
        ArrayList<Profesor> listaDeProfesores = new ArrayList<Profesor>();

        ProfesorTitular pt1 = new ProfesorTitular("Juan", "Perez", 48, "Matematicas");
        listaDeProfesores.add(pt1);
        ProfesorInterino pt2 = new ProfesorInterino("Diego", "Luque", 45, "Construccion de la ciudadania");
        listaDeProfesores.add(pt2);
        ProfesorTitular pt3 = new ProfesorTitular("Hernan", "Avila", 28, "Practicas del lenguaje");
        listaDeProfesores.add(pt3);
        ProfesorInterino pt4 = new ProfesorInterino("Rodrigo", "Choque", 25, "Programación");
        listaDeProfesores.add(pt4);

        for (Profesor profesor : listaDeProfesores) {
            System.out.println(profesor);
        }
    }

}
