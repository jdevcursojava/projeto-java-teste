package m10_interface;

public class MainPagamento {
	
	public static void main(String[] args) {
		
		BancoFinanceiraInterface banco = new BancoFinanceiraInterface();

		banco.executarPagamento(new Pix(), 80);
		
		banco.executarPagamento(new Boleto(), 70);
		
		banco.executarPagamento(new Cartao(), 90);
	}

}
