package cancella;

public class Impiegato extends Persona{
	
	
	public Impiegato(String nome, String cognome, int eta, String stipendio) {
		super(nome, cognome, eta);
		// TODO Auto-generated constructor stub
	}

	public String getStipendio() {
		return stipendio;
	}

	public void setStipendio(String stipendio) {
		this.stipendio = stipendio;
	}

	private String stipendio;

	@Override
	public String toString() {
		return super.toString() + "[stipendio=" + stipendio + "]";
	}
	
	

}
