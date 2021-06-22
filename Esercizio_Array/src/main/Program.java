package main;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		int[] array2 = {5,6,7,8,9};
		array2[2] = 5;
		//System.out.println(array2[2]);

//		il ciclo for conta di 4:
//		step 1: inizializzo un contatore
//		step 2: verifico la condizione
//		step 3: lettura dell'algoritmo presente nel for
//		step 4: il contatore viene incrementato di 1
//		for (int i = 0; i < array2.length; i++) {
//			System.out.println(array2[i]);
//		}
		
		Scanner input = new Scanner(System.in);
		System.out.println("Scegli la dimensione dell'array");		
		int value = Integer.parseInt(input.nextLine());	
		int[] array = new int[value];		
			for (int i = 0; i < value; i++)
			{		
				System.out.println("Inserisci il " + (i+1) +"°" + " valore" );		
				array[i] = Integer.parseInt(input.nextLine());				
			}		
		System.out.println("La dimensione dell'array è di: " + value );
		System.out.print("Valori dell'array: " );
		for (int i = 0; i < value; i++) {
			System.out.print(array[i] + " ");
		}
	}	
}
