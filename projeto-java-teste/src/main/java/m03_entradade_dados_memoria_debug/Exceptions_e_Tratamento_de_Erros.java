package m03_entradade_dados_memoria_debug;

public class Exceptions_e_Tratamento_de_Erros {
	
	 public static void main(String[] args) throws Exception {
		 
		 /*o que é Exception = Erros do sistema*/
		 
		/*try {
		 
		 int x = 10 / 0;
		 
		 }catch (Exception e) {
			throw new Exception("Não pode ser dividido por zero");
		}*/
		 
		 
		/* Pessoa pessoa = new Pessoa();
		 pessoa.nome = "Alex";
		 
		 System.out.println(pessoa.nome);*/
		 
		 
		/* int numero = Integer.parseInt("50");
		 System.out.println(numero);*/
		 
		 int numero[] = new int[5];
		 numero[0] = 10;//1
		 numero[1] = 20;//2
		 numero[2] = 60;//3
		 numero[3] = 80;//4
		 numero[4] = 70;//5

		 
		 
		 System.out.println(numero[4]);
		 
		
	}

}
