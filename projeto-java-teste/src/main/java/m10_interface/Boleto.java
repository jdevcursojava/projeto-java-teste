package m10_interface;

public class Boleto implements Pagamento {

	@Override
	public void pagar(double valor) {
		System.out.println("Realizando pagamento por boleto no valor de R$: " + valor);
	}

	@Override
	public void imprimirComprovante() {
		System.out.println("Imprimindo comprovante de pagamento de boleto.");
		System.out.println("-----------------------------------------------");
	}

}
