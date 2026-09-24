package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua palavra: ");
		String valor = entrada.next();
		
		while(!valor.equalsIgnoreCase("SAIR")) {
			System.out.println("Sua palavra é: " + valor);
			System.out.println("\nDigite outra palavra: ");
			valor = entrada.next();
		}
		
		System.out.println("SAIU!!!");
		entrada.close();
	}
}
