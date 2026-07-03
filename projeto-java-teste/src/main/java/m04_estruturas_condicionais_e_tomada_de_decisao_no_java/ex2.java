package m04_estruturas_condicionais_e_tomada_de_decisao_no_java;

public class ex2 {

	public static void main(String[] args) {

		double nota = 8.9;

		if (nota >= 9.0) {
			System.out.println("Excelente");
		} else if (nota >= 7.0) {
			System.out.println("Aprovado");
		} else if (nota >= 5.0) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}
		
		
		//=================ERRO COMUM DE NÃO USAR ELSE gera bugs e execução indevida================
		
		
		if (nota >= 9.0) {
			System.out.println("Excelente");
		} 
		
		if (nota >= 7.0) {
			System.out.println("Aprovado");
		} 
		
		if (nota >= 5.0) {
			System.out.println("Recuperação");
		} 
		
		{
			System.out.println("Reprovado");
		}

	}

}
