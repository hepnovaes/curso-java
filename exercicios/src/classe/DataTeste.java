package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data data1 = new Data();
		
		data1.dia = "08";
		data1.mes = "06";
		data1.ano = "1999";
		
		System.out.println(data1.obterDataFormatada());
		
		Data data2 = new Data();
		
		data2.dia = "03";
		data2.mes = "10";
		data2.ano = "2026";
		
		String data2Final = data2.obterData();
		
		//data1.imprimirDataFormatada();
		
		System.out.println("Descanse em paz minha amada gatinha Gordinha, que Deus cuide de você pela eternidade <3 : " + data2Final);
	}
}
