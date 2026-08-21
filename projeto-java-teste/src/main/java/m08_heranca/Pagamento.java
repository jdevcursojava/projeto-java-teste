package m08_heranca;

public class Pagamento {

	private double valor;

	public Pagamento(double valor) {
		super();
		this.valor = valor;
	}

	public void processarPagamento() {
		System.out.println("Processando pagamento: " + valor);
	}

	public void emitirComprovante() {
		System.out.println("Emitindo comprovante.");
	}
	
	public double getValor() {
		return valor;
	}

}
