package view;

import java.util.Scanner;

public class Vista {
	ViaLattea v = new ViaLattea();
	Scanner input = new Scanner(System.in);
	public String leggiString(String stringa) {
		System.out.println(stringa);
		return input.nextLine();
	}
	
	public void inserimento(ViaLattea pianeta) {
		
	}

}
