package m08_heranca;

public class Boleto extends Pagamento {

	public Boleto(double valor) {
		super(valor);
	}
	
	@Override
	public void processarPagamento() {
		System.out.println("Processando pagamento Boleto customizado, valor: "+ getValor());
	}

}
