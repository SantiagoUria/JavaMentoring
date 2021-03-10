public class Frutas {
    public static void main(String[] args) throws Exception {

        // Ejercicio 1

        String[] frutasYVerduras = { "banana", "tomate", "papa", "uva", "naranja", "lechuga", "ciruela", "zapallo",
                "berenjena", "frutilla", "cebolla", "anana" };

        // Ejecicio 2

        for (int i = 0; i < frutasYVerduras.length; i++) {
            System.out.println(frutasYVerduras[i]);
        }
        String frutas[] = { "banana", "uva", "naranja", "ciruela", "frutilla", "anana" };
        String verduras[] = { "tomate", "papa", "lechuga", "zapallo", "berenjena", "cebolla" };

        // Ejercicio 3
        
        for (int i = 0; i < frutas.length; i++) {
            System.out.println(frutas[i]);
        }

        // Ejercicio 4

        int i = 0;
        String verduraMayor = verduras[0];
        String verduraMenor = verduras[0];
        while (i < verduras.length) {
            if (verduras[i].length() > verduraMayor.length()) {
                verduraMayor = verduras[i];
            }
            if (verduras[i].length() < verduraMenor.length()) {
                verduraMenor = verduras[i];
            }
            i++;
        }
        System.out.println("========================================");
        System.out.println("La verdura con menos letras es: " + verduraMenor.toUpperCase());
        System.out.println("========================================");
        System.out.println("La verdura con más letras es: " + verduraMayor.toUpperCase());
        System.out.println("========================================");
    }

}
