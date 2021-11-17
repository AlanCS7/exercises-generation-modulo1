package int_poo.eletronico;

public class Eletronico {

	private String produto;
	private String marca;
	private String modelo;
	private String cor;

	public Eletronico() {

	}

	public Eletronico(String produto, String marca, String modelo, String cor) {
		this.produto = produto;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
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

	public void ligar() {
		System.out.println("Ligando produto eletronico!");
	}

	public void desligar() {
		System.out.println("Desligando produto eletronico!");
	}

	@Override
	public String toString() {
		return "Produto: " + produto + "\nMarca: " + marca + "\nModelo: " + modelo + "\nCor: " + cor;
	}
}
