package controller;

import model.Auto;
import view.Utility;

public class Avvio {

	public static void main(String[] args) {

		System.out.println("\n\t\t\t***** GESTISCI IL PARCO AUTO *****\n\n");

		Utility utility = new Utility();

		int quantita = utility.leggiIntero("Quante auto vuoi aggiungere?");

		String res;

		Auto[] auto = new Auto[quantita];

		boolean flag = false;

		do {
			//***** SCELTA MENU ***** 
			int scelta = utility.leggiIntero("1) Compila i campi \n2) Cerca auto \n3) Stampa");
			//***** FINE SCELTA MENU ***** 

			//***** AGGIUNTA AUTO ***** 
			switch (scelta) {
			case 1:
				for (int i = 0; i < auto.length;i++) {

					auto[i] = new Auto();

					utility.addAuto(auto[i]);

					res = utility.leggiStringa("Vuoi inserire una nuova auto? si/no");

					if(res.equalsIgnoreCase("si") && i == quantita -1) {
						System.out.println("Limite di inserimento raggiunto");
						System.out.println(quantita > 1 ? (i+1) + " Auto inserite..." : (i+1) + " Auto inserita...");
						break;
					}
					else if(res.equalsIgnoreCase("no")){
						System.out.println(quantita > 1 ? (i+1) + " Auto inserite..." : (i+1) + " Auto inserita...");
						break;
					}
				}				
				break;
				//***** FINE AGGIUNTA AUTO ***** 

			case 2:
				//***** RICERCA ***** 
				System.out.println("In base a cosa vuoi avviare la ricerca?");
				int sceltaCerca = utility.leggiIntero("1) Marca \n2) Modello \n3) Numero di targa \n4) Anno di immatricolazione");

				switch(sceltaCerca) {
				case 1:
					// ricerca per marca
					String res1 = utility.leggiStringa("Inserisci la marca da ricercare");
					boolean trovato = false;
					for (Auto marca : auto) {
						if(marca.getMarca().equals(res1)) {
							System.out.println("Marca trovata: " + marca.getMarca() + " : " + marca);
							trovato = true;
						}
					}
					if(!trovato) {
						System.out.println("Marca non trovata");
					}
					break;
				case 2:
					// ricerca per modello
					String res2 = utility.leggiStringa("Inserisci il modello da ricercare");
					trovato = false;
					for (Auto modello : auto) {
						if(modello.getModello().equals(res2)) {
							System.out.println("Modello trovato: " + modello.getModello() + " in: " + modello);
							trovato = true;
						}
					}
					if(!trovato) {
						System.out.println("Modello non trovato");
					}
					break;

				case 3:
					// ricerca per targa
					String res3 = utility.leggiStringa("Inserisci la targa da ricerare");
					trovato = false;
					for (Auto targa : auto) {
						if(targa.getTarga().equals(res3)) {
							System.out.println("Targa trovata: " + targa.getTarga() + " : " + targa);
							trovato = true;
						}
					}
					if(!trovato) {
						System.out.println("Targa non trovata");
					}
					break;
					// ricerca per anno di immatricolazione
				case 4:
					int res4 = utility.leggiIntero("Inserisci l'anno di immatricolazione");
					trovato = false;
					for (Auto anno : auto) {
						if(anno.getAnno() == res4) {
							System.out.println("Anno trovato: " + anno.getAnno() + " : " + anno);
							trovato = true;
						}
					}
					if(!trovato) {
						System.out.println("Anno di immatricolazione non trovato");
					}
					break;
				}
				break;
				//***** FINE RICERCA ***** 


				//***** METODO DI STAMPA ***** 
			case 3:
				System.out.println("In che modo si desidera stampare?");

				int sceltaStampa = utility.leggiIntero("1) Stampa scheda \n2) Stampa csv");

				switch(sceltaStampa) {
				case 1:
					utility.stampaScheda(auto);					
					break;
				case 2:
					utility.stampaCsv(auto);
				}
				break;
				//***** FINE METODO DI STAMPA ***** 

			default:
				System.out.println("Inserisci una scelta valida...");
			}

			res = utility.leggiStringa("Vuoi Tornare al menu? si/no");

			if(res.equalsIgnoreCase("si")) {
				flag = true;
			}
			else {
				flag = false;
			}

		}while (flag);
	}
}
