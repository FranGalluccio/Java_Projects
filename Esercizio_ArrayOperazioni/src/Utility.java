import java.util.Arrays;
import java.util.Scanner;

public class Utility {
	public static int maxOfArray(int arr[])

	{		
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}
	
	public static int minOfArray(int arr[])
	{		
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		return min;
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

	public static void printOdd(int[] arr) {
		int counterDisp = 0;
		int counterPar = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2 != 0) {
				counterDisp++;
			}else if(arr[i]%2 == 0) {
				counterPar++;
			}
		}
		System.out.println("Trovati "+ counterDisp +" numero/i dispari");
		System.out.println("Trovati "+ counterPar +" numero/i pari");
	}

	public static int leggiIntero(String suggerimento) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println(suggerimento);
		return Integer.parseInt(input.nextLine());
	}

	public static int sum(int[] array) {
		int somma = 0;
		for (int i = 0; i < array.length; i++) {
			somma+=array[i];
		}
		return somma;
	}

	public boolean arrCrescente(int arr[])	{		
		boolean risultato = false;

		for (int i = 0; i < arr.length;i++) {
			for (int j = 1; j < arr.length;j++) {
				if(arr[i] > arr[j]) {
					j++; i++;
					 risultato = true;
				}
				else {
					risultato = false;
				}
			}
		}				
		return risultato;
	}	

	public String stringAlContrario(String str) {

		String stringa_originale = str;
		String stringa_invertita = "";
		for (int i = stringa_originale.length() - 1; i >= 0; i--){
			stringa_invertita = stringa_invertita + stringa_originale.charAt(i);
		}
		System.out.println(stringa_invertita);
		return str;
	}
	
	public int[] reverseArr(int[] arr) {
		
		System.out.println("Prima dell'ordinamento: " + Arrays.toString(arr));
		
		for (int i = arr.length-1; i > 0 ; i--) {
			for (int j = 0; j < i ; j++) {
				int tmp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = tmp;
			}
		}
		System.out.println("Dopo l'ordinamento: " + Arrays.toString(arr));
		return arr;
	}
}
