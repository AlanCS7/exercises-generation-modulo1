package exercises_lacocondicional;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		x = sc.nextInt();

		if (x % 2 != 0) {
			System.out.println("\nNúmero IMPAR!");
			System.out.println("Número " + x + " elevado ao quadrado é " + Math.pow(x, 2));

		} else {
			System.out.println("\nNúmero PAR!");
			System.out.println("Raiz quadrado do número " + x + " é " + Math.sqrt(x));	
		}

		sc.close();
	}

}
