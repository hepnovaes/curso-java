package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {

		// Domingo -> 1
		// Quarta -> 4
		// terça -> 3

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o dia da semana");

		String dia = entrada.next();

		if ("domingo".equalsIgnoreCase(dia)) {
			System.out.println("Seu número é 1.");
		} else if ("SEGUNDA".equalsIgnoreCase(dia)) {
			System.out.println("Seu número é 2.");
		} else if ("TERÇA".equalsIgnoreCase(dia)) {
			System.out.println("Seu número é 3.");
		} else if ("QUARTA".equalsIgnoreCase(dia)) {
			System.out.println("Seu número é 4.");
		} else if ("QUINTA".equalsIgnoreCase(dia)) {
			System.out.println("Seu número é 5.");
		} else if ("SEXTA".equalsIgnoreCase(dia)) {
			System.out.println("Seu número é 6.");
		} else if ("SÁBADO".equalsIgnoreCase(dia)) {
			System.out.println("Seu número é 7.");
		} else {
			System.out.println("Dia inválido");
		}

		entrada.close();
	}
}
