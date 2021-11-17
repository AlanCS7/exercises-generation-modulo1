package int_poo.patinete;

public class PatineteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Patinete patinete = new Patinete();
		
		patinete.setCor("Verde");
		patinete.setRodas(4);
		patinete.setTamanho(1.45);
		patinete.setVelocidade(50);
		
		System.out.println(patinete);
		patinete.addVelocidade(6);
		System.out.println();
		System.out.println(patinete);
	}

}
