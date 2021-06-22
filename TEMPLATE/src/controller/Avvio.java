package controller;

import view.Vista;

public class Avvio {

	public static void main(String[] args) {
		
		Vista vista = new Vista();
		String res;
		boolean flag = false;

		do {
			int scelta = vista.leggiIntero("");
			switch (scelta) {
			case 1:
				break;
			case 2:
				break;

			case 3:
				break;
			}
			res = vista.leggiStringa("Vuoi Tornare al menu principale? si/no");

			if(res.equalsIgnoreCase("si")) {
				flag = true;
			}
			else {
				flag = false;
			}
		}while (flag);
	}
}
