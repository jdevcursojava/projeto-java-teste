package m09_abstracao;


/*Abastração ele pode conter métodos que pode ser reutilizados ou não
 * e  tb tem métodos que é obrigatório a sua implementação pela classe filhas*/
public abstract class Pagamento {

	/*As classes filhas são obrigadas a implementar*/
	public abstract void pagar(double valor);
	
	//public abstract void desconto(double valor);
	
	public String nomePessoa;
	
	/*Método que serve para todos os tipos de pagamento*/
	public void imprimirComprovante() {
		System.out.println("Imprimindo comprovante de pagamento para: " + nomePessoa);
		System.out.println("-------------------------------------------------------------------"); 
	}
	
	public Pagamento(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
	
	

}
