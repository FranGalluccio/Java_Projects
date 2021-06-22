package view;

import java.util.Scanner;

import model.Oggetto;

public class Vista {

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
	
	public void setDipendente(Oggetto persona) {
		persona.setNome(leggiStringa("Inserisci Nome: "));
		persona.setCognome(leggiStringa("Inserisci Cognome: "));
		persona.setLuogoDiNascita(leggiStringa("Inserisci Luogo Di Nascita: "));
		persona.setDataDiNascita(leggiStringa("Inserisci Data Di Nascita: "));
		persona.setCodiceFIscale(leggiStringa("Inserisci Codice Fiscale: "));
		persona.setSesso(leggiStringa("Inserisci Sesso: "));
		persona.setStipendio(leggiDouble("Inserisci Stipendio: "));
		persona.setRuoloAziendale(leggiStringa("Inserisci Ruolo Aziendale:"));
	}
	
	public void modificaPersona(Oggetto persona) {
		String s;
		s = leggiStringa("Nome [" + persona.getNome() + "]: ");
		if(s != "") {
			persona.setNome(s);
		}
		s = leggiStringa("Cognome [" + persona.getCognome() + "]: ");
		if(s != "") {
			persona.setCognome(s);
		}
		s = leggiStringa("Luogo di Nascita [" + persona.getLuogoDiNascita() + "]: ");
		if(s != "") {
			persona.setLuogoDiNascita(s);
		}
		s = leggiStringa("Data di Nascita [" + persona.getDataDiNascita() + "]: ");
		if(s != "") {
			persona.setDataDiNascita(s);
		}
		s = leggiStringa("Codice Fiscale [" + persona.getCodiceFIscale() + "]: ");
		if(s != "") {
			persona.setCodiceFIscale(s);
		}
		s = leggiStringa("Stipendio [" + persona.getStipendio() + "]: ");
		if(s != "") {
			persona.setStipendio(Double.parseDouble(s));
		}
		s = leggiStringa("Ruolo Aziendale [" + persona.getRuoloAziendale() + "]: ");
		if(s != "") {
			persona.setRuoloAziendale(s);
		}
	}
	
	public void stampaCsvPersona(Oggetto persona) {
		System.out.println("\nNome = " + persona.getNome() + 
				" Cognome = " + persona.getCognome() + 
				" Luogo di Nascita = " + persona.getDataDiNascita() + 
				" Data di nascita = " + persona.getLuogoDiNascita() + 
				" Codice Fiscale = " + persona.getCodiceFIscale() + 
				" Sesso = " + persona.getSesso() + 
				" Stipendio = " + persona.getStipendio() + 
				" Ruolo aziendale = " + persona.getRuoloAziendale());
	}

}
