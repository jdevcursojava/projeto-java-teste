package m10_interface;

public class Pix implements Pagamento {

	@Override
	public void pagar(double valor) {
		System.out.println("Realizando pagamento por pix no valor de R$: " + valor);
	}

	@Override
	public void imprimirComprovante() {
		System.out.println("Imprimindo comprovante de pagamento de pix.");
		System.out.println("-----------------------------------------------");
	}

}
