package m03_entradade_dados_memoria_debug;

public class Valor_vs_Referencia {

	public static void main(String[] args) {
		
		
		/*Passagem de valor*/
		int x = 10;
		int y = x;
		
		y = 20;
		
		System.out.println("Valor de y: " + y);
		
		
		/*Passagem por referencia*/
		
		Pessoa p1 = new Pessoa();
		p1.nome = "Alex fernando";
		
		Pessoa p2 = p1;
		
		System.out.println("Valor do P2: "+ p2.nome);
		System.out.println("Valor do P1: "+ p1.nome);
		
		
		p2.nome = "Maria jose";
		
		System.out.println("Valor do P2: "+ p2.nome);
		System.out.println("Valor do P1: "+ p1.nome);
		
		

	}

}
