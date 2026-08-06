package m08_heranca;

public class Cachorro extends Animal {

	private String raca;

	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}

	public Cachorro(String nome, int idade, String raca) {
		super(nome, idade);
		this.raca = raca;
	}

	void abanarRabo() {
		System.out.println("Cachorro abanando o rabo: " + getNome());
	}

	@Override /* @Override significa que o método é sobreescrito */
	void emitirSom() {
       System.out.println("Cachorro latindo - método sobreescrito: " + getNome());
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

}
