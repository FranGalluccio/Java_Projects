package _Prove;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
	// ATTRIBUTI
	Scanner input = new Scanner(System.in);

	// METODI
	public double divisione(double n1, double n2){	
		double divisione = n1/n2;
		if(divisione != 0) {
			return divisione;
		} else return 0;		
	}

	public String cambiaNome(String nome, String nome2){		
		return nome = nome2;
	}

	public double media(int n1, int n2, int n3){
		return n1 + n2 + n3 / 3;
	}

	public void minMas(int n1, int n2, int n3, int n4, int n5){ 
		int[] array = {n1, n2, n3, n4, n5};
		for (int i=array.length-1; i>0 ; i--)
			for (int j=0; j<i ; j++)
				if (array[j] > array[j+1])
				{
					int tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
				}
		System.out.println(Arrays.toString(array));
		System.out.println("Il minimo è: " + array[0]);
		System.out.println("Il massimo è: " + array[4]);
	}

	public boolean confronto(String n1, String n2){
		for (int i = 0; i < n1.length(); i++) {
			if(n1.equalsIgnoreCase(n2)) {
				return true;			
			}			
		}return false;		
	}

	public int[] ordinamento(int[] array){
		for (int i=array.length-1; i>0 ; i--)
			for (int j=0; j<i ; j++)
				if (array[j] > array[j+1])
				{
					int tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
				}
		return array;
	}

	public int[] creaVet(int[] array) {
		for (int i = 0; i < array.length; i++)
		{			
			if (array[i]<array.length) {								
				array[i] = Integer.parseInt(input.nextLine());				
			}
		}
		return array;
	}
	
	public static int[] fillC(int[] array) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String risposta = input.nextLine();
		for (int i = 0; i < array.length; i++)
		{	
			
			if (array[i]<array.length) {
				do {
				System.out.println("Vuoi inserire un altro valore?");
				if(risposta.equalsIgnoreCase("si"))
				input.nextLine();
				array[i] = Integer.parseInt(input.nextLine());
				}while(!risposta.equalsIgnoreCase("no") || array[i]>=array.length);
			}
		}
		return array;
	}

	public String ritornaStringa(String messaggio) {
		messaggio = "Ciao " + messaggio;
		return messaggio;
	}

	public void stampa(String messaggio) {
		System.out.println(messaggio);
	}

	public int leggiIntero(String suggerimento) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println(suggerimento);
		return Integer.parseInt(input.nextLine());
	}
}
