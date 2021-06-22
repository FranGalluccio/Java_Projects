package persone;

import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		Persona persona = new Persona();
		String risposta = "si";
		String[] etichette = {"Nome: ", "Cognome: ", "Data di nascita: ", "Sesso: "};
		do {
		System.out.println("*********** Compila il form ***********\n");		
		persona.compilaForm(etichette);	
		System.out.println("Vuoi inserire una nuova persona? si/no");
		input.nextLine();		
		}while(risposta.equalsIgnoreCase("si"));
	}
}
