package main.secuencial_condicional;
import java.util.Scanner;
public class intercambioDeVariables {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero para A");
        int A = sc.nextInt();
        System.out.println("Ingrese el segundo numero para B");
        int B = sc.nextInt();
        System.out.println("El valor de A es: " + A + " y el valor de B es " + B);
        int Z;
        Z = A;
        A = B;
        B = Z;
        System.out.println("El nuevo valor de A es: " + A + " y el nuevo valor de B es " + B);

        sc.close();
    }
}
