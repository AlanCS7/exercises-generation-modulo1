package exercises_lacorepeticao;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int num, numPar = 0, numImpar = 0;

		for (int i = 0; i < 10; i++) {

			System.out.print("Digite o " + (i + 1) + "� n�mero : ");
			num = sc.nextInt();

			if (num % 2 == 0) {
				numPar++;

			} else {
				numImpar++;
			}

		}

		System.out.println("\nTotal de n�meros pares: " + numPar);
		System.out.println("Total de n�meros impares: " + numImpar);

		sc.close();
	}

}
