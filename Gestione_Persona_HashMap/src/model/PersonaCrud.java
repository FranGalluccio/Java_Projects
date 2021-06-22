package model;

import java.util.HashMap;

public class PersonaCrud implements IPersonaCrud{
	
	HashMap<Integer,Persona> azienda= new HashMap<Integer,Persona>();

	//create
	@Override
	public void inserisci(int chiave,Persona p) {
	azienda.put(chiave, p); //add
	}

	//update
	@Override
	public void modifica(int chiave, Persona p) {
	azienda.replace(chiave, p); //set
	}

	//delete
	@Override
	public void cancella(int chiave) {
	azienda.remove(chiave);
	}

	//read entit�
	@Override
	public Persona leggi(int chiave) {
	return azienda.get(chiave);
	}

	//read
	@Override
	public HashMap<Integer,Persona> leggi(){
	return azienda;
	}
	
	public Persona duplica(Persona p) {
		Persona p2 = new Persona(p.getNome(), p.getCognome(), p.getLuogoDiNascita(),
				p.getSesso(), p.getCodiceFiscale(), p.getDataDiNascita());
				return p2;
	}
}
