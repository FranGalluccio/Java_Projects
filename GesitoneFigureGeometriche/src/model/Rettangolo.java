package model;

public class Rettangolo extends FiguraGeometrica{
	

	private int latoMaggiore;
	private int latoMinore;
	
	@Override
	public String[] getInfoFiguraGeometrica() {
		String[] informazioni = new String[5];
		for (int i = 0; i < super.getInfoFiguraGeometrica().length; i++) {
			informazioni[i] = super.getInfoFiguraGeometrica()[i];
		}
		informazioni[3] = "LatoMaggiore: " + latoMaggiore;
		informazioni[4] = "LatoMinore: " + latoMinore;
		return informazioni;
	}
	
	public Rettangolo() {
		super("Rettangolo");
	}
	public Rettangolo(int latoMaggiore, int latoMinore) {
		super("Rettangolo");
		this.latoMaggiore = latoMaggiore;
		this.latoMinore = latoMinore;
	}
	public int getLatoMaggiore() {
		return latoMaggiore;
	}
	public void setLatoMaggiore(int latoMaggiore) {
		this.latoMaggiore = latoMaggiore;
	}
	public int getLatoMinore() {
		return latoMinore;
	}
	public void setLatoMinore(int latoMinore) {
		this.latoMinore = latoMinore;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + latoMaggiore;
		result = prime * result + latoMinore;
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
		Rettangolo other = (Rettangolo) obj;
		if (latoMaggiore != other.latoMaggiore)
			return false;
		if (latoMinore != other.latoMinore)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return super.toString() + "," + latoMaggiore + "," + latoMinore;
	}
	
	@Override
	public double getArea(){
		return latoMaggiore * latoMinore;
	}
	
	@Override
	public double getPerimetro(){
		return latoMaggiore + latoMinore * 2;
	}

}
