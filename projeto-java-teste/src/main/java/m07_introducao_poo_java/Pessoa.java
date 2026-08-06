package m07_introducao_poo_java;

/*Classe Pessoa*/
public class Pessoa {

	/* Caracteristicas */
	private final String nome;
	private final int idade;
	private final String dataNascimento;

	public Pessoa(String nome, int idade, String dataNascimento) {
		this.nome = nome;
		this.idade = idade;
		this.dataNascimento = dataNascimento;
	}

	/* Get é para obter(Retornar) informação do Objeto */
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

}
