package controller;

import model.Carrello;
import view.Vista;

public class Avvio {

	public static void main(String[] args) {

		System.out.println("IL TUO CARRELLO");

		Vista vista = new Vista();

		int quantita = vista.leggiIntero("Quanti elementi vuoi aggiungere al carrello?");

		Carrello[] carrello = new Carrello[quantita];

		boolean trovato = true;

		boolean exit = false;

		do {
			int scelta = vista.leggiIntero("1) Inserisci elementi nel carrello \n2) Ricerca elemento \n3) Modifica carrello \n4) Stampa carrello \n6) Exit"
					+ "\n5) Svuota carrello");
			switch (scelta) {
			case 1:
				for (int i = 0; i < carrello.length; i++) {
					carrello[i] = new Carrello();
					vista.aggiungiAlCarrello(carrello[i]);
					System.out.println();
					if(carrello.length == quantita-1) {
						break;
					}
				}
				break;
			case 2:
				String ricerca = vista.leggiStringa("Controlla se l'elemento è presente nel carrello");
				if(carrello != null) {
					trovato = false;
					for (int i = 0; i < carrello.length && carrello[i] != null; i++) {
						if(carrello[i].toString().equalsIgnoreCase(ricerca)) {
							System.out.println("Elemento trovato in " + carrello[i].toString());
							trovato = true;
						}
					}
				}
				if(!trovato) {
					System.out.println("Elemento non trovato");
				}
				break;
			case 3:
				String modifica = vista.leggiStringa("Quale elemento vuoi modificare?");
				if(carrello != null) {
					trovato = false;
					for (int i = 0; i < carrello.length && carrello[i] != null; i++) {
						if(carrello[i].toString().equalsIgnoreCase(modifica)) {
							System.out.println("Elemento trovato");
							vista.modificaCarrello(carrello[i]);
							trovato = true;
						}
					}
					if(!trovato) {
						System.out.println("Elemento non trovato");
					}
				}
				break;
			case 4:
				for (int i = 0; i < carrello.length; i++) {
					System.out.println(carrello[i].toString());
				}
				break;
			case 5:
				String svuotaCarrello = vista.leggiStringa("Quale carrello vuoi svuotare?");
				if(carrello != null) {
					trovato = false;
					for (int i = 0; i < carrello.length && carrello[i] != null; i++) {
						if(carrello[i].toString().equalsIgnoreCase(svuotaCarrello)) {
							System.out.println("Carrello eliminato:  " + carrello[i].toString());
							carrello[i] = null;
							trovato = true;
						}
					}
				}
				if(!trovato) {
					System.out.println("Elemento non trovato");
				}
				break;
				
			case 6:
				System.out.println("Fine Programma");
				exit = true;
				break;
			default:
				System.out.println("Inserisci un numero presente nel menu...");
			}

		} while (!exit);
	}
}
