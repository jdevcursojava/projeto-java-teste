package m04_estruturas_condicionais_e_tomada_de_decisao_no_java;

public class ex7 {
	
	 public static void main(String[] args) {
		
		 String nome = " aasasas";
		 int idade = 0;
		 
		 if (nome == null || nome.isBlank()) {
			 throw new IllegalArgumentException("Nome obrigatório");
		 }
		 
		 System.out.println("Meu nome é: " + nome);
		 
		 if (idade <= 0) {
			 throw new IllegalArgumentException("Idade deve ser informada corretamente");
		 }
		 
	}

}
