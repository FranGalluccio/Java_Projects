package view;

import java.util.Scanner;

public class Vista {
	Scanner input = new Scanner(System.in);

	public String leggiStringa(String stringa) {
		System.out.println(stringa);
		return input.nextLine();
	}

	public int leggiIntero(String stringa) {
		boolean flagi;
		int intero = 0;
		do {
			flagi = false;
			try {
				System.out.println(stringa);
				intero = Integer.parseInt(input.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Inserire un valore numerico intero");
				flagi = true;
			}
		}while (flagi);
		return intero;
	} 
	
	public double leggiDouble(String stringa) {
		boolean flagd;
		double doubl = 0;
		do {
			flagd = false;
			try {
				System.out.println(stringa);
				doubl = Double.parseDouble(input.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Inserire un valore numerico intero");
				flagd = true;
			}
		}while (flagd);
		return doubl;
	} 

}
