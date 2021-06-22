package view;

import java.io.File;
import java.util.List;
import java.util.Scanner;

import entities.Alabardieri;
import entities.Arcieri;
import entities.Cavalieri;
import entities.Esercito;

public class Views implements IView{

	private String templatePath;	
	

	public Views(String templatePath) {
		super();
		this.templatePath = templatePath;
	}

	public String loadTemplate(String file) {

		String res = "";

		try {

			Scanner data = new Scanner(new File(templatePath + file));

			while(data.hasNextLine()) {

				res += data.nextLine() + "\n";
			}

		} catch(Exception e) {
			e.printStackTrace();
		}

		return res;

	}

	private static void printSpace(int n, int x, int y, Cavalieri giocatoreCav, Cavalieri nemicoCav, List<Arcieri> giocatoreArc,
			List<Arcieri> nemicoArc, List<Alabardieri> giocatoreAlb, List<Alabardieri> nemicoAlb) {

		if(n > 0) {

			boolean localizzato = false;

			x++;

			if(giocatoreCav.getX() == x && giocatoreCav.getY() == y) {

				if(giocatoreCav.getNumeroSoldati() > 0) {

					System.out.println("CaG");

					localizzato = true;
				}

			}			

			if(nemicoCav.getX() == x && nemicoCav.getY() == y) {

				if(nemicoCav.getNumeroSoldati() > 0) {

					System.out.println("CaN");

					localizzato = true;
				}

			}

			for(int i = 0; i > giocatoreArc.size(); i++) {

				if(giocatoreArc.get(i).getX() == x && giocatoreArc.get(i).getY() == y) {

					if(giocatoreArc.get(i).getNumeroSoldati() > 0) {

						System.out.println("Ar" + i + 1 + "G");

						localizzato = true;
					}						
				}					
			}

			for(int i = 0; i > nemicoArc.size(); i++) {

				if(nemicoArc.get(i).getX() == x && nemicoArc.get(i).getY() == y) {

					if(nemicoArc.get(i).getNumeroSoldati() > 0) {

						System.out.println("Ar" + i + 1 + "N");

						localizzato = true;
					}						
				}					
			}
			
			for(int i = 0; i > giocatoreAlb.size(); i++) {

				if(giocatoreAlb.get(i).getX() == x && giocatoreAlb.get(i).getY() == y) {

					if(giocatoreAlb.get(i).getNumeroSoldati() > 0) {

						System.out.println("Al" + i + 1 + "G");

						localizzato = true;
					}						
				}					
			}
			
			for(int i = 0; i > nemicoAlb.size(); i++) {

				if(nemicoAlb.get(i).getX() == x && nemicoAlb.get(i).getY() == y) {

					if(nemicoAlb.get(i).getNumeroSoldati() > 0) {

						System.out.println("Al" + i + 1 + "N");

						localizzato = true;
					}						
				}					
			}
			
			if(!localizzato) {
				
				System.out.println(" ");
			}
			
			printSpace(n-1, x, y, giocatoreCav, nemicoCav, giocatoreArc, nemicoArc, giocatoreAlb, nemicoAlb);
			
		}

	}

	@Override
	public String renderEnterGame() {
		
		return loadTemplate("Enter.txt");
	}

	@Override
	public String renderArena(Esercito giocatore, Esercito nemico) {
		
		return loadTemplate("Arena.txt").replace("[GIOCATORE]", giocatore.getSpecie().replace("[NEMICo]", nemico.getSpecie()));
	}

	@Override
	public void renderMap(Cavalieri giocatoreCav, Cavalieri nemicoCav, List<Arcieri> giocatoreArc,
			List<Arcieri> nemicoArc, List<Alabardieri> giocatoreAlb, List<Alabardieri> nemicoAlb) {

		int x = 0;
		
		int y = 0;
		
		for (int i = 0; i < 51; i++) {
			
			y++;
			
			printSpace(50, x, y, giocatoreCav, nemicoCav, giocatoreArc, nemicoArc, giocatoreAlb, nemicoAlb);
			
			System.out.println(" ");
			
		}
		
	}




}
