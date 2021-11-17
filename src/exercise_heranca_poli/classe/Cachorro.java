package exercise_heranca_poli.classe;

public class Cachorro extends Animal {

	@Override
	public void emitirSom() {
		System.out.println("Au Au Au Au");
	}

	@Override
	public void acao() {
		System.out.println("Cachorro correndo");
	}

}
