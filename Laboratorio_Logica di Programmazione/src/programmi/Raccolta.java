package programmi;
import java.util.Random;

public class Raccolta {
	Utility utility = new Utility();

	//semaforo
	public void semaforo(String colore) {
		if(colore.trim().equalsIgnoreCase("verde")) {
			System.out.println("Puoi passare");
		}
		else if(colore.trim().equalsIgnoreCase("giallo")) {
			System.out.println("Procedi con cautela");
		}
		else {
			System.out.println("ALT!");
		}
	}

	//calcola il massimo fra 2 numeri
	public void maxNum(int num1, int num2) {		
		System.out.println(num1>num2? num1 + " è maggiore di " + num2 : num2 + " è maggiore di " + num1);		
		//		if(num1>num2) 
		//			System.out.println(num1 + " è maggiore di " + num2);		
		//		else if(num1<num2) 
		//			System.out.println(num1 + " è minore di " + num2);		
		//		else System.out.println(num2 + " è uguale a " + num1);
	}

	// conta da 1 a 10
	public int countTen() {
		int counter;
		for (counter = 1; counter <= 10; counter++) {
			System.out.println(counter);
		}
		return counter;
	}

	//controllo numeri dispari
	public void isOdd(int num) {		
		System.out.println(num%2==0? "Pari" : "Dispari");
		//		if((num%2)==0) {				
		//			System.out.println("Pari");			
		//		}
		//		else {				
		//			System.out.println("dispari");			
		//		}
	}

	//la somma e la media aritmetica dei numeri di un vettore di int
	public void sumAndAverage(int[] arr) {
		int sum = 0;
		int i;
		for (i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}			
		System.out.println("La somma è: " + sum);
		System.out.println("la media è: " + sum/i);
	}

	//trova il numero maggiore in un array di int
	public int maxOfArray(int arr[])
	{		
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}

	//cerca il nome pippo, se non è presente... mi disp.
	public void lfString(String lfName) {
		int i;
		String[] name = {"pippo", "pluto", "paperino"};

		for (i = 0; i < name.length;i++) {
			if(name[i].equalsIgnoreCase(lfName)) {
				System.out.println("hai indovinato!!!");				
				break;
			}		
		}	
		if(i == name.length) {
			System.out.println("non hai trovato il nome");
		}
	}

	//stampa i numeri dispari di un array
	public void printOdd(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2 != 0) {
				System.out.println(arr[i]);
			}
		}		
	}

	//conta da 10 a 0
	public void tenToZero() {
		for (int i = 10; i > 0 ; i--) {
			System.out.println(i);
		}
	}

	public void numToNum(int num1, int num2) { 
		if(num1>num2) {
			for (int i = num1; i >= num2; i--) {
				System.out.println(i);
			}			
		}
		else if(num1<num2) {			
			for (int i = num1; i <= num2; i++) {
				System.out.println(i);
			}
		}else System.out.println(num1 + " è uguale a " + num2);
	}

	public void matrix() {
		int col = 0;
		int righe = 2;
		int tab[] = new int[10];

		while (righe<=10)
		{
			for (int i=0;i<tab.length;i++)
			{
				col=col+righe;
				tab[i]=col;
				System.out.print(tab[i] + " ");
			}
			righe++;
			col=0;
			System.out.println();
		}
	}

	public void temp() {
		String[] orari = {"Giorni", "\th:00-06", "\th:06-12","\th:12-18", "\th:18-24"};
		String[] temp = {"Lun", "Mar", "Mer", "Giov", "Ven", "Sab", "Dom"};
		Random rand = new Random();

		for (int i = 0; i <orari.length; i++) {	
			System.out.print(orari[i]);
		}
		System.out.println();
		for (int j = 0; j < temp.length; j++) {
			System.out.println(temp[j] + "\t" + rand.nextInt(1*35)+'°' + "\t" + rand.nextInt(1*35)+'°' + "\t" + rand.nextInt(1*35)+'°' + "\t" + rand.nextInt(1*35)+'°');
		}
	}
}

