package controller;

import model.Cucina;
import view.Vista;

public class Avvio {

	public static void main(String[] args) {

		System.out.println("INSERIMENTO MENU\n\n");

		Vista vista = new Vista();

		int quantita = vista.leggiIntero("Quanti menu vuoi inserire?");

		boolean trovato = false;

		String res;

		Cucina[] cucina = new Cucina[quantita];

		boolean flag = false;

		do {

			int scelta = vista.leggiIntero("1) Componi il Menu \n2) Cerca Menu per ID \n3) Visualizza il conto \n4) Scegli il menu del giorno \n5) Modifica id"
					+ "\n6) Cancella un Menu");

			switch (scelta) {
			case 1:
				for (int i = 0; i < cucina.length;i++) {

					cucina[i] = new Cucina();

					vista.addMenu(cucina[i]);

					res = vista.leggiStringa("Vuoi inserire una nuovo menu? si/no");

					if(res.equalsIgnoreCase("si") && i == quantita -1) {
						System.out.println("Limite di inserimento raggiunto");
						System.out.println(quantita > 1 ? (i+1) + " Menu inseriti..." : (i+1) + " Menu inserito...");
						break;
					}
					else if(res.equalsIgnoreCase("no")){
						System.out.println(quantita > 1 ? (i+1) + " Menu inseriti..." : (i+1) + " Menu inserito...");
						break;
					}
				}				
				break;

			case 2:
				if(cucina != null) {
					boolean flagInt;
					int res1 = 0;
					do {
						flagInt = false;
						try {
							res1 = vista.leggiIntero("Inserisci ID:");
						} catch (NumberFormatException e) {
							System.out.println("Inserisci un numero intero");
							flagInt = true;
						}
					}while(flagInt);
					for (int i = 0; i < cucina.length; i++) {
						if(res1 == cucina[i].getId()) {
							System.out.println("ID trovato : " + cucina[i].toString());
							trovato = true;
						}
					}
					if(!trovato) {
						System.out.println("Id non presente");
					}

				}
				else {
					System.out.println("Nessun menu presente");
				}
				break;

			case 3:
				System.out.println("In che modo si desidera stampare?");
				int sceltaStampa = vista.leggiIntero("1) Stampa scheda \n2) Stampa csv");
				switch(sceltaStampa) {
				case 1:
					if(cucina != null) {
						vista.stampaScheda(cucina);
					}
					else {
						System.out.println("Non sono presenti menu");
						break;
					}
					break;
				case 2:
					for (int i = 0; i < cucina.length; i++) {
						System.out.println(cucina[i].toString());
					}

				}
				break;

			case 4:
				Cucina menuDelGiorno = new Cucina(1,"Mozzarella e Prosciutto crudo", "Tagliatelle ai funghi porcini", 
						"Tagliata di carne", "Vino della casa e acqua","Patate al forno", "Torta caprese","Liconcello o Caffe");
				System.out.println(menuDelGiorno.toString());
				break;

			case 5:
				int res1 = vista.leggiIntero("Cerca ID");
				int posizione = 0;
				for (int i = 0; i < cucina.length; i++) {
					if(res1 == cucina[i].getId()) {
						posizione = i;
						System.out.println("ID trovato : " + cucina[i].toString());
						trovato = true;
					}
					if(trovato) {
						vista.modifica(cucina[posizione]);
						break;
					}
					if(!trovato) {
						System.out.println("Id non presente");
					}
				}
				break;

			case 6:
				int cancella = vista.leggiIntero("Inserisci l'ID del Menu che vuoi eliminare");
				for (int i = 0; i < cucina.length; i++) {
					if(cucina[i] != null) {
						if(cucina[i].getId() == cancella) {
							System.out.println("Menu Cancellato : " + cucina[i].toString());
							trovato = true;
							if(trovato) {
								cucina[i] = null;
							}
						} 
					}
				}
				if(!trovato) {
					System.out.println("Menu non trovato");
					trovato = false;
				}
				break;

			default:
				System.out.println("Inserisci una scelta valida...");
			}
			res = vista.leggiStringa("Vuoi Tornare al menu principale? si/no");

			if(res.equalsIgnoreCase("si")) {
				flag = true;
			}
			else {
				flag = false;
			}

		}while (flag);
	}
}
