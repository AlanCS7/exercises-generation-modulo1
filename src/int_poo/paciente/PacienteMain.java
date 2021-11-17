package int_poo.paciente;

public class PacienteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Paciente paciente = new Paciente();
		Paciente paciente2 = new Paciente();

		paciente.setConvenio("Amil");
		paciente.setCpf("111.222.333-44");
		paciente.setIdade(50);
		paciente.setNome("Camilla");
		paciente.setSexo("Feminino");

		System.out.println(paciente);
		System.out.println("Está internado? " + paciente.internado(false));

		
		System.out.println();
		paciente2.setConvenio("Notredame");
		paciente2.setCpf("121.232.343-45");
		paciente2.setIdade(30);
		paciente2.setNome("Eduardo");
		paciente2.setSexo("Masculino");

		System.out.println(paciente2);
		System.out.println("Está internado? " + paciente2.internado(true));
	}

}
