package main.santiagoDto;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Profesor> listaDeProfesores = new ArrayList<Profesor>();

        ProfesorTitular pt1 = new ProfesorTitular("1", "Choque", 25, "Matematicas");
        listaDeProfesores.add(pt1);
        ProfesorInterino pt2 = new ProfesorInterino("2", "Choque", 25, "Matematicas");
        listaDeProfesores.add(pt2);
        ProfesorTitular pt3 = new ProfesorTitular("3", "Choque", 25, "Matematicas");
        listaDeProfesores.add(pt3);
        ProfesorInterino pt4 = new ProfesorInterino("4", "Choque", 25, "Matematicas");
        listaDeProfesores.add(pt4);
        ProfesorTitular pt5 = new ProfesorTitular("5", "Choque", 25, "Matematicas");
        listaDeProfesores.add(pt5);
        ProfesorInterino pt6 = new ProfesorInterino("6", "Choque", 25, "Matematicas");
        listaDeProfesores.add(pt6);
        ProfesorTitular pt7 = new ProfesorTitular("7", "Choque", 25, "Matematicas");
        listaDeProfesores.add(pt7);
        ProfesorInterino pt8 = new ProfesorInterino("8", "Choque", 25, "Matematicas");
        listaDeProfesores.add(pt8);
        ProfesorTitular pt9 = new ProfesorTitular("9", "Choque", 25, "Matematicas");
        listaDeProfesores.add(pt9);
        ProfesorInterino pt10 = new ProfesorInterino("10", "Choque", 25, "Matematicas");
        listaDeProfesores.add(pt10);

        for (Profesor profesor : listaDeProfesores) {
            System.out.println(profesor);
        }
    }

}
