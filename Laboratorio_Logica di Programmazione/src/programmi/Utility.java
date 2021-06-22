package programmi;

import java.util.Scanner;

public class Utility {

	Scanner input = new Scanner(System.in);

	public String leggiStringa(String suggerimento) {
		System.out.println(suggerimento);
		return input.nextLine();
	}	

	public int leggiIntero(String suggerimento) {
		System.out.println(suggerimento);
		return Integer.parseInt(input.nextLine());
	}

	public int[] fill(int[] array) {
		for (int i = 0; i < array.length; i++)
		{
			array[i] = Integer.parseInt(input.nextLine());
		}
		return array;
	}
	public void printValueOfArray() {
		System.out.println("Indica i valori (in numeri interi) dell'array");
	}
}
