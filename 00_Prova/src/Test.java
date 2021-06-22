import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test {
	Scanner input = new Scanner(System.in);

	public void cartaForbiciSasso() {
		
		String[] scelta = {"carta", "forbici", "sasso"};
		
		System.out.println("Scegli fra: carta, forbici o sasso: ");
		String res = input.nextLine();
		
		Random rand = new Random();
		int sceltaAvv = rand.nextInt(scelta.length);
		
		System.out.println("Hai scelto: " + res);
		System.out.println("L'avversario ha scelto: " + scelta[sceltaAvv]);
		
		if(scelta[sceltaAvv].equalsIgnoreCase(res)) {
			System.out.println("Patta");
		}
		else if(scelta[sceltaAvv].equalsIgnoreCase("carta") && res.equalsIgnoreCase("sasso")
				|| scelta[sceltaAvv].equalsIgnoreCase("forbici") && res.equalsIgnoreCase("carta")
				|| scelta[sceltaAvv].equalsIgnoreCase("sasso") && res.equalsIgnoreCase("forbici")) {
			
			System.out.println("Hai perso :(");			
		}
		else {
			System.out.println("Hai vinto :)");
		}
		
		
	}
	

	public int votoStudente(int votoScritto , int votoOrale) {
		if((votoScritto > 8) || (votoScritto < -8) || (votoOrale < 0) || (votoOrale > 24)) {
			System.out.println("Inserire un valore compreso fra -8/8 per lo scritto e 0/24 per l'orale");
		}
		else {
			return votoScritto + votoOrale;
		}

		return votoScritto + votoOrale;
	}

	public void votiEsame() {
		Test test = new Test();
		@SuppressWarnings("unused")
		boolean flag = false;
		do {
			System.out.println("Inserisci il voto dello prova scritta, e la prova pratica");
			int totvoti = test.votoStudente(Integer.parseInt(input.nextLine()),Integer.parseInt(input.nextLine()));
			if(totvoti > 32 || totvoti < -8) {
				System.out.println();
			}
			else if(totvoti > 18) {
				System.out.println("Hai superato l'esame con voto: " + totvoti);
				if(totvoti > 30 && totvoti <=32) {
					System.out.println("Complimenti, 30 e lode!");
				}
			}
			else {
				System.out.println("Non hai superato l'esame");
			}
			System.out.println("Vuoi ripetere l'operazione? si/no");
			String res = input.nextLine();
			if(res.equalsIgnoreCase("si"))
				flag = true;
			else 
				flag = false;
		}while(flag = true);
	}

	public int[] fillArray() {

		int[] arr = {7,2,76,452,5};
		return arr;
	}
	// 
	public void trovaMaxMin(int[] arr) {
		int max = 0;
		int min = 0;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			else {
				min = arr[i];
			}
		}
		System.out.println("il valore massimo è: " + max);
		System.out.println("Il valore minimo è: " + min);
	}

	public void conta() {
		for (int i = 11; i > 0 ; i-=3) {
			System.out.println(i);
		}
	}

	public void contaDispari(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2 != 0)
				System.out.print(arr[i] + " ");
		}

	}

	public void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println("Valore min: " + arr[0] + " Valore max: " + arr[arr.length-1]);
		System.out.println(Arrays.toString(arr));
	}

	public void tabelline() {

		System.out.println("Inserire un numero: ");
		int n = Integer.parseInt(input.nextLine());
		for (int i = 1; i < 10; i++) {
			int moltiplicazione = n*i;
			System.out.println(n + " x " + i + " = " +moltiplicazione);
		}		
	}

	public void potenze() {

		System.out.println("Inserire un numero per elevarlo a potenza: ");
		int pow = 1;
		int n = Integer.parseInt(input.nextLine());
		for (int i = 0; i < 10 ; i++) {
			pow = pow * n;			
			System.out.println("La potenza " + (i) + "esima" + " di " + n + " è " + pow);
		}

	}

	public void minMax(int[] arr) {
		int max = 0;
		int min = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
			else
				min = arr[i];
		}
		System.out.println("Valore max: " + max + " Valore min: " + min);
	}

	public void sommaMultipli() {

		int somma = 0;
		for (int i = 1; i < 400; i++) {
			if(somma<1000)
				somma  = 3 * i;
		}
		System.out.println(somma);
	}

	public void fibonacci() {
		int n1 = 0;
		int n2 = 1;	
		for (int i = 0; i < 40; i++) {			

			int temp = n1; // mi salvo la variabile n1
			n1 = n2;       // assegno ad n1 il valore di n2
			n2 = temp + n2;// n2 prende il valore di n1 dalla var di appoggio + se stessa
			System.out.println(temp);
		}
	}

	public void selectionSort() {
		int[] array = {6,5,23,12,43,2};
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i] > array[j]) {
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		} 
		System.out.println(Arrays.toString(array));
		System.out.println("Val min: "+ array[0] + " Val max: " + array[array.length-1] );
	}

	public void minMax() {
		int[] array = {6,5,23,12,43,2};
		int max = array[0];
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
			else {
				min = array[i];
			}

		}
		System.out.println("Val max: " + max + " Val min: " + min);
	}

	public void bubbleSort() {
		int[] array = {6,5,23,12,43,2};		
		for (int i = array.length-1; i > 0 ; i--) {
			for (int j = 0; j < i; j++) {
				if(array[j] < array[i]) {
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		System.out.println("val max: " + array[0] + " val min; " + array[array.length-1]);
		System.out.println(Arrays.toString(array));
	}

	public void stampaContrario() {

		String str = "Ciao";
		for (int i = str.length()-1; i >= 0; i--) {
			System.out.print(str.toCharArray()[i]);
		}
	}

	public void stampaMaiuscole() {

		String str = "Ciao Mondo come va Oggi?";
		for (int i = 0; i < str.length()-1; i++) {
			if(Character.isUpperCase(str.toCharArray()[i])) {
				System.out.println(str.toCharArray()[i]);
			}
		}
	}

	public void sommaDisp() {
		int[] arr = {13,3,12,24,5,8};
		int somma = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2 != 0)
				somma+=arr[i];
		} System.out.println(somma);
	} 

	public void triangIso() {
		for (int i = 0; i < 7; i++) {
			System.out.println();
			for (int j = 1; j < i; j++) {
				System.out.print(j);
			}
		}
		for (int i = 7; i > 0; i--) {
			System.out.println();
			for (int j = i; j > 0; j--) {
				System.out.print(j);
			}
		}
	}
	
	public void selectSort() {
		
		int[] arr = {3,1,4,12,5,23,27,15,19};
		System.out.println("Prima dell'ordinamento: " +  Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] >  arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		} 
		System.out.println("Dopo l'ordinamento: " + Arrays.toString(arr));
		System.out.println("Val max: " + arr[arr.length-1] + " Val min: " + arr[0]);
	}
	
	public void bubbleSort1() {
		int[] arr = {3,1,4,12,5,23,27,15,19};
		
		for (int i = arr.length-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if(arr[i] >  arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		} 
		System.out.println("Dopo l'ordinamento: " + Arrays.toString(arr));
		System.out.println("Val max: " + arr[0] + " Val min: " + arr[arr.length-1]);
	} 

}
