package m03_entradade_dados_memoria_debug;

public class GarbageCollector {
	
	
	 public static void main(String[] args) {
		 
		 Pessoa pessoa = new Pessoa();
		 
		 /*Garbage COllection  irá identificar que está null e irá colocar no lixo o obj pessoa*/
		 pessoa = null;
		 
		 System.gc();
		 
		 // ou
		 
		 Runtime.getRuntime().gc();
		 
		 
		 /*Ex uso*/
		 
		 int contador = 0;
		 
		 for (int i = 0; i < 1000; i++) {
			
			 Pessoa pessoa2 = new Pessoa();
			
			 // Salvando, gerando Certificado, algo do tipo
			 if (contador == 100) {
				 System.gc();
				 contador = 0;
			 }
			 
			 contador++;
			 
		}
		 
	}

}
