package programmi;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Utility utility = new Utility();
		Raccolta raccolta = new Raccolta();
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);		
		boolean flag = true;

		do {
			int scegli = utility.leggiIntero(" 1)  Conta da 1 a 10 \n 2)  Semaforo \n 3)  Valuta il numero maggiore \n 4)  Valuta se il numero è pari o dispari "
					+ "\n 5)  Media aritmetica \n 6)  Valuta il valore massimo di un array \n 7)  Trova il nome corretto da un array di stringhe"
					+ "\n 8)  Stampa solo i valori dispari di un array \n 9)  Conta a ritroso da 10 a 1 (Stampa solo i numeri dispari) \n 10) Conta da N a N"
					+ "\n 11) Stampa le tabelline"
					+ "\n 12) Stampa temperature");			
			switch(scegli) {	
			case 1:
				raccolta.countTen();
				break;
			case 2:
				raccolta.semaforo(input.nextLine());
				break;
			case 3:
				raccolta.maxNum(utility.leggiIntero("Inserisci il primo numero"), utility.leggiIntero("Inserisci il secondo numero"));
				break;
			case 4:
				raccolta.isOdd(utility.leggiIntero("inserisci il numero per controllare se è pari o dispari"));	
				break;
			case 5:
				int[] array1 = new int[utility.leggiIntero("Indica la dimensione dell'array: ")];
				utility.printValueOfArray();
				array1 = utility.fill(array1);
				raccolta.sumAndAverage(array1);				
				break;
			case 6:
				int[] array2 = new int[utility.leggiIntero("Indica la dimensione dell'array: ")];
				utility.printValueOfArray();
				array2 = utility.fill(array2);
				System.out.println("Il numero maggiore è: " + raccolta.maxOfArray(array2));
				break;
			case 7:
				raccolta.lfString(input.nextLine());
				break;
			case 8:
				int[] array3 = new int[utility.leggiIntero("Indica la dimensione dell'array")];
				utility.printValueOfArray();
				array3 = utility.fill(array3);
				System.out.println("I valori dispari dell'array sono: ");
				raccolta.printOdd(array3);
				break;
			case 9:
				raccolta.tenToZero();
				break;
			case 10:
				raccolta.numToNum(utility.leggiIntero("Inserisci il numero di partenza"), utility.leggiIntero("Inserisci il numero di arrivo"));
				break;	
			case 11:
				System.out.println("Stampa matrice");
				raccolta.matrix();
				break;
			case 12:
				System.out.println("Stampa temperature");
				raccolta.temp();
				break;
			default:
				System.out.println("Inserisci un numero fra quelli sopra indicati");				
			}			
			System.out.println("Vuoi tornare al menu? si/no");
			if (!input.nextLine().equalsIgnoreCase("si")) {
				flag = false;
			}
		}while(flag);
	}
}
