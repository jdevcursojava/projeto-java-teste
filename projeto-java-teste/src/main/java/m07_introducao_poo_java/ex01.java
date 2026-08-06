package m07_introducao_poo_java;

public class ex01 {

	public static void main(String[] args) {

		/* Iniciando, instanciando, criando, definindo o objeto Pessoa */
		Pessoa pessoa = new Pessoa("Alex", 38, "18/10/1987");
		
		
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Idade: " + pessoa.getIdade());
		System.out.println("Data Nasc: " + pessoa.getDataNascimento());
		

	}

}
