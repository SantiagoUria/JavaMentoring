package main.santiagoDto;

import main.santiagoDto.Revista.Prestable;

public class MainPublicaciones {

    public static int cuentaPrestados(Publicacion[] lista) {
        int i = 0;
        for (Publicacion publicacion : lista) {
            if (publicacion instanceof Prestable && ((Prestable)publicacion).prestado()) {
                i++;
            }
        }
        return i;
    }

    public static int publicacionesAnterioresA(Publicacion[] lista, int year) {
        int i = 0;
        for (Publicacion pub : lista) {
            if (pub.getYear() < year) {
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {

        Libro libro1 = new Libro("123ABC", "Don Quijote de la mancha", 1605);
        Libro libro2 = new Libro("321XYZ", "Demian", 1919);
        Revista revista1 = new Revista("555AAA", "Billiken", 2010, 1);
        Revista revista2 = new Revista("777BBB", "Caras", 2018, 2);
        libro1.setYear(1605);
        libro2.setYear(1919);
        libro1.prestar();
        libro2.prestar();
        revista1.setYear(2010);
        revista2.setYear(2018);
        Publicacion[] productos = { libro1, libro2, revista1, revista2 };

        for (Publicacion pub : productos) {
            System.out.println(pub);
        }
        System.out.println(
                publicacionesAnterioresA(productos, 1990) + " de nuestros productos son anteriores al año ingresado");
        System.out.println(cuentaPrestados(productos) + " de nuestros productos estan actualmente prestados");

    }
}
