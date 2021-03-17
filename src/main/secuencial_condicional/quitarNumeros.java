package main.secuencial_condicional;

import java.util.Scanner;

public class quitarNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int M = sc.nextInt();
        System.out.println("Ingrese un numero");
        int m = sc.nextInt();
        String nums = Integer.toString(M);
        nums = nums.substring(0, nums.length()-m);
        System.out.println(nums);
        sc.close();
    }
}
