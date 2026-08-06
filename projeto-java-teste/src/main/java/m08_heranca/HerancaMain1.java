package m08_heranca;

public class HerancaMain1 {
	
	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro("Zeus", 9, "Pit Bull");
		cachorro.abanarRabo(); /*Seu proprio método*/
		cachorro.emitirSom();
		cachorro.dormir();
		
		System.out.println("-------------------------------------------------");
		
		Gato gato = new Gato("Mimi", 3, "Branco");
		gato.arranhar(); /*Seu proprio método*/
		gato.emitirSom();
		gato.dormir();
		
		System.out.println("-------------------------------------------------");
		
		
		Cavalo cavalo = new Cavalo("Relampago", 5, 1.60);
		cavalo.galopar(); /*Seu proprio método*/
		cavalo.emitirSom();
		cavalo.dormir();
	}

}
