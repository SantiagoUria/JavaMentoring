import java.util.StringTokenizer;

public class CadenasDeTexto {


    // Comentar todos los ejercicios excepto el que quieras ver para verlo mejor

    public static void main(String[] args) throws Exception {

        String cancionP1 = "\nElla existió solo en un sueño \ny él es el poema que el poeta nunca escribió. \nY en la eternidad los dos \nunieron sus almas para darle vida \na esta triste canción de amor.";

        String cancionP2 = "\nÉl es como el mar \ny ella como la luna \ny en las noches de luna llena hacen el amor. \nY en la eternidad los dos \nunieron sus almas para darle vida \na esta triste canción de amor.";

        String cancionP3 = "\nÉl es como un dios y ella como una virgen \ny los dioses les enseñaron a pecar. \nY en la eternidad los dos \nunieron sus almas para darle vida \na esta triste canción de amor.";

        String cancion = cancionP1 + cancionP2 + cancionP3;

        int a = 0, e = 0, i = 0, o = 0, u = 0, consonante = 0, punto = 0, acentos = 0;


        // Ejercicio 1

        StringTokenizer c1 = new StringTokenizer(cancionP1);
        StringTokenizer c2 = new StringTokenizer(cancionP2);
        StringTokenizer c3 = new StringTokenizer(cancionP3);

        System.out.println("Parte 1: " + cancionP1);
        System.out.println("**********************");
        System.out.println("Esta parte de la canción tiene " + c1.countTokens() + "palabras");
        System.out.println("**********************");
        System.out.println("Parte 2: " + cancionP2);
        System.out.println("**********************");
        System.out.println("Esta parte de la canción tiene " + c2.countTokens() + "palabras");
        System.out.println("**********************");
        System.out.println("Parte 3: " + cancionP3);
        System.out.println("**********************");
        System.out.println("Esta parte de la canción tiene " + c3.countTokens() + "palabras");
        System.out.println("**********************");








        // Ejercicio 2 y 3

        

        for (int x = 0; x < cancion.length(); x++) {

            char cancionMinuscula = cancion.toLowerCase().charAt(x);
            switch (cancionMinuscula) {
            case 'a':
                a++;
                break;
            case 'e':
                e++;
                break;
            case 'i':
                i++;
                break;
            case 'o':
                o++;
                break;
            case 'u':
                u++;
                break;
            case '.':
                punto++;
                break;
            case 'á':
                acentos++;
                break;
            case 'é':
                acentos++;
                break;
            case 'í':
                acentos++;
                break;
            case 'ó':
                acentos++;
                break;
            case 'ú':
                acentos++;
                break;
            default:
                consonante++;
                break;
            }
        }
        int vocales = a + e + i + o + u;

        System.out.println("La cancion tiene:\n" + vocales + " VOCALES \n" + a + " letras A\n" + e + " letras E\n" + i
                + " letras I\n" + o + " letras O\n" + u + " letras U\n" + acentos + " acentos\n" + consonante
                + " consonantes y " + punto + " puntos");





        // Ejercicio 4



        String nuevaCancion = cancion.toLowerCase();
        nuevaCancion = nuevaCancion.replaceAll("él", "ella");
        nuevaCancion = nuevaCancion.replaceAll("ella", "él");
        nuevaCancion = nuevaCancion.replace("triste canción de amor", "alegre canción de rock");
        nuevaCancion = nuevaCancion.replaceAll("los dos", "el par");
        System.out.println("Nueva canción:");
        System.out.println(nuevaCancion);
    }
}
