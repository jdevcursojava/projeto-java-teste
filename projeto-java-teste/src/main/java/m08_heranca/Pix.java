package m08_heranca;

public class Pix extends Pagamento {

	public Pix(double valor) {
		super(valor);
	}
	
	@Override
	public void processarPagamento() {
	   System.out.println("Processando pagamento PIX customizado, valor: "+ getValor());
	}

}
