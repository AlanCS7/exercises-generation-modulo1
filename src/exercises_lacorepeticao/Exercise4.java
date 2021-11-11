package exercises_lacorepeticao;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int idade, sexo, sentimento, cont = 0, contCalmoMenos18 = 0, contNervosaMais40 = 0, contCalma = 0,
				contMulherNervosa = 0, contHomemAgressivo = 0, contOutroCalmo = 0;

		while (cont < 150) {

			System.out.print("\nInforme sua idade: ");
			idade = sc.nextInt();

			System.out.print("Informe seu sexo (1-feminino / 2-masculino / 3-Outros): ");
			sexo = sc.nextInt();

			System.out.print(
					"Como está se sentindo (1 - Calmo; 2 - Nervosa e 3 - Agressiva): ");
			sentimento = sc.nextInt();

			if (sentimento == 1) {
				contCalma++;
			}

			if (sexo == 1 && sentimento == 2) {
				contMulherNervosa++;
			}

			if (sexo == 2 && sentimento == 3) {
				contHomemAgressivo++;
			}

			if (sexo == 3 && sentimento == 1) {
				contOutroCalmo++;
			}
			
			if (idade > 40 && sentimento == 2) {
				contNervosaMais40++;
			}
			
			if (idade < 18 && sentimento == 1) {
				contCalmoMenos18++;
			}

			cont++;
		}
		
		System.out.println("\nO número de pessoas calmas: " + contCalma);
		System.out.println("O número de mulheres nervosas: " + contMulherNervosa);
		System.out.println("O número de homens agressivos: " + contHomemAgressivo);
		System.out.println("O número de outros calmos: " + contOutroCalmo);
		System.out.println("O número de pessoas nervosas com mais de 40 anos: " + contNervosaMais40);
		System.out.println("O número de pessoas calmas com menos de 18 anos: " + contCalmoMenos18);

		sc.close();
	}

}
