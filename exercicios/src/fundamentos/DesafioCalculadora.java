package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
			// Ler num1
			// Ler num2
			// + - * / %
			 
			Scanner entrada = new Scanner(System.in);
			 
			System.out.println("Digite o primeiro numero");		
			double num1 = entrada.nextDouble();
			
			System.out.println("Digite o segundo numero");
			double num2 = entrada.nextDouble();
			
			System.out.println("Digite a operacao"); 
			String ope = entrada.next();
			
			System.out.printf("%f %s %f = ?", num1, ope, num2); 
			
			double resultado = "+".equals(ope) ? num1 + num2 : 
							   "-".equals(ope) ? num1 - num2 : 
							   "*".equals(ope) ? num1 * num2 : 
							   "/".equals(ope) ? num1 / num2 :
							   "%".equals(ope) ? num1 % num2 : 0;
			
			System.out.printf("\n\n Resultado: %f",resultado);
			
			//System.out.println("O valor da operação " + num1 + " " + ope + " " + num2 + " " + "é: " + Integer.parseInt(num1) + Integer.parseInt(num2));


			entrada.close();
	}
}