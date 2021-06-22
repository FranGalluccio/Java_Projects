package view;

import java.util.Scanner;

import model.Persona;

public class Utility {
	
	Persona persona = new Persona();
	
	Scanner input = new Scanner(System.in);

	public String leggiStringa(String suggerimento) {
		System.out.println(suggerimento);
		return input.nextLine();
	}
	

	public int leggiIntero(String suggerimento) {
		System.out.println(suggerimento);
		return Integer.parseInt(input.nextLine());
	}
	
	
	
	
	
}
