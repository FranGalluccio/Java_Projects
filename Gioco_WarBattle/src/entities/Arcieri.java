package entities;

public class Arcieri {

	private int numeroSoldati;
	private int x;
	private int y;
	private int movimento;
	private Arciere s;
	public Arcieri(int numeroSoldati, int x, int y, int movimento, Arciere s) {
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
	public Arciere getS() {
		return s;
	}
	public void setS(Arciere s) {
		this.s = s;
	}
	@Override
	public String toString() {
		return "Arcieri [numeroSoldati=" + numeroSoldati + ", x=" + x + ", y=" + y + ", movimento=" + movimento + ", s="
				+ s + "]";
	}
	
	public int tirolungo(int spostamento) {
		int gittata = spostamento;
		gittata+=5;
		return gittata;		
	}
}
