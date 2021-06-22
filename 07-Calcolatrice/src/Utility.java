import java.util.Scanner;

public class Utility {

Scanner input = new Scanner(System.in);
	
	String leggiStringa(String suggerimento) {
		System.out.println(suggerimento);
		return input.nextLine();
	}
	//nextLine 
	//1) permette di passare un dato alla console
	//2) ritorna come stringa il dato stesso
	
	int leggiIntero(String suggerimento) {
		System.out.println(suggerimento);
		return Integer.parseInt(input.nextLine());
	}
	
	int somma(int n1, int n2){	
		return n1 + n2;
	}
	
	int sottrazione(int n1, int n2) {
		return n1 - n2;
	}
	int moltiplicazione(int n1, int n2) {
		return n1 * n2;
	}
	double divisione(int n1, int n2) {
		double divisione = (double)n1 / n2;
		return divisione = (double)n1/n2 == 0 ? 0 : divisione;
	}	
	
//	static int typeOf(int input) {
//		return input == String? 0 : input;
//	}
}
