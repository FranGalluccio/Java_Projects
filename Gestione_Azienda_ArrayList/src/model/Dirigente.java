package model;

public class Dirigente extends Manager {

	private String livelloFunzionale;

	public Dirigente() {}
	public Dirigente(int id, String nome, String cognome, String luogoDiNascita, String sesso, String codiceFiscale,
			double stipendio, String ruoloAziendale, String areaDiResponsabilita, String livelloFunzionale) {
		super(id, nome, cognome, luogoDiNascita, sesso, codiceFiscale, stipendio, ruoloAziendale, areaDiResponsabilita);
		this.livelloFunzionale = livelloFunzionale;
	}

	public String getLivelloFunzionale() {
		return livelloFunzionale;
	}

	public void setLivelloFunzionale(String livelloFunzionale) {
		this.livelloFunzionale = livelloFunzionale;
	}

	@Override
	public String toString() {
		return super.toString() + "," + livelloFunzionale;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((livelloFunzionale == null) ? 0 : livelloFunzionale.hashCode());
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
		Dirigente other = (Dirigente) obj;
		if (livelloFunzionale == null) {
			if (other.livelloFunzionale != null)
				return false;
		} else if (!livelloFunzionale.equals(other.livelloFunzionale))
			return false;
		return true;
	}
}
