package _Prove;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

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
		int somma = n1 + n2 + n3;
		return somma  / 3;
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
			if(n1.charAt(0) == n2.charAt(0)) {
				return true;
			}
		} return false;

		
	}

	public int[] ordinamento(int[] vet){
		return vet;
	}

	public static int[] creaVet(int[] array) {
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

	public String ritornaStringa(String messaggio) {
		messaggio = "Ciao " + messaggio;
		return messaggio;
	}


	public void stampa(String messaggio) {
		System.out.println(messaggio);
	}
	
	public static int leggiIntero(String suggerimento) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println(suggerimento);
		return Integer.parseInt(input.nextLine());
	}
}
