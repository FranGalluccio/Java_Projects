package _Prove;
import java.util.Arrays;
import java.util.Scanner;

public class controller {
	public static void main(String[] args) {

		Test t = new Test();
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);	
		boolean flag = true;
		
		do {
			int scegli = t.leggiIntero("1) Divisione fra 2 interi \n2) Scambia i nomi \n3) Stampa dell'alfabeto"
					+ "\n4) Valore minimo e valore massimo \n5) Confronta 2 stringhe \n6) Crea un array \n7) Ordinamento dell'array");
			switch(scegli){
			case 1:
				System.out.println("Divisione fra 2 interi");
				double divisione = t.divisione(Double.parseDouble(input.nextLine()), Double.parseDouble(input.nextLine()));
				if(divisione != 0)
				System.out.println("Risultato: "+divisione);
				else
					System.out.println("Inserisci valori diversi da 0");
				break;
			case 2:
				System.out.println("Scambia i nomi");
				String scambia = t.cambiaNome(input.nextLine(), input.nextLine());
				System.out.println(scambia);
				break;
			case 3:
				System.out.println("Somma e media di 3 numeri interi: ");
				System.out.println("Inserisci i 3 valori: ");
				double sommaeMedia = t.media(Integer.parseInt(input.nextLine()),Integer.parseInt(input.nextLine()),Integer.parseInt(input.nextLine()));
				System.out.println(sommaeMedia);
				break;
			case 4:
				System.out.println("Ordina i numeri dal più piccolo al più grande");
				System.out.println("Inserisci 5 valori");
				t.minMas(Integer.parseInt(input.nextLine()), Integer.parseInt(input.nextLine()), Integer.parseInt(input.nextLine()), Integer.parseInt(input.nextLine()), Integer.parseInt(input.nextLine()));
				break;
			case 5:
				System.out.println("Inserisci le due stringhe");
				boolean confronto = t.confronto(input.nextLine(), input.nextLine());
				if(confronto)
					System.out.println("Sono uguali");
				else
					System.out.println("Sono diversi");				
				break;
			case 6:
				System.out.println("Crea un array");
				System.out.println("Inserisci la dimensione dell'array:");
				int[] array = new int[Integer.parseInt(input.nextLine())];
				System.out.println("Inserisci i valori dell'array");
				Test.fillC(array);
				System.out.println("Il tuo array: " + Arrays.toString(array));
				break;
			case 7:
			System.out.println("Ordinamento dell'array");
			System.out.println("Inserisci 4 valori interi:");
			int[] array2 = {Integer.parseInt(input.nextLine()), Integer.parseInt(input.nextLine()),Integer.parseInt(input.nextLine()), Integer.parseInt(input.nextLine())};
			System.out.println("Prima dell'ordinamento: " + Arrays.toString(array2));
			array2 = t.ordinamento(array2);
			System.out.println("Dopo l'ordinamento: " + Arrays.toString(array2));
				break;
			default:
				System.out.println("Inserisci uno dei numero sopra indicati");
				break;
			}
			System.out.println("\nVuoi continuare?");
			if (!input.nextLine().equalsIgnoreCase("si")) {
				flag = false;
			}
		}while (flag);
	}
}









