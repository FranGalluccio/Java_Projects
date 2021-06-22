package model;

public class Carrello {

	String frutta;
	String Verdura;
	String Pasta;
	String carne;
	String bevande;
	
	public Carrello() {}
	public Carrello(String frutta, String verdura, String pasta, String carne, String bevande) {
		super();
		this.frutta = frutta;
		Verdura = verdura;
		Pasta = pasta;
		this.carne = carne;
		this.bevande = bevande;
	}
	public String getFrutta() {
		return frutta;
	}
	public void setFrutta(String frutta) {
		this.frutta = frutta;
	}
	public String getVerdura() {
		return Verdura;
	}
	public void setVerdura(String verdura) {
		Verdura = verdura;
	}
	public String getPasta() {
		return Pasta;
	}
	public void setPasta(String pasta) {
		Pasta = pasta;
	}
	public String getCarne() {
		return carne;
	}
	public void setCarne(String carne) {
		this.carne = carne;
	}
	public String getBevande() {
		return bevande;
	}
	public void setBevande(String bevande) {
		this.bevande = bevande;
	}
	@Override
	public String toString() {
		return "Carrello [frutta=" + frutta + ", Verdura=" + Verdura + ", Pasta=" + Pasta + ", carne=" + carne
				+ ", bevande=" + bevande + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Pasta == null) ? 0 : Pasta.hashCode());
		result = prime * result + ((Verdura == null) ? 0 : Verdura.hashCode());
		result = prime * result + ((bevande == null) ? 0 : bevande.hashCode());
		result = prime * result + ((carne == null) ? 0 : carne.hashCode());
		result = prime * result + ((frutta == null) ? 0 : frutta.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carrello other = (Carrello) obj;
		if (Pasta == null) {
			if (other.Pasta != null)
				return false;
		} else if (!Pasta.equals(other.Pasta))
			return false;
		if (Verdura == null) {
			if (other.Verdura != null)
				return false;
		} else if (!Verdura.equals(other.Verdura))
			return false;
		if (bevande == null) {
			if (other.bevande != null)
				return false;
		} else if (!bevande.equals(other.bevande))
			return false;
		if (carne == null) {
			if (other.carne != null)
				return false;
		} else if (!carne.equals(other.carne))
			return false;
		if (frutta == null) {
			if (other.frutta != null)
				return false;
		} else if (!frutta.equals(other.frutta))
			return false;
		return true;
	}
	
	
}
