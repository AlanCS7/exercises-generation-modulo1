package exercises_lacocondicional;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int x, y, z;

		System.out.print("Digite o primeiro n�mero: ");
		x = sc.nextInt();

		System.out.print("Digite o segundo n�mero: ");
		y = sc.nextInt();

		System.out.print("Digite o terceiro n�mero: ");
		z = sc.nextInt();

		if (x > y && x > z) {
			System.out.println("\nMaior n�mero � " + x);

		} else if (y > x && y > z) {
			System.out.println("\nMaior n�mero � " + y);

		} else {
			System.out.println("\nMaior n�mero � " + z);
		}

		sc.close();
	}

}
