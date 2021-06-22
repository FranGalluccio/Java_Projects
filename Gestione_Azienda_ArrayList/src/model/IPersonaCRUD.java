package model;

import java.util.ArrayList;

public interface IPersonaCRUD {

	public boolean cancella(int indice);
	public boolean modifica (int indice, Persona p);
	public Persona leggi(int i);
	public ArrayList<Persona> leggi();
	boolean inserisci(Persona p);
	
}
