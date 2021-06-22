package model;

public class Cane extends Animale {
	private String razza;
	private String colore;
	boolean vaccinato;
	char sesso;
	
	
	public Cane() {
	}
	public Cane (double pesoAnimale, String habitat, String dieta) {
		super("Cane", pesoAnimale, habitat, dieta);
	}
	public Cane(double pesoAnimale, String habitat, String dieta, String razza, String colore, boolean vaccinato, char sesso) {
		super("Cane", pesoAnimale, habitat, dieta);
		this.razza = razza;
		this.colore = colore;
		this.vaccinato = vaccinato;
		this.sesso = sesso;
	}
	public String getRazza() {
		return razza;
	}
	public void setRazza(String razza) {
		this.razza = razza;
	}
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	public boolean isVaccinato() {
		return vaccinato;
	}
	public void setVaccinato(boolean vaccinato) {
		this.vaccinato = vaccinato;
	}
	public char getSesso() {
		return sesso;
	}
	public void setSesso(char sesso) {
		this.sesso = sesso;
	}
	@Override
	public String toString() {
		return super.toString() + "," + razza + "," + colore + "," + vaccinato + "," + sesso;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((colore == null) ? 0 : colore.hashCode());
		result = prime * result + ((razza == null) ? 0 : razza.hashCode());
		result = prime * result + sesso;
		result = prime * result + (vaccinato ? 1231 : 1237);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cane other = (Cane) obj;
		if (colore == null) {
			if (other.colore != null)
				return false;
		} else if (!colore.equals(other.colore))
			return false;
		if (razza == null) {
			if (other.razza != null)
				return false;
		} else if (!razza.equals(other.razza))
			return false;
		if (sesso != other.sesso)
			return false;
		if (vaccinato != other.vaccinato)
			return false;
		return true;
	}
}
