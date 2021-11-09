package exercises_sequencial;

import java.util.Scanner;

public class exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		double x1, x2, y1, y2, d, raiz;

		System.out.print("Digite o valor do x1: ");
		x1 = sc.nextDouble();

		System.out.print("Digite o valor do y1: ");
		y1 = sc.nextDouble();

		System.out.print("Digite o valor do x2: ");
		x2 = sc.nextDouble();

		System.out.print("Digite o valor do y2: ");
		y2 = sc.nextDouble();

		d = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);

		raiz = Math.sqrt(d);

		System.out.println("\nRaiz: " + raiz);

		sc.close();
	}

}
