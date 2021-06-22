package entities;

public class Alabardieri {

	private int numeroSoldati;
	private int x;
	private int y;
	private int movimento;
	private Alabardiere s;
	public Alabardieri(int numeroSoldati, int x, int y, int movimento, Alabardiere s) {
		super();
		this.numeroSoldati = numeroSoldati;
		this.x = x;
		this.y = y;
		this.movimento = movimento;
		this.s = s;
	}
	public int getNumeroSoldati() {
		return numeroSoldati;
	}
	public void setNumeroSoldati(int numeroSoldati) {
		this.numeroSoldati = numeroSoldati;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getMovimento() {
		return movimento;
	}
	public void setMovimento(int movimento) {
		this.movimento = movimento;
	}
	public Alabardiere getS() {
		return s;
	}
	public void setS(Alabardiere s) {
		this.s = s;
	}
	@Override
	public String toString() {
		return "Alabardieri [numeroSoldati=" + numeroSoldati + ", x=" + x + ", y=" + y + ", movimento=" + movimento
				+ ", s=" + s + "]";
	}
	
}
