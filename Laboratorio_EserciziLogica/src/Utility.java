import java.util.Random;
import java.util.Scanner;

public class Utility {	

	Scanner input = new Scanner(System.in);

	public int leggiIntero(String suggerimento) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println(suggerimento);
		return Integer.parseInt(input.nextLine());
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

	public void stampaMaiuscole(String[] stringa) {
		for (String s : stringa) {	
			if(Character.isUpperCase(s.charAt(0))) {
				System.out.println(s.charAt(0));			
			}
		}
	}

	public int maxArray(int arr[]) {	
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];							
		}
		return max;
	}

	public void stampaTriangoloRet() {
		int numeri = 6;
		for(int i=1; i<=numeri; i++)
		{
			for(int j=1 , k = 7; j<=i && k>=i; j++, k--) 			                         
			{
				System.out.print(k + " " + j);
			}		
			System.out.println();
		}
	}

	public void fibonacci() {
		int a = 0;
		int b = 1;

		for (int i = 0; i < 30; i++) {
			int tmp = a;
			a = b;
			b = tmp + b;
			System.out.println(a);
		}	        
	}

	//7)Scrivere un programma MediaMultipliDiTre che calcoli la media di un array di numeri interi, 
	//considerando i soli numeri divisibili per tre

	public void rowSumOddNumbers() {
		int somma = 0;
		int media = 0;
		int[] arr = {1,12,37,30,3,5,6,8,9};
		for (int i = 0; i < arr.length; i++) {
			somma+=arr[i];
			if(arr[i]%3 == 0) {
				media = somma / arr.length;
			}			
		}System.out.println(media);
	}

	//8)Scrivere un programma StampaZigZag che, dato un array di 10 numeri interi contenente valori a piacere, 
	//ne stampa gli elementi secondo il seguente ordine: il primo, l’ultimo, il secondo, il penultimo, il terzo, il terz’ultimo, ecc…

	public void stampaZigZag() {
		int[] num = {1,2,3,4,5,6,7,8,9,10};

		for (int i = 0, j = num.length; i < num.length/2; i++, j--) {
			System.out.println(num[i]);
			System.out.println(" " + j);
		}
	}
	//9)Scrivere un programma che chieda agli utenti due stringhe in ingresso, le stringhe possono valere solo: “carta”, “forbice” o “sasso”. 
	//Il programma dovrà quindi effettuare i dovuti controlli e dichiarare il vincitore secondo le note regole della “morra cinese” (forbice vince su carta, carta vince su sasso, sasso vince su forbice).

	public void cartaForbiciSasso() {

		System.out.println("Scegli fra 'forbici' , 'carta' o 'sasso'");
		String res = input.nextLine();
		if(!(res.equalsIgnoreCase("forbici") || res.equalsIgnoreCase("carta") || res.equalsIgnoreCase("sasso"))) {
			System.out.println("Scegli carta, forbici o sasso");
		} else {
			System.out.println("Hai scelto: " + res);
		}
		String[] arr = {"carta", "forbici", "sasso"};
		Random rand = new Random();
		int sceltaAvv = rand.nextInt(arr.length);		
		
		if(arr[sceltaAvv].equalsIgnoreCase(res)) {
			System.out.println("L'avversario ha scelto: " + arr[sceltaAvv] + " Tu hai scelto: " + res);
			System.out.println("Pari");
		}
		else if(arr[sceltaAvv].equalsIgnoreCase("carta") && res.equalsIgnoreCase("sasso") 
			|| arr[sceltaAvv].equalsIgnoreCase("sasso") && res.equalsIgnoreCase("forbici")
			|| arr[sceltaAvv].equalsIgnoreCase("forbici") && res.equalsIgnoreCase("carta")){
			
			System.out.println("L'avversario ha vinto:( " + arr[sceltaAvv] + " contro " + res);
		} else {
			System.out.println("Hai vinto!! :))) " + arr[sceltaAvv] + " contro " + res);
		}
			
	}
}
