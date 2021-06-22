import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {
		//1)Ordina in ordine alfabetico i nomi di listaNominativi rispetto la sola iniziale
		//2)Somma a due a due otto interi di un vettore, indicando l'i-esima coppia per ogni somma
		//3)Stampa in una matrice 3x7 l'alfabeto italiano
		//4)Valuta se una frase è palindroma		
		Utility u = new Utility();		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);	
		boolean flag = true;

		do {
			int scegli = Utility.leggiIntero("1)  Ordina i nomi \n2)  Somma del vettore \n3)  Stampa dell'alfabeto"
					+ "\n4)  Controlla se la frase/parola è palindroma \n5)  Stampa stringhe singolarmente \n6)  Stampa alfabeto in verticale"
					+ "\n7)  Stampa da M a O \n8)  Stampa da M, e maggiori o uguali a P \n9)  Stampa da C-G M-P \n10) Stampa un triangolo rettangolo"
					+ "\n11) Stampa triangolo isoscele");
			switch(scegli){
			case 1:
				Utility.ord();
				break;
			case 2:
				Utility.sum();	
				break;
			case 3:
				Utility.alfabetoWen();				
				break;
			case 4:
				System.out.println("Inserire parola da controllare: ");
				String parola = input.nextLine();
				boolean isPalindroma = Utility.isPalindroma(parola);		
				if(isPalindroma){
					System.out.println("La parola '"+parola+"' è Palindroma");			
				}else{
					System.out.println("La parola '"+parola+"' NON è Palindroma");		
				}
				break;
			case 5:
				System.out.println("Inserisci 3 Stringhe");
				String[] string = {input.nextLine(), input.nextLine(), input.nextLine()};
				u.stampaString(string);
				break;
			case 6:
				System.out.println("Stampa alfabeto fino ad M");
				char[] alfabeto = {};				
				u.charVet(alfabeto);
				break;
			case 7:
				System.out.println("Da M a O");
				char[] alfabeto1 = {};
				u.MeP(alfabeto1);
				break;
			case 8:
				System.out.println("Da M e maggiori o uguali a P");
				u.MeP2();
				break;
			case 9:
				System.out.println("Stampa da C-G M-P)");
				u.stampAlfab();
				break;
			case 10:
				System.out.println("Stampa di un triangolo rettangolo");
				u.stampaTriangoloRet();
				break;
			case 11:
				u.stampaTriangoloIsoscele();
				break;		
			default:
				System.out.println("Inserisci uno dei numero sopra indicati");
				break;
			}
			System.out.println("\nVuoi continuare?");
			if (!input.nextLine().equalsIgnoreCase("si")) {
				flag = false;
			}
		}while (flag);
	}	
}
