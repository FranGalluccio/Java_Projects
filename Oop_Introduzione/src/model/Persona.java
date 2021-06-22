package model;

public class Persona {
	
	private int id;
	private String nome;
	private String cognome;
	private String luogoDiNascita;
	private String codiceFiscale;
	private String sesso;
	
	public Persona() {}
	public Persona(String nome, String cognome, String luogoDiNascita, String codiceFiscale, String sesso) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.luogoDiNascita = luogoDiNascita;
		this.codiceFiscale = codiceFiscale;
		this.sesso = sesso;
	}
	
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
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", luogoDiNascita=" + luogoDiNascita
				+ ", codiceFiscale=" + codiceFiscale + ", sesso=" + sesso + "]";
	}
	
	

}
