package main.secuencial_condicional;

import java.util.Scanner;

public class numerosHastaN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero limite para contar desde 1");
        int N = sc.nextInt();
        int count = 1;

        // for (int i = 1; i <= N; i++) {
        // System.out.println(i);
        // }

        // while (count <= N) {
        // System.out.println(count);
        // count = count + 1;
        // }

        // do {
        // System.out.println(count);
        // count = count + 1;
        // } while (count != N + 1);

        sc.close();
    }
}
