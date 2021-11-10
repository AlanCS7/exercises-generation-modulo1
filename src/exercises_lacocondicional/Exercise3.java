package exercises_lacocondicional;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int idade;

		System.out.print("Informe a idade: ");
		idade = sc.nextInt();

		if (idade >= 10 && idade <= 14) {
			System.out.print("\nInfantil!");

		} else if (idade >= 15 && idade <= 17) {
			System.out.print("\nJuvenil!");

		} else if (idade >= 18 && idade <= 25) {
			System.out.print("\nAdulto!");

		} else {
			System.out.print("\nInforme a entre 10 e 25 anos!");
		}

		sc.close();
	}

}
