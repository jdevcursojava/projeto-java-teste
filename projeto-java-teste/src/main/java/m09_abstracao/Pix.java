package m09_abstracao;

public class Pix extends Pagamento {

	public Pix(String nomePessoa) {
		super(nomePessoa);
	}

	@Override
	public void pagar(double valor) {
		System.out.println("Realizando pagamento de Pix no valor de R$: " + valor);
		imprimirComprovante();
	}

}
