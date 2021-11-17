package int_poo.cliente;

public class ClienteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente c1 = new Cliente();
		
		c1.setNome("Alan");
		c1.setSexo("Masculino");
		c1.setCpf("111.222.333-44");
		c1.deposito(3850.00);
		
		System.out.println(c1);
		c1.deposito(7500.00);
		System.out.println(c1);
		c1.saque(3942.00);
		System.out.println(c1);
	}

}
