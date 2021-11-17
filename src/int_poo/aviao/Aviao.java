package int_poo.aviao;

public class Aviao {

	private String marca;
	private String modelo;
	private String cor;
	private int qtdPassageiros;
	private double tamanho;

	public Aviao() {

	}

	public Aviao(String marca, String modelo, String cor, int qtdPassageiros, double tamanho) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.qtdPassageiros = qtdPassageiros;
		this.tamanho = tamanho;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getQtdPassageiros() {
		return qtdPassageiros;
	}

	public void setQtdPassageiros(int qtdPassageiros) {
		this.qtdPassageiros = qtdPassageiros;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public void ligar() {
		System.out.println("Ligando avião!");
	}

	public void decolar() {
		System.out.println("Decolando...");
	}

	public void pousar() {
		System.out.println("Pousando...");
	}

	@Override
	public String toString() {
		return "Marca: " + marca + "\nModelo: " + modelo + "\nCor: " + cor + "\nQuantidade de Passageiros: "
				+ qtdPassageiros + "\nTamanho: " + tamanho + " metros";
	}

}
