package int_poo.funcionario;

public class Funcionario {

	private String nome;
	private String sexo;
	private String cpf;
	private String cargo;
	private double salario;
	
	public Funcionario() {
	}

	public Funcionario(String nome, String sexo, String cpf, String cargo, double salario) {
		this.nome = nome;
		this.sexo = sexo;
		this.cpf = cpf;
		this.cargo = cargo;
		this.salario = salario;
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

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void feedback(String feedback) {
		System.out.println("FeedBack: " + feedback);
	}
	
	public boolean almocar(boolean almocar) {
		return almocar;
	}

	@Override
	public String toString() {
		return "Funcionario: " + nome 
				+ "\nSexo: " + sexo 
				+ "\nCpf: " + cpf 
				+ "\nCargo: " + cargo
				+ "\nSalário: " + salario;
	}
	
	
}
