package model;
import java.util.ArrayList;

public class PersonaCRUD implements IPersonaCRUD{

	ArrayList<Persona> persone = new ArrayList<Persona>();

	@Override
	public boolean inserisci(Persona p) {
		persone.add(p);
		return true;
	}
	@Override
	public boolean cancella(int indice) {
		persone.remove(indice);
		return true;
	}
	@Override
	public boolean modifica(int indice, Persona p) {
		persone.set((indice), p);
		return true;
	}
	@Override
	public Persona leggi(int i) {
		return persone.get(i);
	}
	@Override
	public ArrayList<Persona> leggi() {
		return persone;
	}
	
	public Persona duplica(Persona p) {
		Persona p2 = new Persona(p.getId(),p.getNome(), p.getCognome(), p.getLuogoDiNascita(),
				p.getSesso(), p.getCodiceFiscale(), p.getDataDiNascita());
				return p2;
	}
	
}
