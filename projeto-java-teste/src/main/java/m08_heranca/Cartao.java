package m08_heranca;

public class Cartao extends Pagamento {

	public Cartao(double valor) {
		super(valor);
	}
	
	@Override
	public void processarPagamento() {
		System.out.println("Processando pagamento Cartao customizado, valor: "+ getValor());
	}


}
