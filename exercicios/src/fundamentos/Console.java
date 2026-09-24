package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
	
		System.out.print("Bom");
		System.out.print(" dia! \n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %n", 
				3,4,5,6,7);
		
		System.out.printf("Salário: %.1f%n", 1234.89);
		System.out.printf("Nome: %s%n", "João");
		
		//int a = 3;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: " );
		String nome = entrada.nextLine();

		System.out.print("Digite o seu sobrenome: " );
		String sobrenome = entrada.nextLine();

		System.out.print("Digite a sua idade: " );
		int idade = entrada.nextInt();
		
		System.out.println("\nNome = " + nome + " " + sobrenome);
		
		System.out.printf("%s %s tem %d anos.", 
				nome, sobrenome, idade);
		
		entrada.close();
	}
}
