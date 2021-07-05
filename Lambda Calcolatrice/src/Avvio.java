import java.util.Comparator;
import java.util.Scanner;

public class Avvio {

	public static void main(String[] args) {

		boolean exit = true;
		do {
			Integer scelta = GestoreIO.getInstance().leggiInt("1)Somma \n2)Sottrazione \n3)Moltiplicazione \n4)Divisione \n5)Exit");
			switch (scelta) {
			case 1:
				IOperazione somma = (n1, n2) -> n1 + n2;
				System.out.println(somma.operazione(GestoreIO.getInstance().leggiDouble("Inserire il primo numero: "), 
						GestoreIO.getInstance().leggiDouble("Inserire il secondo numero: ")));
				break;
			case 2:
				IOperazione sottrazione = (n1, n2) -> n1 - n2;
				System.out.println(sottrazione.operazione(GestoreIO.getInstance().leggiDouble("Inserire il primo numero: "), 
						GestoreIO.getInstance().leggiDouble("Inserire il secondo numero: ")));
				break;
			case 3:
				IOperazione moltiplicazione = (n1, n2) -> n1 * n2;
				System.out.println(moltiplicazione.operazione(GestoreIO.getInstance().leggiDouble("Inserire il primo numero: "), 
						GestoreIO.getInstance().leggiDouble("Inserire il secondo numero: ")));
				break;
			case 5:
				exit = false;
				break;
			default:
				System.out.println("Inserire un numero compreso nel menù");
				break;
			}

			
		} while(exit);
//		
//		
//		Comparator<String> stringa = (String a, String b) -> a.length() > b.length()? 1 : 0 ;
//		if(stringa.compare("Mario", "Anna") == 1) {
//			System.out.println("La prima parola è maggiore della seconda");
//		} else {
//			System.out.println("La seconda parola è maggiore della prima");
//		}
//		Scanner input = new Scanner(System.in);
//		System.out.println("CONFRONTA LA LUNGHEZZA DI DUE PAROLE");
//		System.out.println("Inserire la prima parola");
//		String a = input.nextLine();
//		System.out.println("Inserire la seconda parola");
//		String b = input.nextLine();
//		String result = a.length() > b.length() ? a + " è più lunga di " + b : b + " è più lunga di " + a;
//		System.out.println(result);
	}
}
