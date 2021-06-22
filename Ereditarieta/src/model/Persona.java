package model;

public class Persona {
	
	String nome;
	String cognome;
	String codiceFiscale;
	int eta;
	String sesso;
	
	public Persona() {}
	
	public Persona(String nome, String cognome, String codiceFiscale, int eta, String sesso) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = codiceFiscale;
		this.eta = eta;
		this.sesso = sesso;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public String getSesso() {
		return sesso;
	}

	public void setSesso(String sesso) {
		this.sesso = sesso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	@Override
	public String toString() {
		return nome + "," + cognome + "," + codiceFiscale + "," + eta + "," + sesso; 
	}
	

}
