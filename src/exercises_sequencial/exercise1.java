package exercises_sequencial;

import java.util.Scanner;

public class exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int anos, meses, dia, dias;

		System.out.print("Informe sua idade em anos: ");
		anos = sc.nextInt();

		System.out.print("Informe quantos mesess: ");
		meses = sc.nextInt();

		System.out.print("Informe quantos dias: ");
		dia = sc.nextInt();

		dias = anos * 365 + meses * 30 + dia;

		System.out.println("\nVocê tem " + dias + " dias de vida.");

		sc.close();
	}

}
