package collections;

import java.util.ArrayList;
import java.util.List;

public class ExerciseCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> estoqueLoja = new ArrayList<>();
		
		estoqueLoja.add("T�nis");
		estoqueLoja.add("Sand�lia");
		estoqueLoja.add("Chinelo");
		estoqueLoja.add("Blusa");
		estoqueLoja.add("Camisa");
		estoqueLoja.add("Casaco");
		estoqueLoja.add("Chap�u");
		
		for (String estoque : estoqueLoja) {
			System.out.println(estoque);
		}
		
		estoqueLoja.remove("Blusa");
		estoqueLoja.set(estoqueLoja.indexOf("Chap�u"), "Bon�");
		
		System.out.println("-------------------------------------");
		System.out.println();
		for (String estoque : estoqueLoja) {
			System.out.println(estoque);
		}
		
	}

}
