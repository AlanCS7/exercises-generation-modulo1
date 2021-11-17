package exercise_heranca_poli.classe;

public class Cavalo extends Animal {

	@Override
	public void emitirSom() {
		System.out.println("iiirrrrí, rilinchin");
	}

	@Override
	public void acao() {
		System.out.println("Cavalo correndo");
	}

}
