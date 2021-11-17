package int_poo.paciente;

public class Paciente {

	private String nome;
	private String sexo;
	private String cpf;
	private String convenio;
	private int idade;
	
	public Paciente() {
		
	}

	public Paciente(String nome, String sexo, String cpf, String convenio, int idade) {
		this.nome = nome;
		this.sexo = sexo;
		this.cpf = cpf;
		this.convenio = convenio;
		this.idade = idade;
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

	public String getConvenio() {
		return convenio;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public boolean internado(boolean inter) {
		return inter;
	}
	
	@Override
	public String toString() {
		return "Nome do paciente: " + nome 
				+ "\nSexo: " + sexo 
				+ "\nCpf: " + cpf 
				+ "\nConvenio: " + convenio
				+ "\nIdade: " + idade + " anos";
		
	}
	
}
