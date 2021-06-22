package view;

import java.util.Scanner;

import model.Frutta;

public class Views {
	Frutta frutta = new Frutta();
	
	Scanner input = new Scanner(System.in);
	
	public String leggiStringa(String stringa) {
		System.out.println(stringa);
		return input.nextLine();
	}
	
	public int leggiIntero(String stringa) {
		System.out.println(stringa);
		return Integer.parseInt(input.nextLine());
	}
	
	public double leggiDouble(String stringa) {
		System.out.println(stringa);
		return Double.parseDouble(input.nextLine());
	}
	
	public Frutta[] inserimento(Frutta[] frutta, int quantita) {
		
		System.out.println();

		String res;
		
		int counter = 0;
		//int id, String tipofrutta, String colore, String sapore, String stagione, double prezzo

		do {
			frutta[counter] = new Frutta();

			frutta[counter].setId(leggiIntero("Inserisci id: "));

			frutta[counter].setTipofrutta(leggiStringa("Inserisci Tipo: "));

			frutta[counter].setColore(leggiStringa("Inserisci Colore: "));

			frutta[counter].setSapore(leggiStringa("Inserisci Sapore: "));

			frutta[counter].setStagione(leggiStringa("Inserisci Stagione: "));

			frutta[counter].setPrezzo(leggiDouble("Inserisci Prezzo: "));
			
			res = leggiStringa("Inserisci: Si per continuare / No per saltare");

			if(res.equalsIgnoreCase("si"))
				counter++;
			else {
				break;
			}
		}while(res.equalsIgnoreCase("si") && counter < quantita);

		return frutta;
	}
	
	public void stampaFruttaCsv(Frutta[] frutta) {
		
		for (int i = 0; i < frutta.length; i++) {
			if (frutta != null) {
				System.out.println(frutta.toString());
			}
		}
		
	}

	public void stampaFruttaScheda(Frutta[] frutta) {
		
		for (int i = 0; i < frutta.length; i++) {
			
			if(frutta[i] != null) {
			System.out.println("Frutta " + (i+1) + ": " +  " Id: " + frutta[i].getId() + " Tipo: " + frutta[i].getTipofrutta() + 
					" Colore: " + frutta[i].getColore() + " Sapore: " + frutta[i].getSapore() + 
					" Stagione: " + frutta[i].getStagione() +
					" Codice Prezzo: " + frutta[i].getPrezzo());
			}
		}
	}
}
