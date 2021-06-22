package model;

public class Persona {
	//************** ATTRIBUTI **************
	private int id;
	private String nome;
	private String cognome;
	private String luogoDiNascita;
	private String codiceFiscale;
	private String sesso;
	
	// ************** COSTRUTTORI **************
	public Persona() {}
	public Persona(String nome, String cognome, String luogoDiNascita, String codiceFiscale, String sesso) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.luogoDiNascita = luogoDiNascita;
		this.codiceFiscale = codiceFiscale;
		this.sesso = sesso;
	}
	//************** METODI **************
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getLuogoDiNascita() {
		return luogoDiNascita;
	}
	public void setLuogoDiNascita(String luogoDiNascita) {
		this.luogoDiNascita = luogoDiNascita;
	}
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	public String getSesso() {
		return sesso;
	}
	public void setSesso(String sesso) {
		this.sesso = sesso;
	}
	// Override del metodo toString ai fini di stampa
	@Override
	public String toString() {
		return  id + ", " + nome + ", " + cognome + ", " + luogoDiNascita
				+ ", " + codiceFiscale + ", " + sesso ;
	}
}