package model;

public class Militare {
	
	private String nome;
	private String cognome;
	private String luogoDiNascita;
	private String plotone;
	
	public Militare() {}
	@Override
	public String toString() {
		return nome + "," + cognome + "," + luogoDiNascita + "," + plotone;
	}
	public Militare(String nome, String cognome, String luogoDiNascita, String plotone) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.luogoDiNascita = luogoDiNascita;
		this.plotone = plotone;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cognome == null) ? 0 : cognome.hashCode());
		result = prime * result + ((luogoDiNascita == null) ? 0 : luogoDiNascita.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((plotone == null) ? 0 : plotone.hashCode());
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
		Militare other = (Militare) obj;
		if (cognome == null) {
			if (other.cognome != null)
				return false;
		} else if (!cognome.equals(other.cognome))
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
		if (plotone == null) {
			if (other.plotone != null)
				return false;
		} else if (!plotone.equals(other.plotone))
			return false;
		return true;
	}
	public String getPlotone() {
		return plotone;
	}
	public void setPlotone(String plotone) {
		this.plotone = plotone;
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
	

}
