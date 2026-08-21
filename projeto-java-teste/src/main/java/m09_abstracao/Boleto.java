package m09_abstracao;

public class Boleto extends Pagamento {

	public Boleto(String nomePessoa) {
		super(nomePessoa);
	}

	@Override
	public void pagar(double valor) {
		System.out.println("Realizando pagamento de Boleto no valor de R$: " + valor);
		imprimirComprovante();
	}

}
