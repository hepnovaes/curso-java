package fundamentos.operadores;

public class Aritmeticos {

	public static void main(String[] args) {
		System.out.println(2 + 3);
		
		var x = 34.55;
		double y = 12.3;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		System.out.println('\n');
		
		int a = 8;
		int b = 3;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / (double) b);
		System.out.println(a / (float) b);
		
		System.out.println(a % 3);
		System.out.println(8 % 3);
		
		System.out.println(x + y - a * b);
	}
}
