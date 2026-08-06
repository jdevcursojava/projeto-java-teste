package m08_heranca;

public class Gato extends Animal {

	private String cor;

	public Gato(String nome, int idade) {
		super(nome, idade);
	}

	public Gato(String nome, int idade, String cor) {
		super(nome, idade);
		this.cor = cor;
	}

	void arranhar() {
		System.out.println("Gato arranhando: " + getNome());
	}

	@Override
	void emitirSom() {
		System.out.println("Gato miando: " + getNome());
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
