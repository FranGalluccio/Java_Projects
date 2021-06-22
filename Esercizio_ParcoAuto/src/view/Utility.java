package view;

import java.util.Arrays;
import java.util.Scanner;

import model.Auto;

public class Utility {

	Auto auto = new Auto();
	Scanner input = new Scanner(System.in);

	public String leggiStringa(String stringa) {
		System.out.println(stringa);
		return input.nextLine();
	}

	public int leggiIntero(String stringa) {
		System.out.println(stringa);
		return Integer.parseInt(input.nextLine());
	}

	public void addAuto(Auto auto) {

		auto.setMarca(leggiStringa("Inserisci Marca: "));
		auto.setModello(leggiStringa("Inserisci Modello: "));
		auto.setAnno(leggiIntero("Inserisci Anno: "));
		auto.setColore(leggiStringa("Inserisci Colore: "));
		auto.setTarga(leggiStringa("Inserisci Targa: "));
	}
	
	public void stampaScheda(Auto[] auto) {
		if(auto != null) {
			for (int i = 0; i < auto.length; i++) {
				System.out.println("\nMarca = " + auto[i].getMarca() + "\nModello = " + auto[i].getModello() + "\nAnno = " + auto[i].getAnno() 
						+ "\nColore = " + auto[i].getColore() + "\nTarga = " + auto[i].getTarga());
			}
		}
	}
	
	public void stampaCsv(Auto[] auto) {
		if(auto != null) {
			System.out.println(Arrays.toString(auto));
		}
	}
}
