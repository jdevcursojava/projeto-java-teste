package m09_abstracao;

public class Cartao extends Pagamento {

	public Cartao(String nomePessoa) {
		super(nomePessoa);
	}

	@Override
	public void pagar(double valor) {
		System.out.println("Realizando pagamento de Cartao no valor de R$: " + valor);
		imprimirComprovante();
	}
	
	@Override
	public void imprimirComprovante() {
		System.out.println("Imprimindo comprovante de pagamento de cartão de crédito: ." + nomePessoa);
		System.out.println("-------------------------------------------------------------------"); 
	}
	
}
