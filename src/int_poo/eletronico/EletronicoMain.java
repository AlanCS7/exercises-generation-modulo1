package int_poo.eletronico;

public class EletronicoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Eletronico e1 = new Eletronico();
		Eletronico e2 = new Eletronico();
		
		e1.setProduto("Celular");
		e1.setMarca("Motorola");
		e1.setModelo("G9 PLUS");
		e1.setCor("Preto");
		
		
		System.out.println("----------------CARACTERISTICAS DO PRODUTO----------------");
		System.out.println(e1);
		
		System.out.println("\n-------------------------AÇÕES-------------------------");
		e1.ligar();
		e1.desligar();
		
		
		e2.setProduto("Notebook");
		e2.setMarca("Lenovo");
		e2.setModelo("Ideapad");
		e2.setCor("Prata");
		
		
		System.out.println("\n\n\n----------------CARACTERISTICAS DO PRODUTO----------------");
		System.out.println(e2);
		
		System.out.println("\n-------------------------AÇÕES-------------------------");
		e2.ligar();
		e2.desligar();
	}

}
