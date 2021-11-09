package exercises_sequencial;

import java.util.Scanner;

public class exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int a, b, c, d, r, s;

		System.out.print("Escreva um número inteiro e positivo: ");
		a = sc.nextInt();

		System.out.print("Escreva um número inteiro e positivo: ");
		b = sc.nextInt();

		System.out.print("Escreva um número inteiro e positivo: ");
		c = sc.nextInt();

		r = (a + b) + (a + b);
		s = (b + c) + (b + c);

		d = (r + s) / 2;

		System.out.print("\nResultado: " + d);

		sc.close();
	}

}
