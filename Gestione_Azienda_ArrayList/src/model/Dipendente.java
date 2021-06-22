package model;

public class Dipendente extends Persona{
	
	private double stipendio;
	private String ruoloAziendale;
	
	public Dipendente() {}
	public Dipendente(int id, String nome, String cognome, String luogoDiNascita, String sesso, String codiceFiscale, double stipendio, String ruoloAziendale) {
		super(id, nome, cognome, luogoDiNascita, sesso, codiceFiscale);
		this.stipendio = stipendio;
		this.ruoloAziendale = ruoloAziendale;
		
	}
	public double getStipendio() {
		return stipendio;
	}
	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}
	public String getRuoloAziendale() {
		return ruoloAziendale;
	}
	public void setRuoloAziendale(String ruoloAziendale) {
		this.ruoloAziendale = ruoloAziendale;
	}
	@Override
	public String toString() {
		return super.toString() + "," + stipendio + "," + ruoloAziendale;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((ruoloAziendale == null) ? 0 : ruoloAziendale.hashCode());
		long temp;
		temp = Double.doubleToLongBits(stipendio);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Dipendente other = (Dipendente) obj;
		if (ruoloAziendale == null) {
			if (other.ruoloAziendale != null)
				return false;
		} else if (!ruoloAziendale.equals(other.ruoloAziendale))
			return false;
		if (Double.doubleToLongBits(stipendio) != Double.doubleToLongBits(other.stipendio))
			return false;
		return true;
	}
	
}
