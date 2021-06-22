package controller;

import model.Pianeta;
import model.Sistema;
import model.ViaLattea;
import view.Vista;

public class Avvio {

	public static void main(String[] args) {
		Vista v = new Vista();

		ViaLattea[] p = null;

		boolean exit = false;
		
		int i = 0;

		do {
			int scelta = v.leggiIntero("1) Inserisci ");
			switch(scelta) {
			case 1:
				if(p == null) {
					int quantita = v.leggiIntero("Quante operazioni vuoi fare?");
					p = new Pianeta[quantita];
				}
				if (i != p.length) {
					int res1 = v.leggiIntero("1) Inserisci Pianeta \n2) Inserisci Sistema \n3) Inserisci Galassia ");
					switch(res1) {
					case 1:
						p[i] = new Pianeta();
						v.inserimento(p[i]);
						i++;
						break;
					case 2:
						p[i] = new Sistema();
						v.inserimento(p[i]);
						i++;
						break;
					case 3:
						p[i] = new ViaLattea();
						v.inserimento(p[i]);
						i++;
					}
					} else {
						System.out.println("Limite di inserimento raggiunto...");
					}
					break;
			}		
		}while(exit);
	}

}
