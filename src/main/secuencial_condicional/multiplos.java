package main.secuencial_condicional;

import java.util.Scanner;

public class multiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int C;
        C = sc.nextInt();
        System.out.println(C > 0 ? C + " es positivo" : C + " es negativo");
        System.out.println(C % 2 == 0 ? C + " es par" : C + " es impar");
        System.out.println(C % 5 == 0 ? C + " es multiplo de 5" : C + " no es multiplo de 5");
        System.out.println(C % 10 == 0 ? C + " es multiplo de 10" : C + " no es multiplo de 10");
        System.out.println(C < 100 ? C + " es menor que 100" : C + " es mayor a 100");

        sc.close();
    }

}
