package view;

import java.util.ArrayList;
import model.Dipendente;

public interface IGestoreIO {
	public String leggiStringa(String suggerimento);
	public Integer leggiIntero(String suggerimento);
	public Double leggiDouble(String suggerimento);
	public void mascheraInserimento(Dipendente dip);
	public void mascheraModifica(Dipendente dip);
	public void stampaScheda(ArrayList<Dipendente>dipendente);
	public void stampaCSV(ArrayList<Dipendente>dipendente);
}