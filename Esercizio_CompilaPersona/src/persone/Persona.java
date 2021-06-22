package persone;
import java.util.Scanner;

public class Persona {
	
	public void compilaForm(String[] etichette) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int counter = 0;		
		for (String string : etichette) {
			System.out.print("Inserisci " + etichette[counter]);
			String chiedi = input.nextLine();
			counter++;
			System.out.println(string + chiedi + "\n");
		}
	} 
}
