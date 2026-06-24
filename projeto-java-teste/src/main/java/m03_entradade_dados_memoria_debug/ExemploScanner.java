package m03_entradade_dados_memoria_debug;

import java.util.Scanner;

public class ExemploScanner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe seu nome:");
		String nome = scanner.nextLine();
		
		
		System.out.println("Informe sua idade:");
		int idade = scanner.nextInt();
		
		
		System.out.println("Informe seu salário:");
		double salario = scanner.nextDouble();
		
		
		System.out.println("Meu nome é: " + nome + " tenho: "+ idade + " anos e meu salario é :" + salario);

	}

}
