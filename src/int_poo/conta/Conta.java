package int_poo.conta;

public class Conta {

	private String nome;
	private int numConta;
	private double saldo;

	public Conta() {
	}

	public Conta(String nome, int numConta) {
		this.nome = nome;
		this.numConta = numConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double deposito) {
		saldo += deposito;
	}

	public void saque(double saque) {
		saldo -= saque;
	}
	
	@Override
	public String toString() {
		return "Conta " + numConta + ", Usuario: " + nome + ", Saldo: $ " + String.format("%.2f", saldo);
	}

	
}
