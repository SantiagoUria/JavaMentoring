package main;

import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la temperatura actual en grados centígrados");
        float C = sc.nextInt();
        final float CENTIGRADO_A_FAHRENHEIT = 32 + (9 * C / 5);

        System.out.println("La conversión de " + C + " a Fahrenheit es: " + CENTIGRADO_A_FAHRENHEIT);

        sc.close();
    }
}
