import java.util.InputMismatchException;
import java.util.Scanner;

public class NumeroAdivinar {

	public static void main(String[] args) throws InputMismatchException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numeroAdivinar = (int) (Math.random() * 500);

		int numeroElegido = 0;
		int numeroIntentos = 0;
		System.out.println("Adivina el número! Para adivinar ingresa el numero que tienes en mente");

		do {
			try {
				numeroElegido = sc.nextInt();
				numeroIntentos++;
				if (numeroAdivinar < numeroElegido) {
					System.out.println("El número que intentas adivinar es menor que " + numeroElegido);
				} else {
					System.out.println("El número que intentas adivinar es mayor que " + numeroElegido);
				}
			} catch (InputMismatchException e) {
				System.out.println("Ingresa un número entero por favor");
				sc.next();
			}
		} while (numeroAdivinar != numeroElegido);
		System.out.println("Adivinaste el número! Era el número " + numeroAdivinar + " y te tomó " + numeroIntentos
				+ " intentos.");
	sc.close();
	}

}
