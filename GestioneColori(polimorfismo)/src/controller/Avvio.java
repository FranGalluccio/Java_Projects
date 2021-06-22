package controller;

import view.Colori;

public class Avvio {

	public static void main(String[] args) {

		Colori colori = new Colori();

		colori.inserisciArray();

		System.out.println("Ricerca per ID");
		colori.leggiColore(colori.leggiIntero("Cerca il colore per ID"));
		
		System.out.println("Ricerca Nome Colore");
		colori.leggiColore(colori.leggiStringa("Inserisci il nome del colore"));

		System.out.println("Ricerca RGB");
		colori.leggiColore(colori.leggiIntero("Inserisci il red"), colori.leggiIntero("Inserisci il green"), colori.leggiIntero("Inserisci il blue"));
	}
}
