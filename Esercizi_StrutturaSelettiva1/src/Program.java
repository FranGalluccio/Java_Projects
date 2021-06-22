import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		Utility input = new Utility();
		String colore = input.leggiStringa("Inserisci il colore del Semaforo");
		
		if(colore.trim().equalsIgnoreCase("Rosso")){
			System.out.println("ALT");
		}		
		else if (colore.trim().equalsIgnoreCase("Verde")){
			System.out.println("PUOI PROCEDERE");
		}		
		else if (colore.trim().equalsIgnoreCase("Giallo")){
			System.out.println("ATTENZIONE");
		}
		else {
			System.out.println("Inserisci il colore: Giallo, Rosso o Verde");
		}		
	}
}
