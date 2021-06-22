import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {
		new Utility();
		Utility u = new Utility();
		try (Scanner input = new Scanner(System.in)) {
			boolean flag = true;	
			
			

			do {				
				int scegli = u.leggiIntero("1) Stampa la stringa al contratrio \n2) Stampa le iniziali Maiuscole"
						+ "\n3) Massimo valore di un array \n4) Stampa numeri triangolo "
						+ "\n5) Serie di fibonacci  \n6) Somma numeri dispari \n7) Stampa dei numeri a ZiaZag 3  \n8) carta/sasso/forbici ");	
				switch(scegli) {
				case 1:
					System.out.println("Inserisci la parola: ");
					String stringa = input.nextLine();
					u.stringAlContrario(stringa);
					break;
				case 2:
					System.out.println("Inserisci 2 stringhe ");					
					String[] stringa2 = new String[2];
					System.out.println("Inserisci la prima stringa: ");
					stringa2[0] = input.nextLine();
					System.out.println("Inserisci la seconda stringa: ");
					stringa2[1] = input.nextLine();
					u.stampaMaiuscole(stringa2);					
					break;
				case 3:	
					int[] array = {99, 66, 5};					
					System.out.println(u.maxArray(array) + " è il maggiore");	
					break;
				case 4:
					System.out.println("Stampa numeri con triangoli");
					u.stampaTriangoloRet();
					break;
				case 5:
					System.out.println("Serie di fibonacci:");
					u.fibonacci();
					break;
				case 6:
					u.rowSumOddNumbers();
					break;
				case 7:
					u.stampaZigZag();
					break;
				case 8:
					System.out.println("Morra cinese");
					u.cartaForbiciSasso();
					break;
				default:
					System.out.println("Inserisci un numero valido");					
				}
				System.out.println("Vuoi continuare? si/no");
				if (!input.nextLine().equalsIgnoreCase("si")) {
					flag = false;
				}
			}while(flag);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
