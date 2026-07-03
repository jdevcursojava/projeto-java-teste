package m04_estruturas_condicionais_e_tomada_de_decisao_no_java;

public class ex5 {

	public static void main(String[] args) {

		StatusPedido pedido = StatusPedido.ENVIADO;

		String retorno = switch (pedido) {
				case NOVO -> "Seu pedido foi criado";
				case CANCELADO -> "Seu pedido acaba de ser cancelado";
				case PAGO -> "Recebemos o pagamento do seu pedido";
				case ENVIADO -> "Seu pedido acaba de ser enviado para a transportadora.";
			default -> "Inválido";
		};
		
		System.out.println("Status do seu pedido: " + retorno);

	}

}
