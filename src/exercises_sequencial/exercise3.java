package exercises_sequencial;

import java.util.Scanner;

public class exercise3 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int segundos, hora, min, seg;
		
		System.out.print("Informe a duração da festa em segundos: ");
		seg = sc.nextInt();
		
		
		hora = seg / 3600;
		min = (seg % 3600) / 60;
		segundos = (seg % 3600) % 60;
		
		System.out.println("\nA duração do evento foi de "+ hora +" horas "+ min +" minutos e "+ segundos +" segundos");
		
		sc.close();
	}
	
}
