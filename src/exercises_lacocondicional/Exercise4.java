package exercises_lacocondicional;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um n�mero: ");
		x = sc.nextInt();

		if (x % 2 != 0) {
			System.out.println("\nN�mero IMPAR!");
			System.out.println("N�mero " + x + " elevado ao quadrado � " + Math.pow(x, 2));

		} else {
			System.out.println("\nN�mero PAR!");
			System.out.println("Raiz quadrado do n�mero " + x + " � " + Math.sqrt(x));	
		}

		sc.close();
	}

}
