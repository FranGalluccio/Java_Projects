package view;

import java.util.Scanner;

import model.Cucina;

public class Vista {

	Cucina cucina = new Cucina();
	Scanner input = new Scanner(System.in);

	public String leggiStringa(String stringa) {
		System.out.println(stringa);
		return input.nextLine();
	}

	public int leggiIntero(String stringa) {
		System.out.println(stringa);
		return Integer.parseInt(input.nextLine());
	}

	public void addMenu(Cucina cucina) {

		try {
			cucina.setId(leggiIntero("Inserisci id: "));
		} catch (NumberFormatException e) {
			System.out.println("Inserisci un numero intero");
		}
		cucina.setAntipasti(leggiStringa("Scegli Antipasto: "));
		cucina.setPrimoPiatto(leggiStringa("Scegli Il Primo: "));
		cucina.setSecondoPiatto(leggiStringa("Scegli Il Secondo: "));
		cucina.setBibita(leggiStringa("Scegli Bibita: "));
		cucina.setDolce(leggiStringa("Scegli Dolce: "));
		cucina.setDigestivo(leggiStringa("Scegli Digestivo: "));
	}

	public void stampaScheda(Cucina[] cucina) {
		for (int i = 0; i < cucina.length; i++) {
			if(cucina[i] != null) {
				System.out.println("ID = " + cucina[i].getId() + "\nAntipasto = "+ cucina[i].getAntipasti() + "\nPrimo = " + 
						cucina[i].getPrimoPiatto() + "\nSecondo = " + cucina[i].getSecondoPiatto() + "\nBibita = " + cucina[i].getBibita() 
						+ "\nDolce = " + cucina[i].getDolce() + "\nDigestivo = " + cucina[i].getDigestivo() + "\nConto = " + cucina[i].getConto());
			}
		}

	} 
	
	public void modifica(Cucina cucina) {
		String s;
		s = leggiStringa("Antipasto [" + cucina.getAntipasti() + "]: ");
		if(s != "") {
			cucina.setAntipasti(s);
		}
		s = leggiStringa("Primo piatto [" + cucina.getPrimoPiatto() + "]: ");
		if(s != "") {
			cucina.setPrimoPiatto(s);
		}
		s = leggiStringa("Secondo piatto [" + cucina.getSecondoPiatto() + "]: ");
		if(s != "") {
			cucina.setSecondoPiatto(s);
		}
		s = leggiStringa("Bibita [" + cucina.getBibita() + "]: ");
		if(s != "") {
			cucina.setBibita(s);
		}
		s = leggiStringa("Dolce [" + cucina.getDolce() + "]: ");
		if(s != "") {
			cucina.setDolce(s);
		}
		s = leggiStringa("Digestivo [" + cucina.getDigestivo() + "]: ");
		if(s != "") {
			cucina.setDigestivo(s);
		}
		s = leggiStringa("Conto [" + cucina.getConto() + "]: ");
		if(s != "") {
			cucina.setConto(Integer.parseInt(s));
		}
	}

}
