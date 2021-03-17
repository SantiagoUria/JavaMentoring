package main.secuencial_condicional;

import java.util.Scanner;

public class millasKilometros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int millas;
        do {
            System.out.println("Ingresa la cantidad de millas");
            millas = sc.nextInt();
            double equivalente = 1.6093;
            double kilometros = millas * equivalente;
            System.out.printf(millas + " millas son: " + "%.2f kilometros %n", kilometros);
        } while (millas != 0);

        sc.close();
    }
}
