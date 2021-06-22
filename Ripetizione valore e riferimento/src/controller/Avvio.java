package controller;

import model.Computer;
import view.Vista;

public class Avvio {

	public static void main(String[] args) {
		
		Vista v = new Vista();
		Computer computer = new Computer("Nvidia", 8, "8core",2000);
		System.out.println("La ram del computer è:"+computer.getRam() + "GB");
		System.out.println("Modifica la ram del computer");
		v.passaggioPerValore(computer);
		System.out.println("Ecco il tuo nuovo computer:"+ computer);
		Vista.stampa();
	}
}
