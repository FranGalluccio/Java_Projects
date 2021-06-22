import java.util.Scanner;

public class Utility {	
	Scanner input = new Scanner(System.in);
	public String leggiStringa(String suggerimento) {
		System.out.println(suggerimento);
		return input.nextLine();
	}
}
