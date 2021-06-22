package view;

import java.util.Scanner;

import model.Dipendente;

public class Vista {


	Dipendente dipendente = new Dipendente();
	Scanner input = new Scanner(System.in);

	public String leggiStringa(String stringa) {
		System.out.println(stringa);
		return input.nextLine();
	}

	public int leggiIntero(String stringa) {
		boolean flagInt;
		int leggiIntero = 0;
		do {
			flagInt = false;
			try {
				System.out.println(stringa);
				leggiIntero = Integer.parseInt(input.nextLine());
			}catch(NumberFormatException e) {
				System.out.println("Inserire un valore numerico");
				flagInt = true;
			}
		}while(flagInt);
		return leggiIntero;
	}

		public double leggiDouble(String stringa) {
			boolean flagDouble;
			double leggiDouble = 0;
			do {
				flagDouble = false;
				try {
					System.out.println(stringa);
					leggiDouble = Double.parseDouble(input.nextLine());
				}catch(NumberFormatException e) {
					System.out.println("Inserire un valore numerico");
					flagDouble = true;
				}
			}while(flagDouble);
			return leggiDouble;
		}

		public void addDipendente(Dipendente dipendente) {

			dipendente.setNome(leggiStringa("Inserisci nome: "));
			dipendente.setCognome(leggiStringa("Inserisci cognome: "));
			dipendente.setEta(leggiIntero("Inserisci eta: "));
			dipendente.setSesso(leggiStringa("Inserisci sesso: "));
			dipendente.setCodiceFiscale(leggiStringa("Inserisci codice fiscale: "));
			dipendente.setStipendio(leggiDouble("Inserisci stipendio: "));
		}

		public void stampaScheda(Dipendente[] dipendente) {
			for (int i = 0; i < dipendente.length; i++) {
				if(dipendente[i] != null) {
					System.out.println("nome = " + dipendente[i].getNome() + "\ncognome = "+ dipendente[i].getCognome() + 
							"\neta = " + dipendente[i].getEta() + "\ncodice fiscale = " + dipendente[i].getCodiceFiscale() + 
							"\nsesso = " + dipendente[i].getSesso() + "\nstipendio = " + dipendente[i].getStipendio());
				}
			}

		} 
		public void modifica(Dipendente dipendente) {
			String s;
			s = leggiStringa("Nome [" + dipendente.getNome() + "]: ");
			if(s != "") {
				dipendente.setNome(s);
			}
			s = leggiStringa("Cognome [" + dipendente.getCognome() + "]: ");
			if(s != "") {
				dipendente.setCognome(s);
			}
			s = leggiStringa("Eta [" + dipendente.getEta() + "]: ");
			if(s != "") {
				dipendente.setEta(Integer.parseInt(s));
			}
			s = leggiStringa("Sesso [" + dipendente.getSesso() + "]: ");
			if(s != "") {
				dipendente.setSesso(s);
			}
			s = leggiStringa("Codice Fiscale [" + dipendente.getCodiceFiscale() + "]: ");
			if(s != "") {
				dipendente.setCodiceFiscale(s);
			}
			s = leggiStringa("Stipendio [" + dipendente.getStipendio() + "]: ");
			if(s != "") {
				dipendente.setStipendio(Double.parseDouble(s));
			}
		}
	}
