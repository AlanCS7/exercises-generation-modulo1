package exercises_sequencial;

import java.util.Scanner;

public class exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int anos, meses, dia, dias;

		System.out.print("Informe sua idade em dias: ");
		dias = sc.nextInt();

		anos = dias / 365;
		meses = (dias % 365) / 30;
		dia = (dias % 365) % 365;

		System.out.println("\nVocê tem " + anos + " anos, " + meses + " meses e " + dia + " dias");

		sc.close();

	}

}
