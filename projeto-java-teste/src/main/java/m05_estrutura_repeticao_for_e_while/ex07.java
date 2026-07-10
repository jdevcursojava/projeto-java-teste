package m05_estrutura_repeticao_for_e_while;

import java.util.Scanner;

public class ex07 {
	
	public static void main(String[] args) {
		
		/*Exemplo com do-while*/
		
		Scanner scanner = new Scanner(System.in);
		int opcao = - 1;
		
		do { /*Ele garante a execução pelo meno uma vez*/
			
			if (opcao == -1) {
				System.out.println("===========MENU============");
				System.out.println("1 - Cadastrar");
				System.out.println("2 - Listar");
				System.out.println("3 - Remover");
				System.out.println("0 - Sair (Encerrar)");
				System.out.println("Escolha uma opção.");
			}
			
			if (opcao == 1) {
				System.out.println("Opção escolhidada é de cadatro..");
			}else if (opcao == 2) {
				System.out.println("Opção escolhidada é de listar..");
			}else if (opcao == 3) {
				System.out.println("Opção escolhidada é de remover..");
			}else if (opcao != -1){
				System.out.println("Opção não encontrada..");
			}
			
			opcao = scanner.nextInt();
			
		}while(opcao != 0);
		
		
		System.out.println("Saindo do sistema, encerrado!");
		
	}

}
