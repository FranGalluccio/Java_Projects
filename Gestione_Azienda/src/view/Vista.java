package view;

import java.util.Scanner;

import model.Dipendente;
import model.Dirigente;
import model.Manager;
import model.Persona;

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

	public void inserimento(Dipendente dipendente) {
		if(dipendente != null) {
			if(dipendente instanceof Dirigente) {
				setDipendente(dipendente);
				((Dirigente)dipendente).setLivelloFunzionale(leggiStringa("Inserisci livello Funzionale: "));
				((Dirigente)dipendente).setAreaDiResponsabilita(leggiStringa("Inserisci Area di ResposabilitÓ: "));

			}else if(dipendente instanceof Manager){
				setDipendente(dipendente);
				((Manager)dipendente).setAreaDiResponsabilita(leggiStringa("Inserisci Area di ResposabilitÓ: "));
			}
			else {
				setDipendente(dipendente);
			}
		}
	}

	public void setDipendente(Dipendente dipendente) {
		dipendente.setNome(leggiStringa("Inserisci Nome: "));
		dipendente.setCognome(leggiStringa("Inserisci Cognome: "));
		dipendente.setLuogoDiNascita(leggiStringa("Inserisci Luogo Di Nascita: "));
		dipendente.setDataDiNascita(leggiStringa("Inserisci Data Di Nascita: "));
		dipendente.setCodiceFIscale(leggiStringa("Inserisci Codice Fiscale: "));
		dipendente.setSesso(leggiStringa("Inserisci Sesso: "));
		dipendente.setStipendio(leggiDouble("Inserisci Stipendio: "));
		dipendente.setRuoloAziendale(leggiStringa("Inserisci Ruolo Aziendale:"));
	}

	public void modificaDipendente(Dipendente dipendente) {
		String s;
		s = leggiStringa("Nome [" + dipendente.getNome() + "]: ");
		if(s != "") {
			dipendente.setNome(s);
		}
		s = leggiStringa("Cognome [" + dipendente.getCognome() + "]: ");
		if(s != "") {
			dipendente.setCognome(s);
		}
		s = leggiStringa("Luogo di Nascita [" + dipendente.getLuogoDiNascita() + "]: ");
		if(s != "") {
			dipendente.setLuogoDiNascita(s);
		}
		s = leggiStringa("Data di Nascita [" + dipendente.getDataDiNascita() + "]: ");
		if(s != "") {
			dipendente.setDataDiNascita(s);
		}
		s = leggiStringa("Codice Fiscale [" + dipendente.getCodiceFIscale() + "]: ");
		if(s != "") {
			dipendente.setCodiceFIscale(s);
		}
		s = leggiStringa("Stipendio [" + dipendente.getStipendio() + "]: ");
		if(s != "") {
			dipendente.setStipendio(Double.parseDouble(s));
		}
		s = leggiStringa("Ruolo Aziendale [" + dipendente.getRuoloAziendale() + "]: ");
		if(s != "") {
			dipendente.setRuoloAziendale(s);
		}
	}

	public void modifica(Dipendente dipendente) {
		String s;
		if(dipendente instanceof Dirigente) {
			modificaDipendente(dipendente);
			s = leggiStringa("Area di Responsabilita [" + ((Dirigente)dipendente).getAreaDiResponsabilita() + "]: ");
			if(s != "") {
				((Dirigente)dipendente).setAreaDiResponsabilita(s);
			}
			s = leggiStringa("Livello funzionale [" + ((Dirigente)dipendente).getLivelloFunzionale() + "]: ");
			if(s != "") {
				((Dirigente)dipendente).setLivelloFunzionale(s);
			}
		}
		else if (dipendente instanceof Manager) {
			modificaDipendente(dipendente);
			s = leggiStringa("Livello funzionale [" + ((Manager)dipendente).getAreaDiResponsabilita() + "]: ");
			if(s != "") {
				((Manager)dipendente).setAreaDiResponsabilita(s);
			}
		}
		else {
			modificaDipendente(dipendente);
		}
	}

	public void stampaCsvDipendente(Dipendente persona) {
		System.out.println("\nNome = " + persona.getNome() + 
				" Cognome = " + persona.getCognome() + 
				" Luogo di Nascita = " + persona.getDataDiNascita() + 
				" Data di nascita = " + persona.getLuogoDiNascita() + 
				" Codice Fiscale = " + persona.getCodiceFIscale() + 
				" Sesso = " + persona.getSesso() + 
				" Stipendio = " + persona.getStipendio() + 
				" Ruolo aziendale = " + persona.getRuoloAziendale());
	}

	public void stampaCsv(Dipendente persona) {
		if(persona instanceof Dirigente) {
			stampaCsvDipendente(persona);
			System.out.println(((Dirigente)persona).getLivelloFunzionale());
			System.out.println(((Dirigente)persona).getAreaDiResponsabilita());

		}
		else if(persona instanceof Manager) {
			stampaCsvDipendente(persona);
			System.out.println(((Manager)persona).getAreaDiResponsabilita());
		}else {
			stampaCsvDipendente(persona);
		}
	}

	public void chiSono(Dipendente persona) {
		if(persona instanceof Dirigente) {
			System.out.print("Dirigente: ");
		}
		else if(persona instanceof Dirigente) {
			System.out.print("Manager: ");
		}
		else {
			System.out.print("Dipendente: ");
		}
	}


}

