package collections;

import java.util.ArrayList;
import java.util.List;

public class ExerciseCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> estoqueLoja = new ArrayList<>();
		
		estoqueLoja.add("Tênis");
		estoqueLoja.add("Sandália");
		estoqueLoja.add("Chinelo");
		estoqueLoja.add("Blusa");
		estoqueLoja.add("Camisa");
		estoqueLoja.add("Casaco");
		estoqueLoja.add("Chapéu");
		
		for (String estoque : estoqueLoja) {
			System.out.println(estoque);
		}
		
		estoqueLoja.remove("Blusa");
		estoqueLoja.set(estoqueLoja.indexOf("Chapéu"), "Boné");
		
		System.out.println("-------------------------------------");
		System.out.println();
		for (String estoque : estoqueLoja) {
			System.out.println(estoque);
		}
		
	}

}
