package controller;
import model.Dipendente;
import view.Vista;

public class Avvio {

	//	    creare un progetto chiamato gestioneDipendenteConVettore che abbia 2 classi model:
	//		1)Persona(nome,cognome,eta,codiceFiscale,sesso)
	//		2)Dipendente(nome,cognome,eta,codiceFiscale,sesso,stipendio)
	//
	//
	//
	//		specifiche funzionali:
	//		menu Dipendente
	//		1)inserimento
	//		2)modifica
	//		3)cancella
	//		4)trova per codice Fiscale
	//		5)stampa elenco
	//		6)stampa scheda
	//		7)esci

	public static void main(String[] args) throws InterruptedException {

		Vista vista = new Vista();

		String res;

		boolean trovato = false;

		boolean flag = false;

		System.out.println("COLLOCAMENTO FUNZIONALE\n");

		int quantita = vista.leggiIntero("Quanti dipendenti vuoi aggiungere?");

		Dipendente[] dipendente = new Dipendente[quantita];
		
		do {
			
			int scelta = vista.leggiIntero("1) Inserisci i dati dei dipendenti \n2) Modifica \n3) Cancella \n4) Trova per CF"
					+ "\n5) Stampa elenco \n6) Stampa scheda \n7) Exit");
			
			switch (scelta) {
			
			case 1:
				for (int i = 0; i < dipendente.length;i++) {

					dipendente[i] = new Dipendente();

					vista.addDipendente(dipendente[i]);

					res = vista.leggiStringa("Vuoi inserire un altro dipendente?");

					if(res.equalsIgnoreCase("si") && i == quantita -1) {
						System.out.println("Limite di inserimento raggiunto");
						System.out.println(quantita > 1 ? (i+1) + " Dipendenti inseriti..." : (i+1) + " Dipendente insnerito...");
						break;
					}
					else if(res.equalsIgnoreCase("no")){
						System.out.println(quantita > 1 ? (i+1) + " Dipendenti inseriti..." : (i+1) + " Dipendente inserito...");
						break;
					}
				}	
				flag = true;
				break;
				
			case 2:
				String res1 = vista.leggiStringa("Cerca per codice fiscale");
				
				int posizione = 0;
				
				for (int i = 0; i < dipendente.length; i++) {
					if(res1.equalsIgnoreCase(dipendente[i].getCodiceFiscale())) {
						posizione = i;
						System.out.println("Dipendente : " + dipendente[i].toString());
						trovato = true;
					}
					if(trovato) {
						vista.modifica(dipendente[posizione]);
						break;
					}
					if(!trovato) {
						System.out.println("Dipendente non presente");
					}
				}
				flag = true;
				break;
				
			case 3:
				String cancella = vista.leggiStringa("Inserisci il codice fiscale del dipendente che vuoi eliminare");
				
				for (int i = 0; i < dipendente.length; i++) {
					if(dipendente[i] != null) {
						if(dipendente[i].getCodiceFiscale().equalsIgnoreCase(cancella)) {
							System.out.println("Dipendente Cancellato : " + dipendente[i].toString());
							trovato = true;
							if(trovato) {
								dipendente[i] = null;
							}
						} 
					}
				}
				if(!trovato) {
					System.out.println("Menu non trovato");
					trovato = false;
				}
				flag = true;
				break;
				
			case 4:
				if(dipendente != null) {
					String cercaCF = vista.leggiStringa("Inserisci il codice fiscale da ricercare");
					for (int i = 0; i < dipendente.length; i++) {
						if(dipendente[i] != null && dipendente[i].getCodiceFiscale().equalsIgnoreCase(cercaCF)) {
							System.out.println("Dipendente trovato : " + dipendente[i].toString());
							trovato = true;
						}
					}
				}
				if(!trovato) {
					System.out.println("Dipendente non presente nell'elenco");
				}
				flag = false;
				break;
				
			case 5:
				for (int i = 0; i < dipendente.length; i++) {
					if(dipendente[i] != null)
					System.out.println(dipendente[i].toString());
				}
				flag = true;
				break;
				
			case 6:
				vista.stampaScheda(dipendente);
				flag = true;
				break;
			case 7:
				System.out.println("Fine Programma");
				flag = false;
				break;
			}
		}while (flag);
	}
}
