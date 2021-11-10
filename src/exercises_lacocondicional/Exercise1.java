package exercises_lacocondicional;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int x, y, z;

		System.out.print("Digite o primeiro número: ");
		x = sc.nextInt();

		System.out.print("Digite o segundo número: ");
		y = sc.nextInt();

		System.out.print("Digite o terceiro número: ");
		z = sc.nextInt();

		if (x > y && x > z) {
			System.out.println("\nMaior número é " + x);

		} else if (y > x && y > z) {
			System.out.println("\nMaior número é " + y);

		} else {
			System.out.println("\nMaior número é " + z);
		}

		sc.close();
	}

}
