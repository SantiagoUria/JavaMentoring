package main.secuencial_condicional;
import java.util.Scanner;
public class iva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el precio unitario del producto");
        int precioUnitario = sc.nextInt();
        System.out.println("ingrese la cantidad de productos vendidos");
        int cantidadProductos = sc.nextInt();
        final double IVA = 0.21;
        System.out.println(precioUnitario*cantidadProductos*IVA);

        sc.close();
    }
}
