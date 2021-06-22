package model;

public abstract class FiguraGeometrica {

	private String figuraGeometrica;
	
	public String[] getInfoFiguraGeometrica() {
		String[] informazioni = new String[3];
		informazioni[0] = "Figura geometrica: " + figuraGeometrica;
		informazioni[1] = "Perimetro: " + getPerimetro();
		informazioni[2] = "Area: " + getArea();
		return informazioni;
	}

	protected FiguraGeometrica(String figuraGeometrica) {
		this.figuraGeometrica = figuraGeometrica;
	}
	protected void getFiguraGeometrica(String figuraGeometrica) {
		this.figuraGeometrica = figuraGeometrica;
	}
	public String getTipoFiguraGeometrica() {
		return null;
	}
	public abstract double getPerimetro();

	public abstract double getArea();

	@Override
	public String toString() {
		return figuraGeometrica;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((figuraGeometrica == null) ? 0 : figuraGeometrica.hashCode());
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
		FiguraGeometrica other = (FiguraGeometrica) obj;
		if (figuraGeometrica == null) {
			if (other.figuraGeometrica != null)
				return false;
		} else if (!figuraGeometrica.equals(other.figuraGeometrica))
			return false;
		return true;
	}
}
