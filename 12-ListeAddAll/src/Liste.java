import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Liste {

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<>();
		
		//aggiunge gli elementi dalla prima posizione
		lista.addAll(Arrays.asList(2, 7, 11));

		System.out.println(lista); // [2, 7, 11]

		//aggiunge gli elementi in lista
		lista.addAll(3, Arrays.asList(77,88));
		
		//setta il contenuto della lista		
		lista.set(0, 55);
		
		
		System.out.println(lista); // [55, 7, 11, 77, 88]		
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il numero da cercare:");
		do{	
		if (lista.contains(Integer.parseInt(input.next()))) 
		{		
			System.out.println("E' Contenuto");
		}
		else 
		{
			System.out.println("Non E' Contenuto, Riprova...");
		}
		}while(!lista.contains(Integer.parseInt(input.next())));
	}
}