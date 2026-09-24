package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double nota = 0;
		double somanotas = 0;
		int contador = 0;

		while (nota != -1) {

			System.out.println("Digite a nota do aluno " + (contador + 1) + " (ou -1 para sair)");
			nota = entrada.nextDouble();

			if (nota == -1) {
				System.out.println("A média dos alunos é: " + (somanotas / contador));
			} else if (nota <= -2 || nota >= 11) {
				System.out.println("Nota inválida, digite novamente!");
			} else {
				contador++;
				somanotas += nota;
			}
		}

		entrada.close();
	}
}
