package model;

public class Cucina {
	
	private int id;
	private String antipasti;
	private String primoPiatto;
	private String secondoPiatto;
	private String bibita;
	private String contorno;
	private String dolce;
	private String digestivo;
	private double conto;
	
	public Cucina() {
		conto = 40;
	}

	public Cucina(int id,String antipasti, String primoPiatto, String secondoPiatto, String bibita, String contorno,
			String dolce, String digestivo) {
		super();
		this.antipasti = antipasti;
		this.primoPiatto = primoPiatto;
		this.secondoPiatto = secondoPiatto;
		this.bibita = bibita;
		this.contorno = contorno;
		this.dolce = dolce;
		this.digestivo = digestivo;
		this.conto = 40;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAntipasti() {
		return antipasti;
	}
	public void setAntipasti(String antipasti) {
		this.antipasti = antipasti;
	}
	public String getPrimoPiatto() {
		return primoPiatto;
	}
	public void setPrimoPiatto(String primoPiatto) {
		this.primoPiatto = primoPiatto;
	}
	public String getSecondoPiatto() {
		return secondoPiatto;
	}
	public void setSecondoPiatto(String secondoPiatto) {
		this.secondoPiatto = secondoPiatto;
	}
	public String getBibita() {
		return bibita;
	}
	public void setBibita(String bibita) {
		this.bibita = bibita;
	}
	public String getContorno() {
		return contorno;
	}
	public void setContorno(String contorno) {
		this.contorno = contorno;
	}
	public String getDolce() {
		return dolce;
	}
	public void setDolce(String dolce) {
		this.dolce = dolce;
	}
	public String getDigestivo() {
		return digestivo;
	}
	public void setDigestivo(String digestivo) {
		this.digestivo = digestivo;
	}
	public double getConto() {
		return conto;
	}
	public void setConto(double conto) {
		this.conto = conto;
	}
	@Override
	public String toString() {
		return id + "," + antipasti + "," + primoPiatto + "," + secondoPiatto
				+ "," + bibita + "," + contorno + "," + dolce + "," + digestivo
				+ "," + conto;
	}

}
