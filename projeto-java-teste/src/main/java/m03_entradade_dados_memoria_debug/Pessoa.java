package m03_entradade_dados_memoria_debug;

public class Pessoa {

	public String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	@Override
	public String toString() {
		
		return "Pessoa: " + nome;
	}

}
