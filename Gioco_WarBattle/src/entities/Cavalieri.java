package entities;

public class Cavalieri {
	private int numeroSoldati;
	private int x;
	private int y;
	private int movimento;
	private Cavaliere s;
	public Cavalieri(int numeroSoldati, int x, int y, int movimento, Cavaliere s) {
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
	public Cavaliere getS() {
		return s;
	}
	public void setS(Cavaliere s) {
		this.s = s;
	}
	@Override
	public String toString() {
		return "Cavalieri [numeroSoldati=" + numeroSoldati + ", x=" + x + ", y=" + y + ", movimento=" + movimento
				+ ", s=" + s + "]";
	}
	
	public int sfondamento(int numerosoldati, int atk, int def) {
		int vittime = 0;
		int ecc = atk - def;
		if(atk > def) {
			vittime = ecc / numerosoldati;
		}
		System.out.println("Vittime: "+ vittime);
		
		return vittime;
	}
	
	

}
