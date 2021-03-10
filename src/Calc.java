import java.util.Scanner;

public class Calc {
    public static void main(String[] args) throws Exception {
        // declara el scanner
        String line = "******************************";
        Scanner sc = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.println(line);
        System.out.println("*  INGRESE EL PRIMER NUMERO  *");
        System.out.println(line);
        int num1 = sc.nextInt();
        System.out.print("\033[H\033[2J");
        System.out.println(line);
        System.out.println("*     INGRESE EL OPERADOR    *");
        System.out.println(line);
        System.out.println(line);
        System.out.println("          OPERADORES:         ");
        System.out.println(line);
        System.out.println("         + <-- SUMA           ");
        System.out.println(line);
        System.out.println("         - <-- RESTA          ");
        System.out.println(line);
        System.out.println("    * <-- MULTIPLICACION      ");
        System.out.println(line);
        System.out.println("        / <-- DIVISION        ");
        System.out.println(line);
        System.out.println("");
        String operacion = sc.next();
        operacion.toLowerCase();
        System.out.print("\033[H\033[2J");
        System.out.println(line);
        System.out.println("* INGRESE EL SEGUNDO NUMERO  *");
        System.out.println(line);
        int num2 = sc.nextInt();
        System.out.print("\033[H\033[2J");

        String resultadoMsg = "********************\n      RESULTADO     \n********************";

        if (operacion.equals("+") || operacion.equals("suma")) {
            System.out.println(resultadoMsg);
            System.out.println("      " + num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (operacion.equals("-") || operacion.equals("resta")) {
            System.out.println(resultadoMsg);
            System.out.println("      " + num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (operacion.equals("*") || operacion.equals("multiplicacion")) {
            System.out.println(resultadoMsg);
            System.out.println("      " + num1 + " * " + num2 + " = " + (num1 * num2));
        } else if (operacion.equals("/") || operacion.equals("division")) {
            System.out.println(resultadoMsg);
            System.out.println("      " + num1 + " / " + num2 + " = " + (num1 / num2));
            System.out.println("********************");
        }
        sc.close();
    }
}
