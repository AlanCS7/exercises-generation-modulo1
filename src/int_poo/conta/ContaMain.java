package int_poo.conta;

import java.util.Locale;
import java.util.Scanner;

public class ContaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o número da conta: ");
		int numConta = sc.nextInt();

		System.out.print("Entre com o nome do usuário: ");
		sc.nextLine();
		String nome = sc.nextLine();

		System.out.print("Entre com o saldo da conta: ");
		double saldo = sc.nextDouble();

		
		Conta conta = new Conta(nome, numConta);
		
		conta.deposito(saldo);
		System.out.println();
		System.out.println(conta);
		
		System.out.print("Entre com o valor que deseja sacar da conta: ");
		double saque = sc.nextDouble();
		
		conta.saque(saque);
		
		System.out.println();
		System.out.println(conta);

	}

}
