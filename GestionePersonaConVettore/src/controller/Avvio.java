package controller;

import java.util.Arrays;
import java.util.Scanner;

import model.Persona;
import view.View;

public class Avvio {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		View u = new View();

		String res;
		System.out.println("********* INSERIMENTO DATI UTENTE *********");
		// Determina la grandezza dell'array "Persona"
		System.out.println("Quante persone vuoi inserire?");
		int grandezza = Integer.parseInt(input.nextLine());
		
		Persona[] persona = new Persona[grandezza];

		do {
			System.out.println("*** Menu *** \n");
			int scelta = u.leggiIntero("1) Compila i campi \n2) Metodo di stampa \n3) Ricerca utente per Codice Fiscale");
			switch (scelta) {

			case 1: 
				//************** RIEMPIMENTO DEL'ARRAY "PERSONA" CON DATI UTENTI **************
				u.inserimentoArray(persona, grandezza);
				break;

			case 2:
				//************** SCELTA DEL METODO DI STAMPA **************
				String resStampa = u.leggiStringa("In che formato vuoi stampare? csv/scheda.\nPremi un tasto qualsiasi per continuare...");
				// Stampa in formato csv
				switch (resStampa) {
				case "csv":
					u.stampaCsv(persona);
					break;
					// Stampa in formato scheda
				case "scheda":
					u.stampaScheda(persona);		
					break;
				}
				break;

			case 3:
				//************** RICERCA IN BASE AL CODICE FISCALE **************
				// Inserimento del codice fiscale da ricercare
				String resCercaCF = u.leggiStringa("Inserisci il codice fiscale da ricercare: ");
				for (Persona datiUtente : persona) {
					
					if (Arrays.toString(persona).contains(resCercaCF)){
						System.out.println(datiUtente);
						break;
					}					
					else {
						System.out.println("Persona non trovata nell'elenco");
						break;
					}
				}
				break;
			}				
			// Scegli se continuare o terminare il programma
			res = u.leggiStringa("Vuoi tornare al Menu? si/no");

			if(res.equalsIgnoreCase("si"))
				continue;
			else {
				break;
			}

		}while(res.equalsIgnoreCase("si"));
		
		System.out.println("\nProgramma Terminato.");

	} 
}
