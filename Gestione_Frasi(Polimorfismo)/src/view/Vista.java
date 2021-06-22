package view;

import java.util.Scanner;

import model.Colonnello;
import model.Maresciallo;
import model.Militare;

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

	public void insetrimentoMilitare(Militare mil) {
		mil.setNome(leggiStringa("Inserisci nome: "));
		mil.setCognome(leggiStringa("Inserisci cognome: "));
		mil.setLuogoDiNascita(leggiStringa("Inserisci luogo di nascita: "));
		mil.setPlotone(leggiStringa("Inserisci il plotone di appartenenza"));
	}

	public void inserimento(Militare mil) {
		if(mil != null) {
			if(mil instanceof Colonnello) {
				insetrimentoMilitare(mil);
				((Colonnello) mil).setPlotoneSottoCOmando(leggiStringa("Inserisci il plotone sotto comando"));
				((Colonnello) mil).setReggimentoSottoComando(leggiStringa("Inserisci il reggimento sotto comando: "));

			}else if(mil instanceof Maresciallo){
				insetrimentoMilitare(mil);
				((Maresciallo) mil).setPlotoneSottoCOmando(leggiStringa("Inserisci il plotone sotto comando"));
			}
			else {
				insetrimentoMilitare(mil);
			}
		}
	}

	public void modificaMilitare(Militare mil) {
		String s;
		s = leggiStringa("Nome [" + mil.getNome() + "]: ");
		if(s != "") {
			mil.setNome(s);
		}
		s = leggiStringa("Cognome [" + mil.getCognome() + "]: ");
		if(s != "") {
			mil.setCognome(s);
		}
		s = leggiStringa("Luogo di Nascita [" + mil.getLuogoDiNascita() + "]: ");
		if(s != "") {
			mil.setLuogoDiNascita(s);
		}
		s = leggiStringa("Plotone [" + mil.getPlotone() + "]: ");
		if(s != "") {
			mil.setPlotone(s);
		}
	}

	public void modifica(Militare mil) {
		String s;
		if(mil instanceof Colonnello) {
			modificaMilitare(mil);
			s = leggiStringa("Reggimento sotto comando [" + ((Colonnello)mil).getReggimentoSottoComando() + "]: ");
			if(s != "") {
				((Colonnello)mil).setReggimentoSottoComando(s);
			}
		}
		else if (mil instanceof Maresciallo) {
			modificaMilitare(mil);
			s = leggiStringa("Plotone sotto comando [" + ((Maresciallo)mil).getPlotoneSottoCOmando() + "]: ");
			if(s != "") {
				((Maresciallo)mil).setPlotoneSottoCOmando(s);
			}
		}
		else {
			modificaMilitare(mil);
		}
	}

	public void stampaCsvMilitare(Militare mil) {
		System.out.println("\nNome = " + mil.getNome() + 
				" Cognome = " + mil.getCognome() + 
				" Luogo di Nascita = " + mil.getLuogoDiNascita() + 
				" Plotone = " + mil.getPlotone());
	}

	public void stampaCsv(Militare mil) {
		if(mil instanceof Colonnello) {
			stampaCsvMilitare(mil);
			System.out.println(((Colonnello)mil).getPlotoneSottoCOmando());
			System.out.println(((Colonnello)mil).getReggimentoSottoComando());

		}
		else if(mil instanceof Maresciallo) {
			stampaCsvMilitare(mil);
			System.out.println(((Maresciallo)mil).getPlotoneSottoCOmando());
		}else {
			stampaCsvMilitare(mil);
		}
	}

	public void chiSono(Militare mil) {
		if(mil instanceof Colonnello) {
			System.out.print("Colonnello: ");
		}
		else if(mil instanceof Maresciallo) {
			System.out.print("Maresciallo: ");
		}
		else {
			System.out.print("Militare: ");
		}
	}

	public Militare duplica(Militare mil) {
		Militare mili = null;
		if(mil != null) {
			if(mil instanceof Colonnello) {
				mili = new Colonnello(mil.getNome(),mil.getCognome(), mil.getLuogoDiNascita(), 
						mil.getPlotone(), ((Colonnello) mil).getPlotoneSottoCOmando(), ((Colonnello) mil).getReggimentoSottoComando());
			}
			else if(mil instanceof Maresciallo) {
				mili = new Maresciallo(mil.getNome(),mil.getCognome(), mil.getLuogoDiNascita(), 
						mil.getPlotone(), ((Maresciallo) mil).getPlotoneSottoCOmando());
			}
			else {
				mili = new Militare(mil.getNome(),mil.getCognome(), mil.getLuogoDiNascita(), 
						mil.getPlotone());
			}
		}
		return mili;
	}
	
	
}
