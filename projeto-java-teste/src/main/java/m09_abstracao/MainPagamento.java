package m09_abstracao;

public class MainPagamento {

	public static void main(String[] args) {

		/*Pix pix = new Pix();
		pix.pagar(80);
		*/
		
		/*Cartao cartao = new Cartao();
		cartao.pagar(60);*/
		
		/*Boleto boleto = new Boleto();
		boleto.pagar(90);*/
		
		
		BancoFinanceira bancoFinanceira = new BancoFinanceira();
		
		bancoFinanceira.executarPagamento(new Pix("João"), 80.00);
		bancoFinanceira.executarPagamento(new Cartao("Maria"), 60.00);
		bancoFinanceira.executarPagamento(new Boleto("Paulo"), 90.00);
	 
	}

}
