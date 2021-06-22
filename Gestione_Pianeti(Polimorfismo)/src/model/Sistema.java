package model;

public class Sistema extends ViaLattea{
	
	private String sistema;
	public Sistema() {
		super();
	}
	public Sistema(String galassia, String sistema) {
		super(galassia);
		this.sistema = sistema;
	}
	@Override
	public String toString() {
		return super.toString() + sistema;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((sistema == null) ? 0 : sistema.hashCode());
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
		Sistema other = (Sistema) obj;
		if (sistema == null) {
			if (other.sistema != null)
				return false;
		} else if (!sistema.equals(other.sistema))
			return false;
		return true;
	}
	public String getSistema() {
		return sistema;
	}
	public void setSistema(String sistema) {
		this.sistema = sistema;
	}
}
