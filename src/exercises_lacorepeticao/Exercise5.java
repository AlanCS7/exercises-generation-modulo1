package exercises_lacorepeticao;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num, cont = 0;

		do {

			System.out.print("Digite um número ou 0 para finalizar o programa: ");

			num = sc.nextInt();

			cont += num;

		} while (num != 0);

		System.out.println("\nPrograma Finalizado");
		System.out.println("Soma dos números digitados: " + cont);

		sc.close();
	}

}
