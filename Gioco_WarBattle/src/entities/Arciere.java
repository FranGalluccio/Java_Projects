package entities;

public class Arciere {
	
	private int vita;
	private int attacco;
	private int difesa;
	private int velocita;
	private int agilita;
	public Arciere(int vita, int attacco, int difesa, int velocita, int agilita) {
		super();
		this.vita = vita;
		this.attacco = attacco;
		this.difesa = difesa;
		this.velocita = velocita;
		this.agilita = agilita;
	}
	public int getVita() {
		return vita;
	}
	public void setVita(int vita) {
		this.vita = vita;
	}
	public int getAttacco() {
		return attacco;
	}
	public void setAttacco(int attacco) {
		this.attacco = attacco;
	}
	public int getDifesa() {
		return difesa;
	}
	public void setDifesa(int difesa) {
		this.difesa = difesa;
	}
	public int getVelocita() {
		return velocita;
	}
	public void setVelocita(int velocita) {
		this.velocita = velocita;
	}
	public int getAgilita() {
		return agilita;
	}
	public void setAgilita(int agilita) {
		this.agilita = agilita;
	}
	@Override
	public String toString() {
		return "Arciere [vita=" + vita + ", attacco=" + attacco + ", difesa=" + difesa + ", velocita=" + velocita
				+ ", agilita=" + agilita + "]";
	}
	
	

}
