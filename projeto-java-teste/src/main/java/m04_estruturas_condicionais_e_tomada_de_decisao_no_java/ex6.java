package m04_estruturas_condicionais_e_tomada_de_decisao_no_java;

public class ex6 {
	
	 public static void main(String[] args) {
		
		 Object valor  = "Java"; // entre aspas ("") é um objeto String
		 
		 if (valor instanceof String) { /*Verifica se é String*/
			 String texto = (String) valor; /*Converte para Sting*/
		     System.out.println(texto.toUpperCase()); /*Pode chamar os método do Objeto (String)*/
		 }
		 
		 
		 if (valor instanceof String texto) { /*Verificação de String e conversão ao mesmo tempo*/
			 System.out.println(texto.toUpperCase()); /*Então a chamada pode ser direta*/ 
		 }

		 
	}

}
