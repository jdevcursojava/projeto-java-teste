package m09_abstracao;

public class BancoFinanceira {

	public void executarPagamento(Pagamento pagamento, Double valor) {
		pagamento.pagar(valor);
	}

}
