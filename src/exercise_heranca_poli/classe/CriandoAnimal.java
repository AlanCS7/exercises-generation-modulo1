package exercise_heranca_poli.classe;

public class CriandoAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		System.out.println("---------------------ANIMAL---------------------");
		cachorro.setNome("Nome: Beethoven");
		cachorro.setIdade(10);
		System.out.println("Cachorro\n" + cachorro.getNome() + "\nIdade: " + cachorro.getIdade());
		cachorro.acao();
		cachorro.emitirSom();
		
		System.out.println();
		System.out.println("---------------------ANIMAL---------------------");
		cavalo.setNome("Nome: Pegasus");
		cavalo.setIdade(5);
		System.out.println("Cavalo\n" + cavalo.getNome() + "\nIdade: " + cavalo.getIdade());
		cavalo.acao();
		cavalo.emitirSom();
		
		System.out.println();
		System.out.println("---------------------ANIMAL---------------------");
		preguica.setNome("Nome: Sansão");
		preguica.setIdade(60);
		System.out.println("Preguiça\n" + preguica.getNome() + "\nIdade: " + preguica.getIdade());
		preguica.acao();
		preguica.emitirSom();
		
		
	}

}
