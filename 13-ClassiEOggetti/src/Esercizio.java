
public class Esercizio {
	
	
	//somma di 2 numeri
	public void sommaDueNumeri(int n1, int n2) {
		int somma = n1 + n2;
		System.out.println(somma);		
	}
	
	public static void stampa() {
		System.out.println("Metodo statico");
	}
	
	
	public String colore(String colore) {
		if(colore.trim().equalsIgnoreCase("Giallo")) {
			System.out.println("Procedi Con Cautela");
		}
		else if(colore.trim().equalsIgnoreCase("Rosso")) {
			System.out.println("Fermati!");
		}
		else if (colore.trim().equalsIgnoreCase("Verde")){
			System.out.println("Puoi Procedere");
		}		
		else {
			System.out.println("Scegli un colore fra: Rosso, Giallo o Verde");
		}
		return colore;
	}
}
