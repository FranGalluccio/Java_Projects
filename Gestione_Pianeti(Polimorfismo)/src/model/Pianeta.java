package model;

public class Pianeta extends Sistema{

	private boolean acqua;
	private boolean vita;
	public Pianeta() {
		super();
	}
	public Pianeta(String galassia, String sistema, boolean vita, boolean acqua) {
		super(galassia, sistema);
		this.acqua = acqua;
		this.vita = vita;
	}
	@Override
	public String toString() {
		return super.toString() + acqua + "," + vita;
	}
	public boolean isAcqua() {
		return acqua;
	}
	public void setAcqua(boolean acqua) {
		this.acqua = acqua;
	}
	public boolean isVita() {
		return vita;
	}
	public void setVita(boolean vita) {
		this.vita = vita;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (acqua ? 1231 : 1237);
		result = prime * result + (vita ? 1231 : 1237);
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
		Pianeta other = (Pianeta) obj;
		if (acqua != other.acqua)
			return false;
		if (vita != other.vita)
			return false;
		return true;
	}


}
