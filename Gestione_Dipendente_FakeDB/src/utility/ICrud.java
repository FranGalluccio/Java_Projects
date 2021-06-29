package utility;

import java.util.ArrayList;

import model.Dipendente;

public interface ICrud {
	
	public void inserisci(Dipendente d);
	public void cancella(int i);
	public Dipendente leggi(int i);
	public ArrayList <Dipendente> leggi();
	public Dipendente ricerca(String cf);

}