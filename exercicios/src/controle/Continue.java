package controle;

public class Continue {

	public static void main(String[] args) {

		//Quando o continue é encontrado, ele pula SÓ AQUELA REPETIÇÃO do laço
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) {
				continue;
			}
			
			System.out.println(i);
		}
		
		System.out.println("Fim!");
		
		for (int i = 1; i <= 10; i++) {
			if (i == 5) continue;
			System.out.println(i);
		}
	
	}
}
