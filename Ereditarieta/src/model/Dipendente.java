package model;

public class Dipendente extends Persona {
	
	double stipendio;
	
	public Dipendente() {}

	public Dipendente(String nome, String cognome, String codiceFiscale, int eta, String sesso, double stipendio) {
		super(nome, cognome, codiceFiscale, eta, sesso);
		this.stipendio = stipendio;
	}

	public double getStipendio() {
		return stipendio;
	}

	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}

	@Override
	public String toString() {
		return super.toString() + "," + stipendio;
	}
}
