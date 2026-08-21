package m10_interface;

public class Cartao implements Pagamento {

	@Override
	public void pagar(double valor) {
		System.out.println("Realizando pagamento por cartão no valor de R$: " + valor);
	}

	@Override
	public void imprimirComprovante() {
		System.out.println("Imprimindo comprovante de pagamento de cartão.");
		System.out.println("-----------------------------------------------");
	}

}
