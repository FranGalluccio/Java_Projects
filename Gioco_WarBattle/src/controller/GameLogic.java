package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import entities.Alabardiere;
import entities.Alabardieri;
import entities.Arciere;
import entities.Arcieri;
import entities.Cavaliere;
import entities.Cavalieri;
import entities.Esercito;
import model.Combat;
import model.ICombat;
import view.IView;
import view.Views;

public class GameLogic {
	ICombat comb = new Combat();
	
	IView view = new Views("C:\\Users\\franc\\OneDrive\\Desktop\\Java projects\\Gioco_WarBattle\\src\\views\\template\\");

	//********************ESERCITI GIOCATORE********************
	Esercito umaniG = new Esercito("umani", 2, 3, 1, 
			new Alabardieri(100, comb.posizioneX(0), comb.posizioneY(0), 8, new Alabardiere(300, 40, 40, 30, 40)),
			new Alabardieri(100, comb.posizioneX(0), comb.posizioneY(0), 8, new Alabardiere(300, 40, 40, 30, 40)),
			new Alabardieri(100, comb.posizioneX(0), comb.posizioneY(0), 8, new Alabardiere(300, 40, 40, 30, 40)),
			new Arcieri(100, comb.posizioneX(0), comb.posizioneY(0), 8, new Arciere(300, 30, 30, 40, 40)),
			new Arcieri(100, comb.posizioneX(0), comb.posizioneY(0), 8, new Arciere(300, 30, 30, 40, 40)),
			new Cavalieri(100, comb.posizioneX(0), comb.posizioneY(0), 12, new Cavaliere(400, 50, 50, 60, 30)));

	Esercito orchiG = new Esercito("orchi", 2, 3, 1, 
			new Alabardieri(100, comb.posizioneX(0), comb.posizioneY(0), 8, new Alabardiere(300, 50, 50, 25, 30)),
			new Alabardieri(100, comb.posizioneX(0), comb.posizioneY(0), 8, new Alabardiere(300, 50, 50, 25, 30)),
			new Alabardieri(100, comb.posizioneX(0), comb.posizioneY(0), 8, new Alabardiere(300, 50, 50, 25, 30)),
			new Arcieri(100, comb.posizioneX(0), comb.posizioneY(0), 8, new Arciere(300, 30, 40, 40, 30)),
			new Arcieri(100, comb.posizioneX(0), comb.posizioneY(0), 8, new Arciere(300, 30, 40, 40, 30)),
			new Cavalieri(100, comb.posizioneX(0), comb.posizioneY(0), 12, new Cavaliere(400, 60, 60, 50, 20)));

	Esercito nonmortiG = new Esercito("nonmorti", 2, 3, 1, 
			new Alabardieri(100, comb.posizioneX(0), comb.posizioneY(0), 8, new Alabardiere(300, 50, 50, 25, 30)),
			new Alabardieri(100, comb.posizioneX(0), comb.posizioneY(0), 8, new Alabardiere(300, 50, 50, 25, 30)),
			new Alabardieri(100, comb.posizioneX(0), comb.posizioneY(0), 8, new Alabardiere(300, 50, 50, 25, 30)),
			new Arcieri(100, comb.posizioneX(0), comb.posizioneY(0), 8, new Arciere(300, 40, 30, 40, 30)),
			new Arcieri(100, comb.posizioneX(0), comb.posizioneY(0), 8, new Arciere(300, 40, 30, 40, 30)),
			new Cavalieri(100, comb.posizioneX(0), comb.posizioneY(0), 12, new Cavaliere(400, 60, 50, 60, 20)));

	Esercito elfiG = new Esercito("elfi", 2, 3, 1, 
			new Alabardieri(100, comb.posizioneX(0), comb.posizioneY(0), 8, new Alabardiere(300, 40, 40, 40, 40)),
			new Alabardieri(100, comb.posizioneX(0), comb.posizioneY(0), 8, new Alabardiere(300, 40, 40, 40, 40)),
			new Alabardieri(100, comb.posizioneX(0), comb.posizioneY(0), 8, new Alabardiere(300, 40, 40, 40, 40)),
			new Arcieri(100, comb.posizioneX(0), comb.posizioneY(0), 8, new Arciere(300, 20, 50, 40, 40)),
			new Arcieri(100, comb.posizioneX(0), comb.posizioneY(0), 8, new Arciere(300, 20, 50, 40, 40)),
			new Cavalieri(100, comb.posizioneX(0), comb.posizioneY(0), 12, new Cavaliere(400, 60, 60, 60, 30)));

	//********************ESERCITI NEMICO********************
	Esercito umaniN = new Esercito("umani", 2, 3, 1, 
			new Alabardieri(100, comb.posizioneX(0), comb.posizioneY(0), 8, new Alabardiere(300, 40, 40, 30, 40)),
			new Alabardieri(100, comb.posizioneX(0), comb.posizioneY(0), 8, new Alabardiere(300, 40, 40, 30, 40)),
			new Alabardieri(100, comb.posizioneX(0), comb.posizioneY(0), 8, new Alabardiere(300, 40, 40, 30, 40)),
			new Arcieri(100, comb.posizioneX(0), comb.posizioneY(0), 8, new Arciere(300, 30, 30, 40, 40)),
			new Arcieri(100, comb.posizioneX(0), comb.posizioneY(0), 8, new Arciere(300, 30, 30, 40, 40)),
			new Cavalieri(100, comb.posizioneX(0), comb.posizioneY(0), 12, new Cavaliere(400, 50, 50, 60, 30)));

	Esercito orchiN = new Esercito("orchi", 2, 3, 1, 
			new Alabardieri(100, comb.posizioneX(0), comb.posizioneY(0), 8, new Alabardiere(300, 50, 50, 25, 30)),
			new Alabardieri(100, comb.posizioneX(0), comb.posizioneY(0), 8, new Alabardiere(300, 50, 50, 25, 30)),
			new Alabardieri(100, comb.posizioneX(0), comb.posizioneY(0), 8, new Alabardiere(300, 50, 50, 25, 30)),
			new Arcieri(100, comb.posizioneX(0), comb.posizioneY(0), 8, new Arciere(300, 30, 40, 40, 30)),
			new Arcieri(100, comb.posizioneX(0), comb.posizioneY(0), 8, new Arciere(300, 30, 40, 40, 30)),
			new Cavalieri(100, comb.posizioneX(0), comb.posizioneY(0), 12, new Cavaliere(400, 60, 60, 50, 20)));

	Esercito nonmortiN = new Esercito("nonmorti", 2, 3, 1, 
			new Alabardieri(100, comb.posizioneX(0), comb.posizioneY(0), 8, new Alabardiere(300, 50, 50, 25, 30)),
			new Alabardieri(100, comb.posizioneX(0), comb.posizioneY(0), 8, new Alabardiere(300, 50, 50, 25, 30)),
			new Alabardieri(100, comb.posizioneX(0), comb.posizioneY(0), 8, new Alabardiere(300, 50, 50, 25, 30)),
			new Arcieri(100, comb.posizioneX(0), comb.posizioneY(0), 8, new Arciere(300, 40, 30, 40, 30)),
			new Arcieri(100, comb.posizioneX(0), comb.posizioneY(0), 8, new Arciere(300, 40, 30, 40, 30)),
			new Cavalieri(100, comb.posizioneX(0), comb.posizioneY(0), 12, new Cavaliere(400, 60, 50, 60, 20)));

	Esercito elfiN = new Esercito("elfi", 2, 3, 1, 
			new Alabardieri(100, comb.posizioneX(0), comb.posizioneY(0), 8, new Alabardiere(300, 40, 40, 40, 40)),
			new Alabardieri(100, comb.posizioneX(0), comb.posizioneY(0), 8, new Alabardiere(300, 40, 40, 40, 40)),
			new Alabardieri(100, comb.posizioneX(0), comb.posizioneY(0), 8, new Alabardiere(300, 40, 40, 40, 40)),
			new Arcieri(100, comb.posizioneX(0), comb.posizioneY(0), 8, new Arciere(300, 20, 50, 40, 40)),
			new Arcieri(100, comb.posizioneX(0), comb.posizioneY(0), 8, new Arciere(300, 20, 50, 40, 40)),
			new Cavalieri(100, comb.posizioneX(0), comb.posizioneY(0), 12, new Cavaliere(400, 60, 60, 60, 30)));
		
	

	public void runGame() {
		System.out.println(view.renderEnterGame());

		String res = "";

		String cmd = "";

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		do {

			System.out.println("Inserisci un comando");

			cmd = input.nextLine();

			switch(cmd) {

			case "guerra":

				res = "Incomincia la battaglia";

				break;

			case "esci":

				res = "Arrivederci";

				break;

			default:

				res = "Comando errato, Inserisci guerra per giocare o esci per uscire";

			}

			System.out.println(res);

			Esercito giocatore = null;
			
			Esercito nemico = null;


					System.out.println("Scegli un esercito: ");

			cmd = input.nextLine();

			switch(cmd) {

			case "umani":

				giocatore = umaniG;

				res = "Hai scelto gli umani";

				break;

			case "orchi":

				giocatore = orchiG;

				res = "Hai scelto gli orchi";

				break;
				
			case "nonmorti":

				giocatore = nonmortiG;

				res = "Hai scelto i nonmorti";

				break;
				
			case "elfi":

				giocatore = elfiG;

				res = "Hai scelto gli elfi";;

				break;
				
				default:
					
					res = "Comando errato, scegli fra: umani, orchi, nonmorti o elfi";

			}
			
			System.out.println(res);
			
			Random dice = new Random();
			
			int numEs = dice.nextInt(4)+1;

			
			switch(numEs) {
			
			case 1:

				nemico = umaniN;

				res = "Il nemico ha scelto gli umani";

				break;

			case 2:

				nemico = orchiN;

				res = "Il nemico ha scelto gli orchi";

				break;
				
			case 3:

				nemico = nonmortiN;

				res = "Il nemico ha scelto i nonmorti";

				break;
				
			case 4:

				nemico = elfiN;

				res = "Il nemico ha scelto gli elfi";;

				break;
			
			}
			
			System.out.println(res);
			
			System.out.println(view.renderArena(giocatore, nemico));
			
			Cavalieri giocatoreCav = giocatore.getCv();
			
			Cavalieri nemicoCav = nemico.getCv();
			
			List<Arcieri> giocatoreArc = new ArrayList<Arcieri>();
			
			giocatoreArc.add(giocatore.getAc1());
			
			giocatoreArc.add(giocatore.getAc2());
			
			List<Arcieri> nemicoArc = new ArrayList<Arcieri>();
			
			nemicoArc.add(nemico.getAc1());
			
			nemicoArc.add(nemico.getAc2());
			
			List<Alabardieri> giocatoreAlb = new ArrayList<Alabardieri>();
			
			giocatoreAlb.add(giocatore.getAl());
			
			giocatoreAlb.add(giocatore.getA2());
			
			giocatoreAlb.add(giocatore.getA3());
			
			List<Alabardieri> nemicoAlb = new ArrayList<Alabardieri>();
			
			nemicoAlb.add(nemico.getAl());
			
			nemicoAlb.add(nemico.getA2());
			
			nemicoAlb.add(nemico.getA3());			
			
			
		
		}while(!cmd.equalsIgnoreCase("esci"));

	}
}
