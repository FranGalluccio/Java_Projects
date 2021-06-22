import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {
		// swap con un vettore di stringhe
		// swap con vettore di interi
		// modifica con gli interi
		// modifica con le stringhe
		Utility u = new Utility();
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		do {
			int scegli = u.leggiIntero("1) Swap con un vettore di stringhe \n2) Swap con vettore di interi \n3) Modifica con gli interi "
					+ "\n4) Cerca vocali \n5) Rimpiazza la parola \n6) Conta delle stringhe");			
			switch(scegli) {
			case 1:
				System.out.println("Scegli le stringhe");
				String[]stringa = {input.nextLine(), input.nextLine()};	
				System.out.println("Prima della modifica: " + stringa[0] +" "+ stringa[1]);
				stringa = u.swapString(stringa);
				System.out.println("Dopo la modifica: " + stringa[0] +" "+ stringa[1]);
				break;
			case 2:
				System.out.println("Inserisci 2 valori");
				int[] array = {Integer.parseInt(input.nextLine()),Integer.parseInt(input.nextLine())};
				System.out.println("Prima della modifica: "+ array[0]+" "+array[1] );
				array = u.swapInt(array);
				System.out.println("Dopo la modifica: "+array[0] +" "+ array[1]);				
				break;
			case 3:
				System.out.println("Scegli due numeri da invertire");
				Integer n1 = Integer.parseInt(input.nextLine());
				Integer n2 = Integer.parseInt(input.nextLine());
				System.out.println("Prima dello scambio: " + n1 + " " + n2);
				u.swapN(n1, n2);
				break;				
			case 4:
				System.out.println("Inserisci la frase da controllare: ");
				String frase = input.nextLine();
				char a = 'a'; char e = 'e'; char i = 'i'; char o = 'o'; char uu = 'u';
				u.conta(frase, a);
				u.conta(frase, e);
				u.conta(frase, i);
				u.conta(frase, o);
				u.conta(frase, uu);			
				break;
			case 5:
				System.out.println("Inserisci la frase:");
				String frase1 = input.nextLine();
				System.out.println("Scegli prima la frase o parola da rimpiazzare, poi scegli la nuova:  ");
				System.out.println(frase1.replaceAll(input.nextLine(), input.nextLine()));				
				break;
			case 6:
				System.out.println("Inserisci la frase: ");
				String frase2 = input.nextLine();
				u.conta2(frase2);
				break;
			default:
				System.out.println("Inserisci un numero fra quelli sopra indicati");
				break;
			}
			System.out.println("\nVuoi tornare al menu? si/no");
			if (!input.nextLine().equalsIgnoreCase("si")) {
				flag = false;
			}
		}while(flag);
	}	
}
