package view;

import java.util.List;

import entities.Alabardieri;
import entities.Arcieri;
import entities.Cavalieri;
import entities.Esercito;

public interface IView {

	public String renderEnterGame();
	
	public String renderArena(Esercito giocatore, Esercito nemico);
	
	public void renderMap(Cavalieri giocatoreCav, Cavalieri nemicoCav, List<Arcieri> giocatoreArc, List <Arcieri> nemicoArc, List <Alabardieri> giocatoreAlb, List<Alabardieri> nemicoAlb );

	
}
