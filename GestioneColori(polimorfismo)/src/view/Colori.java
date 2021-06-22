package view;

import java.util.Scanner;

import model.Colore;

public class Colori{

	Scanner input = new Scanner(System.in);
	Colore[] colore = new Colore[1];

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
				System.out.println("Inserire un valore numerico inntero");
				flagInt = true;
			}
		}while(flagInt);
		return leggiIntero;
	}

	public void inserisciArray() {
		for (int i = 0; i < this.colore.length; i++) {
			this.colore[i] = new Colore(leggiIntero("Inserisci Id Colore"),leggiStringa("Inserisci Nome"),leggiIntero("Inserisci Tonalità Rosso"),
					leggiIntero("Inserisci Tonalità Verde"),leggiIntero("Inserisci Tonalità Blu"));
		}
	}

	public void leggiColore(int colore) {
		boolean trovato = false;
		if(colore != 0) {
			for (int i = 0; i < this.colore.length; i++) {
				if(this.colore[i].getId() == colore && this.colore[i].getId() != 0);
				System.out.println(this.colore[i].toString());
				trovato = true;
			}
		}
		if(!trovato) {
			System.out.println("Colore non trovato");
		}
	}

	public void leggiColore(String leggiColore) {
		boolean trovato = false;
		leggiColore = leggiStringa("Inserisci il colore da ricercare: ");
		if(this.colore != null) {
			for (int i = 0; i < this.colore.length && this.colore[i] != null; i++) {
				if(colore[i].getNomeColore().equalsIgnoreCase(leggiColore));
				System.out.println(this.colore[i].toString());
				trovato = true;
			}
		}
		if(!trovato) {
			System.out.println("Colore non trovato");
		}
	}

	public void leggiColore(int red, int green, int blue) {
		boolean trovato = false;
		if(red != 0 && green != 0 && blue != 0) {
			for (int i = 0; i < this.colore.length; i++) {
				if(this.colore[i].getRed() == red && this.colore[i].getGreen() == green && this.colore[i].getBlue() == blue);
				System.out.println(this.colore[i].toString());
				trovato = true;
			}
		}
		if(!trovato) {
			System.out.println("Colore non trovato");
		}
	}
}
