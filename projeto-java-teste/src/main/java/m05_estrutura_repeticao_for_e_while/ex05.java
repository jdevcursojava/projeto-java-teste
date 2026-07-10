package m05_estrutura_repeticao_for_e_while;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		
		/*Enquanto estamos digitando a nota DIFERENTE dos valores 0 e 10 ele vai ficar pedindo a nota correta*/
		
		Scanner scanner = new Scanner(System.in);
		int nota = -1; /*Para poder ser TRUE na primeira verificação do while*/
		
		while (nota < 0 || nota > 10) {
			System.out.println("Digite uma nota entre 0 e 10: ");
			nota = scanner.nextInt();
		}
		
		
		System.out.println("Nota válidada com sucesso: " + nota);
		scanner.close();
		

	}

}
