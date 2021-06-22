public class Avvio {

	public static void main(String[] args) {
		//Chiamare nella classe avvio un servizio che faccia una somma
		//Il servizio, quando chiamato, deve ricevere 2 valori dall'utente
		//Il servizio appartiene alla classe test
		
		Utility u = new Utility();	
//		String nome = u.leggiStringa("Inserisci nome: ");
//		String cognome =  u.leggiStringa("Inserisci cognome: ");
//		int eta = u.leggiIntero("Inserisci un età: ");
//		
//		System.out.println("*********--- Scheda utente ---*********");
//		System.out.println(nome);
//		System.out.println(cognome);
//		System.out.println(eta);	
		
		Test t = new Test();
		System.out.println(t.somma(u.leggiIntero("Inserisci il primo addendo"), u.leggiIntero("Inserisci il secondo addendo")));
		
	}

}
