package main.secuencial_condicional;
import java.util.Scanner;
public class horaMinutosSegundos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Acontinuación ingresa el valor de cada uno de los siguentes items");
        System.out.println();
        System.out.println("Ingresa la hora");
        int H = sc.nextInt();
        System.out.println("Ingresa los minutos");
        int M = sc.nextInt();
        System.out.println("Ingresa los segundos");
        int S = sc.nextInt();
        if(H > 24 || H < 0 && M > 59 || M < 0 && S > 59 || S < 0){
            System.out.println("Hora invalida");
        }else{
            System.out.println(H + ":" + M + ":" + S);
        }

        sc.close();
    }
    
}
