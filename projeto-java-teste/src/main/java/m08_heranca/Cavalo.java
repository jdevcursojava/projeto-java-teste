package m08_heranca;

public class Cavalo extends Animal {

	private double altura;

	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}

	public Cavalo(String nome, int idade, double altura) {
		super(nome, idade);
		this.altura = altura;
	}

	void galopar() {
		System.out.println("Cavalo galopando: " + getNome());
	}
	
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
