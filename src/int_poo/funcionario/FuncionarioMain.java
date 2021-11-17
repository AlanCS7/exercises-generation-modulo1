package int_poo.funcionario;

public class FuncionarioMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Alan Carlos");
		funcionario.setCpf("111.222.333-44");
		funcionario.setCargo("Desenvolvedor Java");
		funcionario.setSexo("Masculino");
		funcionario.setSalario(40000.00);
		
		System.out.println(funcionario);
		System.out.println("Foi almoçar? " + funcionario.almocar(true));
		
		funcionario.feedback("Funcionario proativo");
	}

}
