package m04_estruturas_condicionais_e_tomada_de_decisao_no_java;

public class ex1 {
	
	
	public static void main(String[] args) {
		
		int idade = 17;
		
		if (idade >= 18) { /*Verdade*/
			System.out.println("Maior de idade");
		}else {
			System.out.println("Menor de idade");
		}
		
		boolean userAtivo = true;
		
		if (userAtivo) {
			System.out.println("Usuário está ativo");
		}else {
			System.out.println("Usuário não está ativo");
		}
		
		double saldoSalario = 3500;
		
		if (saldoSalario >= 3500) {
			System.out.println("Saldo disponível");
		}
		
	}

}
