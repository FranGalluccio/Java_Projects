package view;

import java.util.Scanner;

import model.Cerchio;
import model.FiguraGeometrica;
import model.Quadrato;
import model.Rettangolo;
import model.Triangolo;

public class Viste implements IViste{

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

	public void menuPrincipale() {
		System.out.println("*** CALCOLA AREA E PERIMETRO ***");
		System.out.println("1) Inserisci una figura geometrica");
		System.out.println("2) Stampa");
		System.out.println("3) Exit");
	}

	public void menuTipoFiguraGeometrica() {
		System.out.println("1) Cerchio");
		System.out.println("2) Quadrato");
		System.out.println("3) Rettangolo");
		System.out.println("4) Triangolo");
	}

	public void inserimentoFiguraGeometrica(FiguraGeometrica f) {
		if(f != null) {
			if(f instanceof Cerchio) {
				((Cerchio) f).setRaggio(leggiDouble("Inserisici il raggio"));
			}
			else if(f instanceof Quadrato) {
				((Quadrato) f).setLato(leggiIntero("Inserisci lato"));
			}
			else if(f instanceof Rettangolo) {
				((Rettangolo) f).setLatoMaggiore(leggiIntero("Inserisci il lato maggiore"));
				((Rettangolo) f).setLatoMinore(leggiIntero("Inserisci il lato minore"));
			}
			else if(f instanceof Triangolo) {
				((Triangolo) f).setLatoA(leggiIntero("Inserisci il primo lato"));
				((Triangolo) f).setLatoA(leggiIntero("Inserisci il secondo lato"));
				((Triangolo) f).setLatoA(leggiIntero("Inserisci il terzo lato"));
			}
		}
	}

	public void stampaInformazioni(FiguraGeometrica f) {
		String[] info = f.getInfoFiguraGeometrica();
		for(int i = 0; i < info.length; i++) {
			System.out.println(info[i]);
		}
	}
}