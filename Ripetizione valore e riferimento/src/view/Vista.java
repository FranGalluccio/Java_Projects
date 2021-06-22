package view;

import java.util.Scanner;

import model.Computer;

public class Vista {
	
	Computer computer = new Computer();
	Scanner input = new Scanner(System.in);
	
	public void passaggioPerValore(Computer computer) {
		computer.setRam(Integer.parseInt(input.nextLine()));
	}
	
	public static void stampa() {
		System.out.println("Sono il metodo statico");
	}
}
