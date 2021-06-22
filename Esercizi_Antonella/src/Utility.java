import java.util.Arrays;
import java.util.Scanner;
public class Utility {	
	public static void sum() {
		int[] numbers = {1,2,3,4,5,6,7,8,9};
		int j = 0;
		int somma = 0;	
		int count = 1;
		for (int i = 0; i < numbers.length;i+=2) {
			somma = numbers[i] + numbers[j];
			j++;
			System.out.println("in posizione " + (count++) + " la somma è: "+ somma);
		}
		System.out.println("I valori dell'array sono: " + Arrays.toString(numbers));
	}

	public static void ord() {
		String[] nomi = {"Francesco", "Paolo", "Nicola", "Antonio", "Giovanni"};
		Arrays.sort(nomi);
		for (int i=0; i<nomi.length; i++)
			System.out.println(nomi[i]);		
	}

	public static boolean isPalindroma(String word) {
		boolean palindroma = true;
		int endI = word.length()-1;

		for(int startI = 0; startI < endI; startI++, endI-- ) {
			if(word.charAt(startI) != word.charAt(endI)) {
				palindroma = false;
				break;
			}
		}		
		return palindroma;
	}

	public static String alfabetoWen() {
		char[][] matrix = new char[3][7];
		int counter = 0;
		String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for (int i = 0; i < 3; i++) {
			System.out.println("");
			for (int j = 0; j < 7 ; j++) {
				boolean flag = true;
				do {
					if(alfabeto.charAt(counter) != 74 && alfabeto.charAt(counter) != 75 && alfabeto.charAt(counter) != 87 && alfabeto.charAt(counter) != 88 && alfabeto.charAt(counter) != 89) {
						matrix[i][j] = alfabeto.charAt(counter);
						flag = false;
					} else
						counter++;
				}while(flag);
				counter++;
				System.out.print(matrix[i][j] + " ");				
			}
		}		
		return alfabeto;	
	}

	public void alfaWen() {
		char[][] matrix = new char[3][7];
		int counter = 0;
		String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		alfabeto = alfabeto.replace("J", "");
		alfabeto = alfabeto.replace("K", "");
		alfabeto = alfabeto.replace("W", "");
		alfabeto = alfabeto.replace("X", "");
		alfabeto = alfabeto.replace("Y", "");
		alfabeto = alfabeto.replace("Z", "");
		for (int i = 0; i < 3; i++) {
			System.out.println("");
			for (int j = 0; j < 7; j++) {
				matrix[i][j] = alfabeto.charAt(counter);				
				System.out.print(matrix[i][j] + " ");
				counter++;
			}
		}		
	}

	public static int[] fill(int[] array) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < array.length; i++)
		{			
			if (array[i]<array.length) {								
				array[i] = Integer.parseInt(input.nextLine());				
			}
		}
		return array;
	}

	public static int leggiIntero(String suggerimento) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println(suggerimento);
		return Integer.parseInt(input.nextLine());
	}

	public void stampaString(String[] stringa) {
		for (String string : stringa) {
			System.out.println(string);
		}
	}

	public void charVet(char[] alfabeto) {		
		//A = 65
		//Z = 90
		//M = 77
		char M = 77;
		for (char A = 65; A <= M; A++) {
			if(A <= 76) {
				System.out.print(A + ",");
			}		
		} System.out.print(M + ".");
	}

	public void MeP(char[] alfabeto) {
		char P = 80;
		char M;
		for (M = 77; M < P; M++) {
			System.out.println(M);
		}
	}

	//Tutte le lettere minori o uguali ad M e maggiori o uguali a P
	public void MeP2() {
		//A = 65
		//Z = 90
		//M = 77
		char P = 80;
		char Z = 90;
		for (char A = 65; A <= Z; A++) {
			if(A <= 77 || A == P) {
				System.out.print(A + " ");
			}
		}
	}

	//6)Tutte le lettere comprese negli intervalli seguenti C-G e M-P

	// C=67 G=71 M=77 P=80

	public void stampAlfab() {
		char G = 71;
		char P = 80;		
		for (char C = 67; C <= G; C++) {
			if(C <= G)
				System.out.print(C + " ");	
		} 
		for (char M = 77; M <= P; M++) {
			if(M <= P)
				System.out.print(M + " ");
		}
	}

	public void stampaTriangoloRet() {
		int dimensione = 4;
		for(int colonne=0; colonne<=dimensione; colonne++)
		{
			for(int righe=0; righe<=colonne; righe++) 			                         
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void stampaTriangoloIsoscele() {
		int dimensione = 5;
		for(int colonne=0; colonne<=dimensione; colonne++)
		{
			for(int righe=0; righe<=colonne; righe++) 			                         
			{
				System.out.print('*');
				
			}
			System.out.println("");
		}
		for(int colonne=0; colonne<=dimensione; colonne++)
		{
			for(int righe=4; righe>=colonne; righe--) 			                         
			{
				System.out.print('*');
				
			}
			System.out.println("");
		}
		
	}
	
}





