package model;

public interface ICombat {
	
	public int posizioneX(int x);
	
	public int posizioneY(int y);
	
	public int spostamento(int movimento);
	
	public boolean raggiunto(int x1, int y1, int x2, int y2, int spostamento);
	
	public int attacco(int attacco, int agilita, int numerosoldati);
	
	public int difesa(int difesa, int agilita, int numerosoldati);
	
	public int velocita(int velocita, int numerosoldati);

}
