package classe;

public class Data {

	String dia;
	String mes;
	String ano;
	
	String obterData(){
		return dia + "/" + mes + "/" + ano;
	}
	
	String obterDataFormatada() {
		return String.format("%s/%s/%s", dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}
}
