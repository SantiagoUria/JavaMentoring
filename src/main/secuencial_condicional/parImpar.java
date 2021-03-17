package main.secuencial_condicional;
import java.util.Scanner;
public class parImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A;
        System.out.println("Ingrese un número");
        A = sc.nextInt();
        System.out.println();
        System.out.println((A % 2 == 0) ? A + (" es par") : A + " es impar" );

        sc.close();
    }
    
}
