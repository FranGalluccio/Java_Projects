
public class Program {

	public static void main(String[] args) {
		Utility input = new Utility();
		int n1 = Integer.parseInt(input.leggiStringa("Inserisci Primo numero"));
		int n2 = Integer.parseInt(input.leggiStringa("Inserisci Secondo numero"));
		int prodotto = n1*n2;
		
		if((prodotto % 2) == 0) {
			System.out.println("Il numero è pari");
		}
		else {
			System.out.println("Il numero è dispari");
		}		
	}
}
