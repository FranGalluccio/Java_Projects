package model;

public class Dipendente {

	//nome, cognome, luogo di nascita, data di nascita, codice fiscale, sesso, stipendio, ruolo aziendale
	private String nome;
	private String cognome;
	private String luogoDiNascita;
	private String dataDiNascita;
	private String codiceFIscale;
	private String sesso;
	private double stipendio;
	private String ruoloAziendale;
	
	public Dipendente() {
	}
	
	public Dipendente(String nome, String cognome, String luogoDiNascita, String dataDiNascita, 
			String codiceFiscale, String sesso, double stipendio, String ruoloAziendale) {
		this.nome = nome;
		this.cognome = cognome;
		this.luogoDiNascita = luogoDiNascita;
		this.dataDiNascita = dataDiNascita;
		this.codiceFIscale = codiceFiscale;
		this.sesso = sesso;
		this.stipendio = stipendio;
		this.ruoloAziendale = ruoloAziendale;		
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

	public String getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(String dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}

	public String getCodiceFIscale() {
		return codiceFIscale;
	}

	public void setCodiceFIscale(String ccodiceFIscale) {
		this.codiceFIscale = ccodiceFIscale;
	}

	public String getSesso() {
		return sesso;
	}

	public void setSesso(String sesso) {
		this.sesso = sesso;
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
		return nome + "," + cognome + "," + luogoDiNascita
				+ "," + dataDiNascita + "," + codiceFIscale + "," + sesso
				+ "," + stipendio + "," + ruoloAziendale;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codiceFIscale == null) ? 0 : codiceFIscale.hashCode());
		result = prime * result + ((cognome == null) ? 0 : cognome.hashCode());
		result = prime * result + ((dataDiNascita == null) ? 0 : dataDiNascita.hashCode());
		result = prime * result + ((luogoDiNascita == null) ? 0 : luogoDiNascita.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((ruoloAziendale == null) ? 0 : ruoloAziendale.hashCode());
		result = prime * result + ((sesso == null) ? 0 : sesso.hashCode());
		long temp;
		temp = Double.doubleToLongBits(stipendio);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Dipendente other = (Dipendente) obj;
		if (codiceFIscale == null) {
			if (other.codiceFIscale != null)
				return false;
		} else if (!codiceFIscale.equals(other.codiceFIscale))
			return false;
		if (cognome == null) {
			if (other.cognome != null)
				return false;
		} else if (!cognome.equals(other.cognome))
			return false;
		if (dataDiNascita == null) {
			if (other.dataDiNascita != null)
				return false;
		} else if (!dataDiNascita.equals(other.dataDiNascita))
			return false;
		if (luogoDiNascita == null) {
			if (other.luogoDiNascita != null)
				return false;
		} else if (!luogoDiNascita.equals(other.luogoDiNascita))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (ruoloAziendale == null) {
			if (other.ruoloAziendale != null)
				return false;
		} else if (!ruoloAziendale.equals(other.ruoloAziendale))
			return false;
		if (sesso == null) {
			if (other.sesso != null)
				return false;
		} else if (!sesso.equals(other.sesso))
			return false;
		if (Double.doubleToLongBits(stipendio) != Double.doubleToLongBits(other.stipendio))
			return false;
		return true;
	}
	
	
}
