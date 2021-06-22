package controller;

import java.util.Arrays;
import java.util.Scanner;

import model.Persona;
import view.Utility;

public class Avvio {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		Utility u = new Utility();		
		String res;
		
		
		System.out.println("Quante persone vuoi inserire?");
		int grandezza = Integer.parseInt(input.nextLine());
		Persona[] persona = new Persona[grandezza];
		int counter = 1;
		
		do {
			System.out.println("***** Inserire i dati Utente *****");
			
			persona[counter].setId(u.leggiIntero("Inserisci id: "));
		
			persona[counter].setNome(u.leggiStringa("Inserisci Nome: "));
			
			persona[counter].setCognome(u.leggiStringa("Inserisci Cognome: "));
			
			persona[counter].setLuogoDiNascita(u.leggiStringa("Inserisci luogo di nascita: "));
			
			persona[counter].setSesso(u.leggiStringa("Inserisci sesso: "));
			
			persona[counter].setCodiceFiscale(u.leggiStringa("Inserisci codice fiscale: "));
			
			System.out.println(persona.toString());
			
			res = u.leggiStringa("Vuoi inserire una nuova persona? si/no");
			if(res.equalsIgnoreCase("si"))
				counter++;
			
		}while(res.equalsIgnoreCase("si") || grandezza == counter);
		
		System.out.println(Arrays.toString(persona));
	}
	
}
