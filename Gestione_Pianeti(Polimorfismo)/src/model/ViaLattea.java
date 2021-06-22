package model;

public class ViaLattea {

	private String galassia;
	
	public ViaLattea() {}
	public ViaLattea(String galassia) {
		this.galassia = galassia;
	}
	@Override
	public String toString() {
		return galassia;
	}
	public void setGalassia(String galassia) {
		this.galassia = galassia;
	}
	public String getGalassia() {
		return this.galassia;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((galassia == null) ? 0 : galassia.hashCode());
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
		ViaLattea other = (ViaLattea) obj;
		if (galassia == null) {
			if (other.galassia != null)
				return false;
		} else if (!galassia.equals(other.galassia))
			return false;
		return true;
	}


}
