package m08_heranca;

public class MainPagamento {

	public static void main(String[] args) {

		Pix pix = new Pix(80.0);
		pix.processarPagamento();
		pix.emitirComprovante();
		
		
		Boleto boleto = new Boleto(90.0);
		boleto.processarPagamento();
		boleto.emitirComprovante();
		
		Cartao cartao = new Cartao(100.0);
		cartao.processarPagamento();
		cartao.emitirComprovante();
	}

}
