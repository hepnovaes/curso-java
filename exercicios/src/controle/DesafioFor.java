package controle;

public class DesafioFor {

	public static void main(String[] args) {

		/*String valor = "#";
		for (int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}*/

		// Versão do desafio
		// Não pode usar valor numerico pra controlar o laço!

		for (String valor2 = "#"; !"######".equals(valor2); valor2 += "#") {
			System.out.println(valor2);
		}

	}
}
