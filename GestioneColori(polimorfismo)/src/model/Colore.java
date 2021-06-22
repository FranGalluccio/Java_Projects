package model;

public class Colore {

	int id;
	String nomeColore;
	int red;
	int green;
	int blue;

	public Colore(int id, String nomeColore, int red, int green, int blue) {
		this.id = id;
		this.nomeColore = nomeColore;
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	@Override
	public String toString() {
		return id + "," + nomeColore + "," + red + "," + green + ","
				+ blue;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getNomeColore() {
		return nomeColore;
	}

	public void setNomeColore(String nomeColore) {
		this.nomeColore = nomeColore;
	}

	public int getRed() {
		return red;
	}

	public void setRed(int red) {
		this.red = red;
	}

	public int getGreen() {
		return green;
	}

	public void setGreen(int green) {
		this.green = green;
	}

	public int getBlue() {
		return blue;
	}

	public void setBlue(int blue) {
		this.blue = blue;
	}

}
