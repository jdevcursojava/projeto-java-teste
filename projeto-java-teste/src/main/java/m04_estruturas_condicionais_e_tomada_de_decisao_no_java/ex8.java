package m04_estruturas_condicionais_e_tomada_de_decisao_no_java;

public class ex8 {

	public static void main(String[] args) throws IllegalAccessException {

		String nome = "Alex";
		int idade = 18;
		double salario = 1500;

		/*
		 * Para um cadastro correto o nome de ser informado, idade maior que 18 e
		 * salário maior que 1500
		 */

		/* ========== Má pratica do uso de IF e ELSE aninhado =========*/
			  /*
		      if (nome != null && !nome.isBlank()) {
		
					if (idade >= 18) {
		
						if (salario >= 1500) {
							salvar(); 
						} else {
							throw new IllegalAccessException("Salário não pode ser menor que 1500");
						}
		
					} else {
						throw new IllegalAccessException("Idade de ser maior que 18");
					}
		
				} else {
					throw new IllegalAccessException("Nome deve ser informado");
				}
				*/
		
		/* ========== Má pratica do uso de IF e ELSE aninhado =========*/
		
		
		/* ================ Boa prática para uso dos if e else ===========================*/
		
			if (nome == null || nome.isBlank()) {
				throw new IllegalAccessException("Nome deve ser informado");
			}
			
			if (idade < 18) {
				throw new IllegalAccessException("Idade de ser maior que 18");
			}
			
			if (salario < 1500) {
				throw new IllegalAccessException("Salário não pode ser menor que 1500");
			}
			
			salvar();
		
		/* ================ Boa prática para uso dos if e else ===========================*/
		

	}

	public static void salvar() {
		System.out.println("Usuário salvo com sucesso");
	}

}
