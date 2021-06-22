package model;

import java.util.ArrayList;

public interface IPianetaCRUD {

	public boolean cancella(int indice);
	public boolean modifica (int indice, Pianeta p);
	public Pianeta leggi(int i);
	public ArrayList<Pianeta> leggi();
	boolean inserisci(Pianeta p);
	
}
