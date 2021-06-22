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

	public Persona setPersona(Persona persona) {
		persona.setId(leggiIntero("Inserisci Id: "));
		persona.setNome(leggiStringa("Inserisci Nome: "));
		persona.setCognome(leggiStringa("Inserisci Cognome: "));
		persona.setCodiceFiscale(leggiStringa("Inserisci Codice Fiscale: "));
		persona.setLuogoDiNascita(leggiStringa("Inserisci Luogo Di Nascita: "));
		persona.setSesso(leggiStringa("Inserisci Sesso: "));
		return persona;
	}

	public void inserimento(Persona persona) {
		if(persona != null) {
			if(persona instanceof Dirigente) {
				setPersona(persona);
				((Dirigente) persona).setAreaDiResponsabilita(leggiStringa("Inserisci Area Di ResponsabilitÓ: "));
				((Dirigente) persona).setStipendio(leggiDouble("Inserisci Stipendio"));
				((Dirigente) persona).setRuoloAziendale(leggiStringa("Inserisci Ruolo Aziendale"));
				((Dirigente)persona).setLivelloFunzionale(leggiStringa("Inserisci livello Funzionale: "));

			}else if(persona instanceof Manager){
				setPersona(persona);
				((Manager) persona).setStipendio(leggiDouble("Inserisci Stipendio"));
				((Manager) persona).setRuoloAziendale(leggiStringa("Inserisci Ruolo Aziendale"));
				((Manager)persona).setAreaDiResponsabilita(leggiStringa("Inserisci Area di ResposabilitÓ: "));
			}
			else if (persona instanceof Dipendente){
				setPersona(persona);
				((Dipendente) persona).setStipendio(leggiDouble("Inserisci Stipendio: "));
				((Dipendente) persona).setRuoloAziendale(leggiStringa("Inserisci Ruolo Aziendale"));
			}
		}
	}

	public void modificaPersona(Persona persona) {
		String s;
		int i = 0;
		i = leggiIntero("Id [" + persona.getId() + "]: ");
		if(i != 0) {
			persona.setId(i);
		}
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
		s = leggiStringa("Codice Fiscale [" + persona.getCodiceFiscale() + "]: ");
		if(s != "") {
			persona.setCodiceFiscale(s);
		}
	}

	public void modifica(Persona persona) {
		String s;
		int i = 0;
		if(persona instanceof Dirigente) {
			modificaPersona(persona);
			s = leggiStringa("Inserisci Ruolo Aziendale [" + ((Dirigente)persona).getRuoloAziendale() + "]: ");
			if(s != "") {
				((Dirigente)persona).setRuoloAziendale(s);
			}
			i = leggiIntero("Inserisci Stipendio [" + ((Dirigente)persona).getStipendio() + "]: ");
			if(i != 0) {
				((Dirigente)persona).setStipendio(i);
			}
			s = leggiStringa("Area Di ResponsabilitÓ [" + ((Dirigente)persona).getAreaDiResponsabilita() + "]: ");
			if(s != "") {
				((Dirigente)persona).setAreaDiResponsabilita(s);
			}
			s = leggiStringa("Livello funzionale [" + ((Dirigente)persona).getLivelloFunzionale() + "]: ");
			if(s != "") {
				((Dirigente)persona).setLivelloFunzionale(s);
			}
		}
		else if (persona instanceof Manager) {
			modificaPersona(persona);
			i = leggiIntero("Inserisci Stipendio [" + ((Manager)persona).getStipendio() + "]: ");
			if(i != 0) {
				((Manager)persona).setStipendio(i);
			}
			s = leggiStringa("Inserisci Ruolo Aziendale [" + ((Manager)persona).getRuoloAziendale() + "]: ");
			if(s != "") {
				((Manager)persona).setRuoloAziendale(s);
			}
			s = leggiStringa("Area Di ResponsabilitÓ [" + ((Manager)persona).getAreaDiResponsabilita() + "]: ");
			if(s != "") {
				((Manager)persona).setAreaDiResponsabilita(s);
			}
		}
		else if (persona instanceof Dipendente) {
			modificaPersona(persona);
			i = leggiIntero("Inserisci Stipendio [" + ((Dipendente)persona).getStipendio() + "]: ");
			if(i != 0) {
				((Dipendente)persona).setStipendio(i);
			}
			s = leggiStringa("Area Di ResponsabilitÓ [" + ((Dipendente)persona).getRuoloAziendale() + "]: ");
			if(s != "") {
				((Dipendente)persona).setRuoloAziendale(s);
			}

		}
	}

	public void stampaSchedaPersona(Persona persona) {
		System.out.println("\nId = " + persona.getId() + 
				" \nNome = " + persona.getNome() + 
				" \nCognome = " + persona.getCognome() + 
				" \nLuogo di nascita = " + persona.getLuogoDiNascita() + 
				" \nSesso = " + persona.getSesso() + 
				" \nCodice Fiscale = " + persona.getCodiceFiscale()); 
	}

	public void stampaScheda(Persona persona) {
		if(persona instanceof Dirigente) {
			stampaSchedaPersona(persona);
			System.out.println("Ruolo Aziendale = " + ((Dirigente) persona).getRuoloAziendale());
			System.out.println("Stipendio = " + ((Dirigente) persona).getStipendio());
			System.out.println("Area Di ResponsabilitÓ = " + ((Dirigente)persona).getAreaDiResponsabilita());
			System.out.println("Livello Funzionale = " + ((Dirigente)persona).getLivelloFunzionale());
		}
		else if(persona instanceof Manager) {
			stampaSchedaPersona(persona);
			System.out.println("Ruolo Aziendale = " + ((Manager) persona).getRuoloAziendale());
			System.out.println("Stipendio = " + ((Manager) persona).getStipendio());
			System.out.println("Area Di ResponsabilitÓ = " + ((Manager)persona).getAreaDiResponsabilita());
		}else if(persona instanceof Dipendente) {
			stampaSchedaPersona(persona);
			System.out.println("Ruolo Aziendale = " + ((Dipendente) persona).getRuoloAziendale());
			System.out.println("Stipendio = " + ((Dipendente) persona).getStipendio());
		
		}
	}

	public Persona duplica(Persona persona) {
		if(persona instanceof Dirigente) {
			Dirigente dirO = (Dirigente) persona;
			Dirigente dir = new Dirigente(dirO.getId(),dirO.getNome(), dirO.getCognome(), dirO.getLuogoDiNascita(),
					dirO.getSesso(), dirO.getCodiceFiscale(), dirO.getStipendio(), dirO.getRuoloAziendale(), dirO.getAreaDiResponsabilita(), dirO.getLivelloFunzionale());
			return dir;
		}

		else if(persona instanceof Manager) {
			Manager manO = (Manager) persona;
			Manager man = new Manager(manO.getId(), manO.getNome(), manO.getCodiceFiscale(), manO.getLuogoDiNascita(), manO.getSesso(),
					manO.getCodiceFiscale(), manO.getStipendio(), manO.getRuoloAziendale(), manO.getAreaDiResponsabilita());
			return man;
		}
		else  {
			Dipendente dipO = (Dipendente) persona;
			Dipendente dip = new Dipendente(dipO.getId(), dipO.getNome(), dipO.getCognome(), dipO.getLuogoDiNascita(), dipO.getSesso(),
					dipO.getCodiceFiscale(), dipO.getStipendio(), dipO.getRuoloAziendale());
			return dip;
		}
	}

}
