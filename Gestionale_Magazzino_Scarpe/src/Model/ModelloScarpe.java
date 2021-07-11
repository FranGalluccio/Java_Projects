package Model;

public class ModelloScarpe extends Scarpe{
	private String modello;
	private String marca;

	public ModelloScarpe() {}

	public ModelloScarpe(String tipo, Double numero, Integer id, String modello, String marca) {
		super(tipo, numero, id);
		this.modello = modello;
		this.marca = marca;
	}

	public void setModello(String modello) {
		this.modello=modello;
	}
	public String getModello() {
		return modello;
	}

	public void setMarca(String marca) {
		this.marca= marca;
	}
	public String getMarca() {
		return marca;
	}
	@Override
	public String toString() {
		return super.toString() + "," + modello + "," + marca;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((modello == null) ? 0 : modello.hashCode());
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
		ModelloScarpe other = (ModelloScarpe) obj;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (modello == null) {
			if (other.modello != null)
				return false;
		} else if (!modello.equals(other.modello))
			return false;
		return true;
	}


}
