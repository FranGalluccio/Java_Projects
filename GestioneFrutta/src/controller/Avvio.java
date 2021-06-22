package controller;

import java.util.Arrays;

import model.Frutta;
import view.Views;

public class Avvio {

	public static void main(String[] args) {
		//		Frutta banane = new Frutta(1, "Banane", "Gialla", "Dolce", "Tutto l'anno", 1.20);
		//		Frutta fragole = new Frutta(2, "Fragole", "Rossa", "Dolce", "Primavera", 1.00);
		//		Frutta mele = new Frutta(3, "Mele", "Verde/Rossa", "Dolce", "Tutto l'anno", 1.50);
		//		Frutta kiwi = new Frutta(4, "Fragole", "Marrone", "Aspro", "Autunno", 2.00);
		//		Frutta uva = new Frutta(5, "Uva", "Gialle", "Rossa/Bianca", "Autunno", 1.80);

		Views view = new Views();

		int quantita = view.leggiIntero("Quanta frutta vuoi inserire?");

		Frutta[] frutta = new Frutta[quantita];

		String res;

		do {
			int scelta = view.leggiIntero("1) Inserisci frutta \n2) Metodo di stampa \n3) Ricerca per ID");
			switch (scelta) {
			case 1:
				view.inserimento(frutta, quantita);
				break;
				
			case 2:
				String resStampa = view.leggiStringa("In che formato vuoi stampare? csv/scheda.\nPremi un tasto qualsiasi per continuare...");
				// Stampa in formato csv
				switch (resStampa) {
				case "csv":
					view.stampaFruttaCsv(frutta);
					break;
					// Stampa in formato scheda
				case "scheda":
					view.stampaFruttaScheda(frutta);		
					break;
				}
				break;

			case 3:
				String ricercaId = view.leggiStringa("Inserisci l'id del frutto: ");
				for (Frutta idFrutta : frutta) {
					
					if (Arrays.toString(frutta).contains(ricercaId)){
						System.out.println(idFrutta);
						break;
					}					
					else {
						System.out.println("Frutto non trovato nell'elenco");
						break;
					}
				}
				break;

			default:
			}
			
			res = view.leggiStringa("Vuoi tornare al Menu? si/no");

			if(res.equalsIgnoreCase("si"))
				continue;
			else {
				break;
			}

		}while(res.equalsIgnoreCase("si"));

	}
}
