package controller;

import model.Colonnello;
import model.Maresciallo;
import model.Militare;
import view.Vista;

public class Avvio {

	public static void main(String[] args) {

		Vista v = new Vista();
		Militare[] mil = null;
		Militare milTemp = null;
		int i = 0;
		String res;
		boolean flag = false;
		boolean trovato = false;

		do {
			int scelta = v.leggiIntero("1) Inserimento \n2) Modifica \n3) Cancella \n4) Stampa in csv \n5) Stampa scheda"
					+ "\n6) Cerca per Plotone");
			switch (scelta) {
			case 1:
				if(mil == null) {
					int quantita =v.leggiIntero("Quanti Militari vuoi inserire?");
					mil = new Militare[quantita];
				}
				if (i != mil.length) {
					int res1 = v.leggiIntero("1) Inserisci Soldato semplice \n2) Inserisci Maresciallo \n3) Inserisci Colonnello");
					switch(res1) {
					case 1:
						mil[i] = new Militare();
						v.inserimento(mil[i]);
						i++;
						break;
					case 2:
						mil[i] = new Maresciallo();
						v.inserimento(mil[i]);
						i++;
						break;
					case 3:
						mil[i] = new Colonnello();
						v.inserimento(mil[i]);
						i++;
						break;
					}
				} else {
					System.out.println("Limite di inserimento raggiunto...");
				}
				break;

			case 2:
				String res1 = v.leggiStringa("Cerca per plotone");

				if(mil != null) {
					for (i = 0; i < mil.length && mil[i] != null; i++) {
						if(res1.equalsIgnoreCase(mil[i].getPlotone())) {
							System.out.println("Militare : " + mil[i].toString());
							trovato = true;
						}
						if(trovato) {
								milTemp = v.duplica(mil[i]);
								v.modifica(milTemp);
								System.out.println(milTemp);
								res1 = v.leggiStringa("Vuoi confermare la modifica? si/no");
								if(res1.equalsIgnoreCase("si")) {
									mil[i] = milTemp;
								}
								else {
									System.out.println("Modifiche non apportate");
								}
							}
						}
						if(!trovato) {
							System.out.println("Militare non presente");
						}
				}else {
					System.out.println("Nessun Militare presente");
				}
				break;

			case 3:
				String res2 = v.leggiStringa("Cerca per plotone di appartenenza: ");

				if(mil != null) {
					for (i = 0; i < mil.length && mil[i] != null; i++) {
						if(res2.equalsIgnoreCase(mil[i].getPlotone())) {
							v.chiSono(mil[i]);
							System.out.println(mil[i].toString());
							trovato = true;
						}
						if(trovato) {
							String elimina = v.leggiStringa("Vuoi eliminare? si/no");
							if(elimina.equalsIgnoreCase("si")) {
								mil[i] = null;
								v.chiSono(mil[i]);
								System.out.println("eliminato");
							}
							break;
						}
						if(!trovato) {
							System.out.println("Militare non presente");
						}
					}
				}
				break;

			case 4:
				if(mil != null) {
					for (i = 0; i < mil.length && mil[i] != null; i++) {
						trovato = true;
						v.stampaCsv(mil[i]);
					}
				}
				if(!trovato) {
					System.out.println("Nessun Militare presente");
				}
				break;
			case 5:
				if(mil != null) {
					for (i = 0; i < mil.length && mil[i] != null; i++) {
						System.out.println(mil[i].toString());
					}
				} else {
					System.out.println("Nessun Militare presente...");
				}
				break;

			case 6:
				String res3 = v.leggiStringa("Inserisci il Plotone di appartenenza:");
				if(mil != null) {
					for (i = 0; i < mil.length && mil[i] != null; i++) {
						if(res3.equalsIgnoreCase(mil[i].getPlotone())) {
							System.out.println("Personale trovato : " + mil[i].toString());
							trovato = true;
						}
						if(!trovato) {
							System.out.println("Militare non presente");
						}
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
