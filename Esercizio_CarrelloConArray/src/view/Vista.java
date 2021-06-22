package view;

import java.util.Scanner;

import model.Carrello;

public class Vista {
	
	Scanner input = new Scanner(System.in);
	Carrello carrello = new Carrello();
	
	public String leggiStringa(String stringa) {
		System.out.println(stringa);
		return input.nextLine();
	}
	
	public int leggiIntero(String stringa) {
		int leggiIntero = 0;
		boolean flag = false;
		do {
		try {
			flag = false;
			System.out.println(stringa);
			leggiIntero = Integer.parseInt(input.nextLine());
		} catch (Exception e) {
			System.out.println("Inserisci un numero intero");
			flag = true;
		}
		}while(flag);
		return leggiIntero;
	}
	
	public void aggiungiAlCarrello(Carrello carrello) {
		carrello.setFrutta(leggiStringa("Aggiungi frutta: "));
		carrello.setVerdura(leggiStringa("Aggiungi verdura: "));
		carrello.setPasta(leggiStringa("Aggiungi pasta: "));
		carrello.setCarne(leggiStringa("Aggiungi carne: "));
		carrello.setBevande(leggiStringa("Aggiungi bevande: "));
	}
	
	public void modificaCarrello(Carrello carrello) {
		carrello.setFrutta(leggiStringa("Modifica frutta"));
	}
	
}
