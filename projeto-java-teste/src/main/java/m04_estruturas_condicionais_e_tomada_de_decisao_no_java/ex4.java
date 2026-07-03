package m04_estruturas_condicionais_e_tomada_de_decisao_no_java;

public class ex4 {

	public static void main(String[] args) {

		String opcao = "A";

		if (opcao.equals("A")) {
			System.out.println("Administrado");
		} else if (opcao.equals("U")) {
			System.out.println("Usuário");
		} else {
			System.out.println("INválida");
		}

		/* ========================= Usando switch case ============================= */

		switch (opcao) {
		case "A":
			System.out.println("Administrado");
			break;
		case "U":
			System.out.println("Usuario");
			break;
		default:
			System.out.println("Invalido");
		}

		String retorno = switch (opcao) {
		case "A" -> "Administrado";
		case "U" -> "Usuario";
		default -> "Invalido";
		};

		System.out.println("Retorno: " + retorno);

		retorno = switch (opcao) {
			case "A" -> {
				System.out.println("Administrador");
				yield "adminstrador";
			}
			case "U" -> {
				System.out.println("Usuário");
				yield "Usuario";
			}
			default -> "Invalido";
		};
		
		
		System.out.println("Processou método de: " + retorno);

	}

}
