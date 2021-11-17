package int_poo.aviao;

public class AviaoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aviao aviao = new Aviao();
		
		aviao.setMarca("Boeing");
		aviao.setModelo("747-8");
		aviao.setCor("Branco e Vermelho");
		aviao.setQtdPassageiros(62);
		aviao.setTamanho(54.6);
		
		System.out.println("----------------CARACTERISTICAS DO AVIAO----------------");
		System.out.println(aviao);
		
		System.out.println("\n-------------------------AÇÕES-------------------------");
		aviao.ligar();
		aviao.decolar();
		aviao.pousar();
		
	}

}
