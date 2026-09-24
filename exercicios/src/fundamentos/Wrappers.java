package fundamentos;

//import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {

		// Scanner entrada = new Scanner(System.in);

		// byte
		Byte b = 10;
		Short s = 2000;

		// Integer i = Integer.parseInt(entrada.next());
		Integer i = 10000; // int
		Long l = 100000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.567;
		System.out.println(d);
		
		Boolean bo = true; // Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(( "" + bo).toUpperCase());
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(( "" + c).toUpperCase());
		System.out.println(c.toString());

		// entrada.close();

	}
}
