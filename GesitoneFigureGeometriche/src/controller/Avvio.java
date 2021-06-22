package controller;

import model.Cerchio;
import model.FiguraGeometrica;
import model.Quadrato;
import model.Rettangolo;
import model.Triangolo;
import view.Viste;

public class Avvio {

	public static void main(String[] args) {


		Viste v = new Viste();
		FiguraGeometrica[] f = null;
		boolean exit = true;
		int i = 0;

		int quantita = v.leggiIntero("Quante figure vuoi inserire?");
		f = new FiguraGeometrica[quantita];
		do {
			v.menuPrincipale();
			int scelta = v.leggiIntero("Scegli...");
			switch (scelta) {
			case 1: 
				if(i == f.length) {
					System.out.println("Limite di inserimento raggiunto...");
				} else {
					v.menuTipoFiguraGeometrica();
					int figuraScelta = v.leggiIntero("Scegli una figura");
					switch(figuraScelta) {	
					case 1:
						f[i] = new Cerchio();
						v.inserimentoFiguraGeometrica(f[i]);
						i++;
						break;
					case 2:
						f[i] = new Quadrato();
						v.inserimentoFiguraGeometrica(f[i]);
						i++;
						break;
					case 3:
						f[i] = new Rettangolo();
						v.inserimentoFiguraGeometrica(f[i]);
						i++;
						break;
					case 4:
						f[i] = new Triangolo();
						v.inserimentoFiguraGeometrica(f[i]);
						i++;
						break;
					default:
						System.out.println("scelta non valida");
					}
				}
				break;
			case 2:
				if(f != null) {
					for (i = 0; i < f.length; i++) {
						if(f[i] != null) {
							v.stampaInformazioni(f[i]);
						}
					}
				}
				break;
			case 3:
				exit = false;
				System.out.println("Programma Terminato");
				break;
			default:
				System.out.println("scelta non valida");
			}
		}while(exit);
	}

}
