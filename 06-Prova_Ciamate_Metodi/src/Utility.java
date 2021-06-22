// prende tutto dalla cartella java.util
import java.util.*;

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
		return input.nextInt();
	}
	
}
