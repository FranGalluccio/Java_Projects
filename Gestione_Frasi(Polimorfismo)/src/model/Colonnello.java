package model;

public class Colonnello extends Maresciallo{
	
	private String reggimentoSottoComando;

	public Colonnello() {
		super();
	}

	public Colonnello(String nome, String cognome, String luogoDiNascita, String plotone, String plotoneSottoComando, String reggimentoSottoComando) {
		super(nome, cognome, luogoDiNascita, plotone, plotoneSottoComando);
		this.reggimentoSottoComando = reggimentoSottoComando;
	}

	public String getReggimentoSottoComando() {
		return reggimentoSottoComando;
	}

	public void setReggimentoSottoComando(String reggimentoSottoComando) {
		this.reggimentoSottoComando = reggimentoSottoComando;
	}

	@Override
	public String toString() {
		return super.toString() + reggimentoSottoComando;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((reggimentoSottoComando == null) ? 0 : reggimentoSottoComando.hashCode());
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
		Colonnello other = (Colonnello) obj;
		if (reggimentoSottoComando == null) {
			if (other.reggimentoSottoComando != null)
				return false;
		} else if (!reggimentoSottoComando.equals(other.reggimentoSottoComando))
			return false;
		return true;
	}
	
}
