package model;

public class Frutta {

	int id;
	private String tipofrutta;
	private String colore;
	private String sapore;
	private String stagione;
	private double prezzo;

	public Frutta() {}
	
	public Frutta(int id, String tipofrutta, String colore, String sapore, String stagione, double prezzo) {
		super();
		this.id = id;
		this.tipofrutta = tipofrutta;
		this.colore = colore;
		this.sapore = sapore;
		this.stagione = stagione;
		this.prezzo = prezzo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipofrutta() {
		return tipofrutta;
	}
	public void setTipofrutta(String tipofrutta) {
		this.tipofrutta = tipofrutta;
	}
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	public String getSapore() {
		return sapore;
	}
	public void setSapore(String sapore) {
		this.sapore = sapore;
	}
	public String getStagione() {
		return stagione;
	}
	public void setStagione(String stagione) {
		this.stagione = stagione;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "Frutta [id=" + id + ", tipofrutta=" + tipofrutta + ", colore=" + colore + ", sapore=" + sapore
				+ ", stagione=" + stagione + ", prezzo=" + prezzo + "]";
	}

}
