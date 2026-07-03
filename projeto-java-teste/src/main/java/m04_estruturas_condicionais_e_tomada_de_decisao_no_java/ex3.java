package m04_estruturas_condicionais_e_tomada_de_decisao_no_java;

public class ex3 {
	
	
	public static void main(String[] args) {
		
	  int idade = 17; /*Atribuição de valor (=)*/
	  
	  if (idade == 18) { /*Comparação de valor (==)*/
		  System.out.println("Maior de 18 anos");
	  }
	  
	  
	  if (idade != 18) { /*Expressão de valor diferente*/
		  System.out.println("Pessoa não tem 18 anos");
	  }
	  
	  if (idade >= 18) {
		  System.out.println("Pessoa maior de idade");
	  }else {
		  System.out.println("Pessoa menor de idade");
	  }
	  
	  
	  String senha = "aa68sa";
	  
	  if (senha != null && !senha.isEmpty()) {
		  System.out.println("Processar e verificar a senha");
	  }else {
		  System.out.println("Senha deve ser informada");
	  }
		
	}

}
