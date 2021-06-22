//Classe controller:è la classe responsabile dell'intera esecuzione del programma,
//E come tale deve contenere il metodo Main.
//Nel Main verranno chiamati: Servizi/Funzionalità ecc...
//A patto che si crei l'oggetto 
//Es: vogliamo chiamare il metodo somma della classe esercizio,
//Per farlo mi occorre Inizializzare un oggetto di tipo Esercizio.
//L'oggetto si crea con la Keyword "new + Costruttore".
// Gli oggetti si possono creare in tutte le classi
// I Metodi si possono richiamare SOLO!!!! in altri metodi

public class Avvio extends Esercizio {

	public static void main(String[] args) {
		//Menu con opzione
		//Ogni opzione corrisponderà ad un algoritmo
		//Obiettivi della gornata
		// 1) Meettere in comucazione 2 file.java
		// 2) Dare delle funzionalità alla classe Esercizio
		// nb: la funzionalità sarà il singolo algoritmo
		
		//Creazione oggetto somma
		Esercizio esercizio = new Esercizio();
		//invcazione del metodo somma		
		esercizio.sommaDueNumeri(5,4);
		stampa();
		
		new Esercizio().sommaDueNumeri(4, 6);		
		System.out.println();
		esercizio.colore("Rosso");
	}
}
