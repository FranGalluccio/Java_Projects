import java.util.Scanner;

public class Utility {
	public String leggiStringa(String stringa) {
		Scanner input = new Scanner(System.in);
		System.out.println(stringa);
		return input.nextLine();
	}
}
