package view;

import java.util.Scanner;

import model.Pianeta;
import model.Sistema;
import model.ViaLattea;

public class Vista {
	Scanner input = new Scanner(System.in);

	public String leggiStringa(String stringa) {
		System.out.println(stringa);
		return input.nextLine();
	}

	public boolean leggiBoolean(String stringa) {
		boolean affermativo = true;
		System.out.println(stringa);
		if(stringa.equalsIgnoreCase("si")) {
			affermativo = true;
		}
		else {
			affermativo = false;
		}
		return affermativo;
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

	public void inserimento(ViaLattea pianeta) {
		if(pianeta instanceof Pianeta) {
			pianeta.setGalassia("Inserisci la galassia: ");
			((Pianeta) pianeta).setSistema(leggiStringa("Inserisci il sistema di appartenenza"));
			((Pianeta) pianeta).setVita(leggiBoolean("Su quale pianeta desideri controllare se c'è vita??"));
		}
		else if(pianeta instanceof Sistema) {
			pianeta.setGalassia("Inserisci la galassia");
			((Sistema) pianeta).setSistema("Inserisci il sistema di appartenenza");
		}
		else {
			pianeta.setGalassia("Inserisci la galassia: ");
		}
	}
}
