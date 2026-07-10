package m05_estrutura_repeticao_for_e_while;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		/* Informar 4 nota válidas */

		int contador = 1;
		List<Integer> notas = new ArrayList<Integer>();
		int nota = 0;

		System.out.println("Informe -1 para sair");
		
		while (nota != -1) { /*Primeiro verifica e depois executa (Pode nunca ser executado)*/
			System.out.println("Informe a note : " + contador);
			nota = scanner.nextInt();
			notas.add(nota);
			
			contador ++;
		}
		
		scanner.close();
		
		System.out.println("Notas que foram informadas");
		
		for (Integer n : notas) {
			if (n >= 0)
			System.out.println("Nota: " + n);
		}
		
	}

}
