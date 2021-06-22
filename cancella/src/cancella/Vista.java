package cancella;

public class Vista {
	
	public String stampa(Persona persona) {
		String s;
		if(persona instanceof Dirigente) {
			s = "Sono un dirigente";
		}
		else if(persona instanceof Impiegato) {
			s = "Sono un impiegato";
		} 
		else {
			s = "Sono una persona";
		}
		return s;
	}

}
