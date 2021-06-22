package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import model.Persona;

public class Vista {

	Scanner input = new Scanner(System.in);

	public String leggiStringa(String messaggio) {
		System.out.println(messaggio);
		return input.nextLine();
	}

	public int leggiIntero(String messaggio) {
		boolean flag = true;
		int leggiInt = 0;
		do {
			flag = false;
			try {
				System.out.println(messaggio);
				leggiInt = Integer.parseInt(input.nextLine());
			} catch (Exception e) {
				System.out.println("Inserire un numero intero");
				flag = true;
			}
		} while(flag);
		return leggiInt;
	}

	public Date leggiData(String suggerimento){
		String sData=""; 
		Date data = null;
		boolean flag = true;
		do {
			flag = false;
			sData = leggiStringa(suggerimento +"(dd/MM/yyyy):"); 
			try {

				data = new SimpleDateFormat("dd/MM/yyyy").parse(sData);
			} catch (ParseException e) {
				System.out.println("Formato data non valido.");
				flag = true;
			}
		}while(flag);
		return data;
	}

	public Persona inserisci() {
		Persona p = new Persona(leggiStringa("Inserisci nome: "), leggiStringa("Inserisci cognome: "), leggiStringa("Inserisci luogo di nascita"),
				leggiStringa("Inserisci sesso"), leggiStringa("Inserisci codice fiscale"), leggiData("Inserisci data di nascita"));
		return p;
	}

	public void modifica(Persona p) {
		System.out.println("Nome [" + p.getNome()+ "]");
		p.setNome(leggiStringa("Inserisci Nome: "));

		System.out.println("Cognome [" + p.getCognome()+ "]");
		p.setCognome(leggiStringa("Inserisci Cognome: "));

		System.out.println("Luogo di Nascita [" + p.getLuogoDiNascita()+ "]");
		p.setLuogoDiNascita(leggiStringa("Inserisci Luogo di Nascita: "));

		System.out.println("Sesso [" + p.getSesso()+ "]");
		p.setSesso(leggiStringa("Inserisci Sesso: "));

		System.out.println("Codice Fiscale [" + p.getCodiceFiscale() + "]");
		p.setCodiceFiscale(leggiStringa("Inserisci Codice Fiscale: "));

		System.out.println("Data di Nascita [" + p.getDataDiNascita()+ "]");
		p.setDataDiNascita(leggiData("Inserisci Data Di Nascita: "));
	}

	public void cancella(HashMap<Integer, Persona> p) {
		p.remove(leggiIntero("Inserisci l'id della persona da rimuovere"));
	}

	public void stampaCsv(HashMap<Integer, Persona> p) {
		for (Map.Entry<Integer, Persona> persona : p.entrySet()) {
			System.out.println(persona.getKey() + " | " + persona.getValue());
		}
	}

	public void stampaScheda(HashMap<Integer, Persona> p) {
		for (Integer i : p.keySet()) {
			System.out.println("Id:"+ i + " Nome: " +p.get(i).getNome());
			System.out.println("Id:"+ i + " Cognome: " +p.get(i).getCognome());
			System.out.println("Id:"+ i + " Luogo di Nascita: " +p.get(i).getLuogoDiNascita());
			System.out.println("Id:"+ i + " Sesso: " +p.get(i).getSesso());
			System.out.println("Id:"+ i + " Codice Fiscale: " +p.get(i).getCodiceFiscale());
			System.out.println("Id:"+ i + " Data di Nascita: " +p.get(i).getDataDiNascita());
			System.out.println();
		}
	}
}
