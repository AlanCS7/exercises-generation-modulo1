package exercises_lacorepeticao;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int num, cont = 0, soma = 0, mediaMultiploDeTres;

		do {

			System.out.print("Digite um número ou 0 para finalizar o programa: ");
			num = sc.nextInt();

			if (num % 3 == 0) {
				soma += num;
				cont++;
			}

		} while (num != 0);

		mediaMultiploDeTres = soma / cont;
		
		System.out.println("\nPrograma Finalizado");
		System.out.println("Média dos números múltiplos de 3: " + mediaMultiploDeTres);

		sc.close();

	}

}
