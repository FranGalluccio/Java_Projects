package view;

import java.util.Scanner;

import model.Persona;

public class View {

	Persona persona = new Persona();

	Scanner input = new Scanner(System.in);

	public String leggiStringa(String suggerimento) {

		System.out.println(suggerimento);
		return input.nextLine();
	}

	public int leggiIntero(String suggerimento) {

		System.out.println(suggerimento);
		return Integer.parseInt(input.nextLine());
	}

	public Persona[] inserimentoArray(Persona[] persona, int quantita) {
		
		int counter = 0;

		String res;
		do {
			System.out.println("***** Inserire i dati Utente *****");

			persona[counter] = new Persona();

			persona[counter].setId(leggiIntero("Inserisci id: "));

			persona[counter].setNome(leggiStringa("Inserisci Nome: "));

			persona[counter].setCognome(leggiStringa("Inserisci Cognome: "));

			persona[counter].setLuogoDiNascita(leggiStringa("Inserisci luogo di nascita: "));

			persona[counter].setSesso(leggiStringa("Inserisci sesso: "));

			persona[counter].setCodiceFiscale(leggiStringa("Inserisci codice fiscale: "));
			// Continua o termina il ciclo
			res = leggiStringa("Inserisci: Si per continuare / No per saltare");

			if(res.equalsIgnoreCase("si"))
				counter++;
			else {
				break;
			}
		}while(res.equalsIgnoreCase("si") && counter < quantita);

		return persona;
	}

	public boolean checkByCodiceFiscale(Persona[] persona) {
		//************** RICERCA UTENTE PER CODICE FISCALE **************
		
		boolean trovato = false;

		// Inserimento del codice fiscale da ricercare
		String res = leggiStringa("Inserisci il codice fiscale da ricercare: ");
		// Ricerca del codice fiscale inserito
		int i;
		for (i = 0; i < persona.length; i++) {

			if(res.contains(persona[i].getCodiceFiscale())) {

				System.out.println("Persona trovata: " + persona[i].toString());
				trovato = true;
				break;
			}
		}
		if(i == persona.length) {
			trovato = false;
		}
		return trovato;
	}


	public void stampaScheda(Persona[] persona) {

		for (int i = 0; i < persona.length; i++) {

			if(persona[i] != null) {
				System.out.println("Persona " + (i+1) + ": " +  " Id: " + persona[i].getId() + " Nome: " + persona[i].getNome() + 
						" Cognome: " + persona[i].getCognome() + " Luogo Di Nascita: " + persona[i].getLuogoDiNascita() + 
						" Sesso: " + persona[i].getSesso() +
						" Codice Fiscale: " + persona[i].getCodiceFiscale());
			}
		}
	}

	public void stampaCsv(Persona[] persona) {
		for (int i = 0; i < persona.length; i++) {

			if(persona[i] != null) {
				System.out.println(persona[i].toString());
			}
		}
	}
}
