package cancella;

public class Dirigente extends Impiegato{

	public Dirigente(String nome, String cognome, int eta, String stipendio, String areaDiInteresse) {
		super(nome, cognome, eta, stipendio);
		// TODO Auto-generated constructor stub
	}

	public String getAreaDiInteresse() {
		return areaDiInteresse;
	}

	@Override
	public String toString() {
		return super.toString() + " [areaDiInteresse=" + areaDiInteresse + "]";
	}

	public void setAreaDiInteresse(String areaDiInteresse) {
		this.areaDiInteresse = areaDiInteresse;
	}

	private String areaDiInteresse;
}
