package m10_interface;

/*Interface é um contrato, onde quem implementa obrigado a seguir as regras e implemar os métodos*/
public interface Pagamento {

	/*As filhas são obrigadas a implementar*/
	public void pagar(double valor);

	/*As filhas são obrigadas a implementar*/
	public void imprimirComprovante();

}
