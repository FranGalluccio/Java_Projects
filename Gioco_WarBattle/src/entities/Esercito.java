package entities;

public class Esercito {
	private String specie;
	private int numeroarcieri;
	private int numeroalabardieri;
	private int numerocavalieri;
	
	private Alabardieri al;
	private Alabardieri a2;
	private Alabardieri a3;
	
	private Arcieri ac1;
	private Arcieri ac2;
	private Arcieri ac3;
	
	private Cavalieri cv;

	public Esercito(String specie, int numeroarcieri, int numeroalabardieri, int numerocavalieri, Alabardieri al,
			Alabardieri a2, Alabardieri a3, Arcieri ac1, Arcieri ac2, Cavalieri cv) {
		super();
		this.specie = specie;
		this.numeroarcieri = numeroarcieri;
		this.numeroalabardieri = numeroalabardieri;
		this.numerocavalieri = numerocavalieri;
		this.al = al;
		this.a2 = a2;
		this.a3 = a3;
		this.ac1 = ac1;
		this.ac2 = ac2;
		this.cv = cv;
	}

	public String getSpecie() {
		return specie;
	}

	public void setSpecie(String specie) {
		this.specie = specie;
	}

	public int getNumeroarcieri() {
		return numeroarcieri;
	}

	public void setNumeroarcieri(int numeroarcieri) {
		this.numeroarcieri = numeroarcieri;
	}

	public int getNumeroalabardieri() {
		return numeroalabardieri;
	}

	public void setNumeroalabardieri(int numeroalabardieri) {
		this.numeroalabardieri = numeroalabardieri;
	}

	public int getNumerocavalieri() {
		return numerocavalieri;
	}

	public void setNumerocavalieri(int numerocavalieri) {
		this.numerocavalieri = numerocavalieri;
	}

	public Alabardieri getAl() {
		return al;
	}

	public void setAl(Alabardieri al) {
		this.al = al;
	}

	public Alabardieri getA2() {
		return a2;
	}

	public void setA2(Alabardieri a2) {
		this.a2 = a2;
	}

	public Alabardieri getA3() {
		return a3;
	}

	public void setA3(Alabardieri a3) {
		this.a3 = a3;
	}

	public Arcieri getAc1() {
		return ac1;
	}

	public void setAc1(Arcieri ac1) {
		this.ac1 = ac1;
	}

	public Arcieri getAc2() {
		return ac2;
	}

	public void setAc2(Arcieri ac2) {
		this.ac2 = ac2;
	}

	public Arcieri getAc3() {
		return ac3;
	}

	public void setAc3(Arcieri ac3) {
		this.ac3 = ac3;
	}

	public Cavalieri getCv() {
		return cv;
	}

	public void setCv(Cavalieri cv) {
		this.cv = cv;
	}

	@Override
	public String toString() {
		return "Esercito [specie=" + specie + ", numeroarcieri=" + numeroarcieri + ", numeroalabardieri="
				+ numeroalabardieri + ", numerocavalieri=" + numerocavalieri + ", al=" + al + ", a2=" + a2 + ", a3="
				+ a3 + ", ac1=" + ac1 + ", ac2=" + ac2 + ", cv=" + cv + "]";
	}

	
}
