package main.secuencial_condicional;
import java.util.Scanner;
public class positivoNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int B;
        B = sc.nextInt();
        System.out.println((B>0) ? B + " es positivo" : B + " es negativo");

        sc.close();
    }
    
}
