package model;

public class Hulk {

	private int hp;
	private int attacco;
	private int difesa;
	private int agilita;
	private int critico;
	private int armatura;

	public Hulk(int hp, int attacco, int difesa, int agilita, int critico, int armatura) {
		super();
		this.attacco = attacco;
		this.difesa = difesa;
		this.agilita = agilita;
		this.critico = critico;
		this.armatura = armatura;
		
	}
	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
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

	public int getAgilita() {
		return agilita;
	}

	public void setAgilita(int agilita) {
		this.agilita = agilita;
	}

	public int getCritico() {
		return critico;
	}

	public void setCritico(int critico) {
		this.critico = critico;
	}

	public int getArmatura() {
		return armatura;
	}

	public void setArmatura(int armatura) {
		this.armatura = armatura;
	}

	@Override
	public String toString() {
		return "Thor [attacco=" + attacco + ", difesa=" + difesa + ", agilita=" + agilita + ", critico=" + critico
				+ ", armatura=" + armatura + "]";
	}

}
