package controller;

import model.Dipendente;
import model.Dirigente;
import model.Manager;
import model.Persona;
import model.PersonaCRUD;
import view.Vista;

public class Avvio {

	public static void main(String[] args) {

		PersonaCRUD personaToList = new PersonaCRUD();

		Persona persona = null;

		boolean exit = true;

		Vista v = new Vista();

		boolean trovato;

		do {
			int scelta = v.leggiIntero("1) inserisci \n2) modifica \n3) stampa csv \n4) cancella \n5) stampa scheda");
			switch(scelta) {
			case 1:
				int sceltaInserimento = v.leggiIntero("1) inserisci dipendente, 2) inserisci manager, 3) inserisci dirigente");
				switch(sceltaInserimento) {
				case 1:
					persona = new Dipendente();
					v.inserimento(persona);
					personaToList.inserisci(persona);
					break;
				case 2:
					persona = new Manager();
					v.inserimento(persona);
					personaToList.inserisci(persona);
					break;
				case 3:
					persona = new Dirigente();
					v.inserimento(persona);
					personaToList.inserisci(persona);
					break;
				}
				break;
			case 2:
				if(!personaToList.leggi().isEmpty()) {
					int res1 = v.leggiIntero("Cerca per id");
					trovato = false;
					for (int i = 0; i < personaToList.leggi().size(); i++) {
						if(res1 == personaToList.leggi(i).getId()) {
							trovato = true;
							System.out.println("Personale presente : " + personaToList.leggi(i).toString());
							Persona personaCopy = v.duplica(personaToList.leggi(i));
							v.modifica(personaCopy);
							String modifica = v.leggiStringa("Sei sicuro di voler modificare il Personale? si/no");
							if(modifica.equalsIgnoreCase("si")) {
								personaToList.modifica(i, personaCopy);
							System.out.println("Personale modificato con successo...");
							}
							break;
						}
					}
					if(!trovato) {
						System.out.println("Personale non presente");
					}
				}else {
					System.out.println("Nessun Personale presente");
				}
				break;
			case 3:
				for (Persona element : personaToList.leggi()) {
					System.out.println(element.toString());
				}
				break;
			case 4:
				if(!personaToList.leggi().isEmpty()) {
					int res1 = v.leggiIntero("Cerca per id");
					trovato = false;
					for (int i = 0; i < personaToList.leggi().size(); i++) {
						if(res1 == personaToList.leggi(i).getId()) {
							trovato = true;
							System.out.println("Personale presente : " + personaToList.leggi(i).toString());
							String modifica = v.leggiStringa("Sei sicuro di voler eliminare il Personale? si/no");
							if(modifica.equalsIgnoreCase("si")) {
								personaToList.cancella(i);
							System.out.println("Personale eliminato con successo...");
							}
							break;
						}
					}
					if(!trovato) {
						System.out.println("Personale non presente");
					}
				}else {
					System.out.println("Nessun Personale presente");
				}
				break;
			case 5:
				for (Persona element : personaToList.leggi()) {
					v.stampaScheda(element);
				}
				break;
			}
		} while(exit);
	}
}
