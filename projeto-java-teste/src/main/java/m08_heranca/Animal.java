package m08_heranca;

/*Classe pai ou super classe que tem atributos e comportamentos comum a todos*/
public class Animal {

	/* Podem ser reutilizados pelas classes filhas */
	private String nome;
	private int idade;
	
	
	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	/* Podem ser reutilizados pelas classes filhas */
	void emitirSom() {
		System.out.println("Som de animal: " + nome);
	}

	/* Podem ser reutilizados pelas classes filhas */
	void dormir() {
		System.out.println("Animal dormindo: " + nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
