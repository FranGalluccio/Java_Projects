package model;

import java.util.HashMap;

public class PersonaCrud implements IPersonaCrud{
	
	HashMap<Integer, Persona> persona = new HashMap<Integer, Persona>();

	@Override
	public void cancella(int index) {
		persona.remove(index);
	}

	@Override
	public void modifica(int index, Persona p) {
		persona.replace(index, p);
	}

	@Override
	public Persona leggi(int i) {
		return persona.get(i);
	}

	@Override
	public HashMap<Integer, Persona> leggi() {
		return persona;
	}

	@Override
	public void inserisci(int chiave, Persona p) {
		persona.put(chiave, p);
	}
}
