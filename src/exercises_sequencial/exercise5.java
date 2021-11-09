package exercises_sequencial;

import java.util.Scanner;

public class exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		double nota1, nota2, nota3, mediaPonderada;

		System.out.print("Digite a primeira nota: ");
		nota1 = sc.nextDouble();

		System.out.print("Digite a segunda nota: ");
		nota2 = sc.nextDouble();

		System.out.print("Digite a terceira nota: ");
		nota3 = sc.nextDouble();

		mediaPonderada = (nota1 * 2) + (nota2 * 3) + (nota3 * 5) / 3;

		System.out.printf("\nA média ponderada é %.2f", mediaPonderada);

		sc.close();
	}

}
