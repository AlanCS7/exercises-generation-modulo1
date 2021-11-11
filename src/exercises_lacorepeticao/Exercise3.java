package exercises_lacorepeticao;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int idade = 0, idadeMenor21 = 0, idadeMaior50 = 0;


		while (idade != -99) {
			
			System.out.print("Informe a idade: ");
			idade = sc.nextInt();

			if (idade < 21) {
				idadeMenor21++;

			} else if (idade > 50) {
				idadeMaior50++;

			}
			
			
			System.out.println("Digite -99 para o programa parar.\n");
		}

		System.out.println("Total de pessoas com menos de 21 anos: " + idadeMenor21);
		System.out.println("Total de pessoas com mais de 50 anos: " + idadeMaior50);
		
		sc.close();
	}

}
