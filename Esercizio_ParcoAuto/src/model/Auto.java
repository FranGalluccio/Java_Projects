package model;

public class Auto {
	
	private String marca;
	private String modello;
	private int anno;
	private String colore;
	private String targa;
	
	public Auto() {}
	public Auto(String marca, String modello, int anno, String colore, String targa) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.anno = anno;
		this.colore = colore;
		this.targa = targa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public int getAnno() {
		return anno;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	public String getTarga() {
		return targa;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}
	@Override
	public String toString() {
		return  marca + "," + modello + "," + anno + "," + colore + ","
				+ targa;
	}
	
}
