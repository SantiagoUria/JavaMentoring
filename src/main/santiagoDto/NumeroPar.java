public class NumeroPar {

    public static void main(String[] args) {
        try {
            int numeroRandom = (int) (Math.random() * 999);
            System.out.println(numeroRandom);
            if (numeroRandom % 2 == 0) {
                throw new Exception("este número es par");
            } else {
                throw new Exception("este numero es impar");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}