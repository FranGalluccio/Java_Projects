package controller;

import model.Dipendente;
import utility.Crud;
import view.GestoreIO;

public class Avvio {

	public static void main(String[] args) {
		Dipendente d = null;

		boolean flag = true;

		String cf;

		do {

			switch(GestoreIO.getInstance().leggiIntero(GestoreIO.getInstance().menu())) {
			case 1:
				d = new Dipendente();
				GestoreIO.getInstance().mascheraInserimento(d);
				Crud.getInstance().inserisci(d);
				break;
			case 2:
				if(!(Crud.getInstance().leggi().isEmpty())) {
					cf = GestoreIO.getInstance().leggiStringa("Inserisci il codice fiscale del dipendente da modificare: ");
					if(Crud.getInstance().ricerca(cf) != null) { 
						System.out.println(Crud.getInstance().ricerca(cf));
						GestoreIO.getInstance().mascheraModifica(Crud.getInstance().leggi(Crud.getInstance().leggi().indexOf(Crud.getInstance().ricerca(cf))));
					} else {
						System.out.println("Non è stato trovato alcun dipendente con questo codice fiscale");
					} 
				} else {
					System.out.println("Nessun Dipendente prensente nel DB");
				}
				break;
			case 3:
				if(!(Crud.getInstance().leggi().isEmpty())) {
					cf = GestoreIO.getInstance().leggiStringa("Inserisci il codice fiscale del dipendente da cancellare: ");
					if(Crud.getInstance().ricerca(cf) != null) { 
						System.out.println(Crud.getInstance().ricerca(cf));
						Crud.getInstance().cancella(Crud.getInstance().leggi().indexOf(Crud.getInstance().ricerca(cf)));
					} else {
						System.out.println("Non è stato trovato alcun dipendente con questo codice fiscale");
					} 
				} else {
					System.out.println("Nessun Dipendente prensente nel DB");
				}
				break;
			case 4:
				if(!(Crud.getInstance().leggi().isEmpty())) {
					cf = GestoreIO.getInstance().leggiStringa("Inserisci il codice fiscale del Dipendente da ricercare: ");
					if(Crud.getInstance().ricerca(cf) != null) { 
						System.out.println(Crud.getInstance().ricerca(cf));
					} else {
						System.out.println("Non è stato trovato alcun Dipendente con questo codice fiscale");
					}
				} else {
					System.out.println("Nessun Dipendente prensente nel DB");
				}
				break;
			case 5:
				if(!(Crud.getInstance().leggi().isEmpty())) {
					GestoreIO.getInstance().stampaScheda(Crud.getInstance().leggi());
				} else {
					System.out.println("Nessun Dipendente prensente nel DB");
				}
				break;
			case 6:
				if(!(Crud.getInstance().leggi().isEmpty())) {
					GestoreIO.getInstance().stampaCSV(Crud.getInstance().leggi());
				} else {
					System.out.println("Nessun Dipendente prensente nel DB");
				}
				break;
			case 7:
				if(!(Crud.getInstance().leggi().isEmpty())) {
				String ruolo = GestoreIO.getInstance().leggiStringa("Ricerca Dipendenti di ruolo: ");
				GestoreIO.getInstance().stampaSchedaRuolo(Crud.getInstance().leggi(), ruolo);
				} else {
					System.out.println("Nessun Dipendente prensente nel DB");
				}
				break;
			case 8:
				flag = false;
				break;
			default:
				System.out.println("Inserire un numero compreso nel Menù");
				break;
			}

		}while(flag);
	}
}