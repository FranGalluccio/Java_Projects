package utility;

import java.util.ArrayList;

import model.Dipendente;

public final class Crud implements ICrud {

	private ArrayList <Dipendente> dipendente = new ArrayList <Dipendente>();
	
	private static Crud instance=null;
	private Crud() {}
	
	public static Crud getInstance() {
		if(instance==null) {
			instance=new Crud();
		}
		return instance;
	}

	@Override
	public void inserisci(Dipendente d) {
		dipendente.add(d);
	}

	@Override
	public void cancella(int i) {
		dipendente.remove(i);
	}
	
	@Override
	public Dipendente leggi(int i) {
		return dipendente.get(i);
	}

	@Override
	public ArrayList<Dipendente> leggi() {	
		return dipendente;
	}

	@Override
	public Dipendente ricerca(String cf) {
		
		for(int i=0;i<dipendente.size();i++) {
			if(dipendente.get(i).getCodiceFiscale().equalsIgnoreCase(cf)) {
				return dipendente.get(i);
			}
		}
		return null;
	}

}
