package m03_entradade_dados_memoria_debug;

public class MutabilidadeImutabilidade {

	public static void main(String[] args) {
		
		
		/*Mutabilidade >>> Objeto pode ser alterado O SEU VALOR.*/
		 StringBuilder stringBuilder = new StringBuilder();
		 stringBuilder.append("\nJava\n");
		 stringBuilder.append("Hibernate\n");
		 stringBuilder.append("Spring boot\n");
		 System.out.println("Objeto Mutável: "+ stringBuilder.toString());
		 
		
		/*Imutabilidade >>> Objeto NÃO pode ser alterado O SEU VALOR.*/
		 
		 String nome = "Alex fernando Egidio";
		 nome.concat(" Dev Java");
		 
		 System.out.println("Objeto Imutável: "+ nome);
		
		

	}
}
