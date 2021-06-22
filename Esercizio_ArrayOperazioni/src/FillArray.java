import java.util.Arrays;
import java.util.Scanner;

public class FillArray {

	public static void main(String[] args) {
		new Utility();
		Utility u = new Utility();
		try (Scanner input = new Scanner(System.in)) {
			boolean flag = true;	

			System.out.println("******* CREA IL TUO ARRAY *******");
			System.out.println("Inserisci la dimensione dell'array:");
			int[] array = new int[Integer.parseInt(input.nextLine())];
			System.out.println("Inserisci i valori dell'array:");
			Utility.fill(array);

			do {				
				int scegli = Utility.leggiIntero("\n1) Visualizza l'array \n2) Controlla i numeri pari e dispari"
						+ "\n3) Somma i valori del vettore \n4) Controlla il valore massimo"
						+ "\n5) Controlla il valore minimo \n6) Valuta se l'array è ordinato in modo crescente \n7) Stampa l'array in modo inverso \n8) **Bonus** String");	
				switch(scegli) {
				case 1:
					System.out.println("I valori dell'array sono: "+ Arrays.toString(array));
					break;
				case 2:
					Utility.printOdd(array);
					break;
				case 3:				
					System.out.println("La somma è: " + Utility.sum(array));
					break;
				case 4:
					System.out.println("Il valore massimo è: " + Utility.maxOfArray(array));
					break;
				case 5:
					System.out.println("Il valore minimo è: " + Utility.minOfArray(array));
					break;
				case 6:
					System.out.println("Valuta se l'array è ordinato in modo crescente:");	
					if(u.arrCrescente(array) == true) {
						System.out.println("L'array è ordinato in modo crescente");
					}
					else {
						System.out.println("L'array non è ordinato in modo crescente");
					}
					break;
				case 7:
					System.out.println("Array visualizzato in modo inverso");
					array = u.reverseArr(array);
					break;
				case 8:
					System.out.println("Inserisci la frase:");
					String stringa = input.nextLine();
					stringa = u.stringAlContrario(stringa);
					break;
				default:
					System.out.println("Inserisci un numero da 1 a 5");					
				}
				System.out.println("Vuoi eseguire un operazione sull'array? si/no");
				if (!input.nextLine().equalsIgnoreCase("si")) {
					flag = false;
				}
			}while(flag);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


