package controller;

import model.Dipendente;
import model.Dirigente;
import model.Manager;
import view.Vista;

public class Avvio {

	public static void main(String[] args) {

		Vista v = new Vista();
		Dipendente[] persona = null;
		int i = 0;
		String res;
		boolean flag = false;
		boolean trovato = false;

		do {
			int scelta = v.leggiIntero("1) Inserimento \n2) Modifica \n3) Cancella \n4) Stampa in CSV \n5) Stampa scheda"
					+ "\n6) Cerca per Codice Fiscale");
			switch (scelta) {
			case 1:
				if(persona == null) {
					int quantita =v.leggiIntero("Quanto Personale vuoi inserire?");
					persona = new Dipendente[quantita];
				}
				if (i != persona.length) {
					int res1 = v.leggiIntero("1) Inserisci Personale \n2) Inserisci Manager \n3) Inserisci Dirigente \n4) Termina");
					switch(res1) {
					case 1:
						persona[i] = new Dipendente();
						v.inserimento(persona[i]);
						i++;
						break;
					case 2:
						persona[i] = new Manager();
						v.inserimento(persona[i]);
						i++;
						break;
					case 3:
						persona[i] = new Dirigente();
						v.inserimento(persona[i]);
						i++;
						break;
					}
				} else {
					System.out.println("Limite di inserimento raggiunto...");
				}
				break;

			case 2:
				String res1 = v.leggiStringa("Cerca per codice fiscale");

				if(persona != null) {
					for (i = 0; i < persona.length && persona[i] != null; i++) {
						if(res1.equalsIgnoreCase(persona[i].getCodiceFIscale())) {
							System.out.println("Personale presente : " + persona[i].toString());
							trovato = true;
						}
						if(trovato) {
							String modifica = v.leggiStringa("Sei sicuro di voler modificare il Personale? si/no");
							if(modifica.equalsIgnoreCase("si"))
								v.modifica(persona[i]);
							break;
						}
						if(!trovato) {
							System.out.println("Personale non presente");
						}
					}
				}else {
					System.out.println("Nessun Personale presente");
				}
				break;

			case 3:
				String res2 = v.leggiStringa("Cerca per codice fiscale: ");

				for (i = 0; i < persona.length; i++) {
					if(res2.equalsIgnoreCase(persona[i].getCodiceFIscale())) {
						v.chiSono(persona[i]);
						System.out.println(persona[i].toString());
						trovato = true;
					}
					if(trovato) {
						String elimina = v.leggiStringa("Vuoi eliminare? si/no");
						if(elimina.equalsIgnoreCase("si")) {
							persona[i] = null;
							v.chiSono(persona[i]);
							System.out.println("eliminato");
						}
						break;
					}
					if(!trovato) {
						System.out.println("Personale non presente");
					}
				}
				break;

			case 4:
				if(persona != null) {
					for (i = 0; i < persona.length && persona[i] != null; i++) {
						trovato = true;
						v.stampaCsv(persona[i]);
					}
				}
				if(!trovato) {
					System.out.println("Nessun Personale presente");
				}
				break;
			case 5:
				if(persona != null) {
					for (i = 0; i < persona.length && persona[i] != null; i++) {
						System.out.println(persona[i].toString());
					}
				} else {
					System.out.println("Nessun Personale presente...");
				}
				break;

			case 6:
				String res3 = v.leggiStringa("Inserisci il Codice Fiscale:");

				for (i = 0; i < persona.length; i++) {
					if(res3.equalsIgnoreCase(persona[i].getCodiceFIscale())) {
						System.out.println("Personale trovato : " + persona[i].toString());
						trovato = true;
					}
					if(!trovato) {
						System.out.println("Personale non presente");
					}
				}
				break;
				
				default:
					System.out.println("Scelta non valida...");
			}
			res = v.leggiStringa("Vuoi Tornare al menu principale? si/no");

			if(res.equalsIgnoreCase("si")) {
				flag = true;
			}
			else {
				flag = false;
			}
		}while (flag);
	}
}
