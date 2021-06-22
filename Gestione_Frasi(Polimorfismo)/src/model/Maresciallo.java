package model;

public class Maresciallo extends Militare{

	private String PlotoneSottoCOmando;

	public Maresciallo(String nome, String cognome, String luogoDiNascita, String plotone, String plotoneSottoComando) {
		super(nome, cognome, luogoDiNascita, plotone);
		this.PlotoneSottoCOmando = plotoneSottoComando;
	}
	public String getPlotoneSottoCOmando() {
		return PlotoneSottoCOmando;
	}
	public void setPlotoneSottoCOmando(String plotoneSottoCOmando) {
		PlotoneSottoCOmando = plotoneSottoCOmando;
	}
	public Maresciallo() {
		super();
	}
	@Override
	public String toString() {
		return super.toString() + "," + PlotoneSottoCOmando ;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((PlotoneSottoCOmando == null) ? 0 : PlotoneSottoCOmando.hashCode());
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
		Maresciallo other = (Maresciallo) obj;
		if (PlotoneSottoCOmando == null) {
			if (other.PlotoneSottoCOmando != null)
				return false;
		} else if (!PlotoneSottoCOmando.equals(other.PlotoneSottoCOmando))
			return false;
		return true;
	}




}
