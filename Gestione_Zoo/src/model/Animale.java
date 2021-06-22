package model;

public abstract class Animale {

	protected String tipoAnimale;
	protected double pesoAnimale;
	protected String habitat;
	protected String dieta;

	public Animale() {}

	public Animale(String tipoAnimale, double pesoAnimale, String habitat, String dieta) {
		this.tipoAnimale = tipoAnimale;
		this.pesoAnimale = pesoAnimale;
		this.habitat = habitat;
		this.dieta = dieta;
	}
	public void setTipoAnimale(String tipoAnimale) {
		this.tipoAnimale = tipoAnimale;
	}
	public void setPesoAnimale(double pesoAnimale) {
		this.pesoAnimale = pesoAnimale;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public void setDieta(String dieta) {
		this.dieta = dieta;
	}
	public String getTipoAnimale() {
		return tipoAnimale;
	}
	public double getPesoAnimale() {
		return pesoAnimale;
	}
	public String getHabitat() {
		return habitat;
	}
	public String getDieta() {
		return dieta;
	}
	@Override
	public String toString() {
		return tipoAnimale + "," + pesoAnimale + "," + habitat
				+ "," + dieta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dieta == null) ? 0 : dieta.hashCode());
		result = prime * result + ((habitat == null) ? 0 : habitat.hashCode());
		long temp;
		temp = Double.doubleToLongBits(pesoAnimale);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((tipoAnimale == null) ? 0 : tipoAnimale.hashCode());
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
		Animale other = (Animale) obj;
		if (dieta == null) {
			if (other.dieta != null)
				return false;
		} else if (!dieta.equals(other.dieta))
			return false;
		if (habitat == null) {
			if (other.habitat != null)
				return false;
		} else if (!habitat.equals(other.habitat))
			return false;
		if (Double.doubleToLongBits(pesoAnimale) != Double.doubleToLongBits(other.pesoAnimale))
			return false;
		if (tipoAnimale == null) {
			if (other.tipoAnimale != null)
				return false;
		} else if (!tipoAnimale.equals(other.tipoAnimale))
			return false;
		return true;
	}	
}
