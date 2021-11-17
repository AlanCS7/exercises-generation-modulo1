package int_poo.patinete;

public class Patinete {

	private String cor;
	private int velocidade;
	private int rodas;
	private double tamanho;

	public Patinete() {
		
	}
	
	public Patinete(String cor, int velocidade, int rodas, double tamanho) {
		this.cor = cor;
		this.velocidade = velocidade;
		this.rodas = rodas;
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getRodas() {
		return rodas;
	}

	public void setRodas(int rodas) {
		this.rodas = rodas;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	
	public void addVelocidade(int vel) {
		velocidade += vel;
	}

	@Override
	public String toString() {
		return "Patinete: " 
				+ "\nCor: " + cor
				+ "\nTamanho: " + tamanho + " metros"
				+ "\nVelocidade: " + velocidade 
				+ "\nQuantidade de rodas: " + rodas;
	}
	
}
