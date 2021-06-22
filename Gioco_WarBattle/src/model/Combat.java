package model;

import java.util.Random;

public class Combat implements ICombat {

	@Override
	public int posizioneX(int x) {
		
		Random dice = new Random();
		
		x+=dice.nextInt(50);
		
		return x;
	}

	@Override
	public int posizioneY(int y) {
		
		Random dice = new Random();
		
		y+=dice.nextInt(50);
		
		return y;
	}

	@Override
	public int spostamento(int movimento) {
		
		Random dice = new Random();
		
		movimento += dice.nextInt(8);
		
		return movimento;
	}

	@Override
	public boolean raggiunto(int x1, int y1, int x2, int y2, int spostamento) {
		
		boolean raggiunto = false;
		
		System.out.println("x1 :"+x1+" y1 :"+y1+" x2 :"+x2+" y2 :"+y2);
		
		int distanza = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		if(spostamento >= distanza) {
			raggiunto = true;
		}		
		return raggiunto;
	}

	@Override
	public int attacco(int attacco, int agilita, int numerosoldati) {
		
		int atk = attacco + agilita;
		
		Random dice = new Random();
		
		int numeromagico = dice.nextInt(100)+1;
		
		int attaccoTot = atk * numeromagico * numerosoldati; 
		
		return attaccoTot;
	}

	@Override
	public int difesa(int difesa, int agilita, int numerosoldati) {
		
		int def = difesa + agilita;
		
		Random dice = new Random();
		
		int numeromagico = dice.nextInt(100)+1;
		
		int difesaTot = def * numeromagico * numerosoldati; 
		
		return difesaTot;
		
	}

	@Override
	public int velocita(int velocita, int numerosoldati) {
		
		int vel = velocita;
		
		Random dice = new Random();
		
		int numeromagico = dice.nextInt(100)+1;
		
		vel *= numeromagico * numerosoldati;
		
		return vel;
	}

}
