package m10_interface;

public class BancoFinanceiraInterface {
	
	public void executarPagamento(Pagamento pagamento, double valor) {
		pagamento.pagar(valor);
		pagamento.imprimirComprovante();
	}

}
