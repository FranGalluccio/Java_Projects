package model;

import java.util.HashMap;

public interface IPersonaCrud {

	public void cancella(int indice);
	public void modifica (int indice, Persona p);
	public Persona leggi(int i);
	public HashMap<Integer, Persona> leggi();
	void inserisci(int chiave, Persona p);
}
