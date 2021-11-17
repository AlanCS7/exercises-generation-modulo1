package int_poo.cliente;

public class Cliente {

	private String nome;
	private String sexo;
	private String cpf;
	private double saldo;

	public Cliente() {

	}

	public Cliente(String nome, String sexo, String cpf, double saldo) {
		this.nome = nome;
		this.sexo = sexo;
		this.cpf = cpf;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double deposito) {
		this.saldo += deposito;
	}

	public void saque(double saque) {
		this.saldo -= saque;
	}

	@Override
	public String toString() {
		return "Cliente: "
				+ nome + ", sexo " + sexo + ", cpf " + cpf + " e saldo de R$" + saldo;
	}

	
	
}
