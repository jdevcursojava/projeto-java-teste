package m03_entradade_dados_memoria_debug;

public class Exemplo_Debug {
	
	public static void main(String[] args) {
		
		/*F5 entra no método*/
		/*F6 pula de linha em linha*/
		/*F7 pula o método*/
		/*F8 continua até o próximo ponto de parada ou executa tudo*/
		
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Alex");
		
		System.out.println("Nome da pessoa com getPessoa: " + pessoa.getNome());
		
		System.out.println("Nome da pessoa com o toString: " + pessoa.toString());
		
	}

}
