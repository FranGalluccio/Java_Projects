
public class Cicli {

	public static void main(String[] args) {
		System.out.println("Stampa dei primi 100 numeri primi:");
		int n = 0;
		while(n <= 100)
		{
			System.out.print(n + " ");
			n++;
		}
		
		System.out.println();
		
		System.out.println("Stampa dei primi 100 numeri interi dispari:");
		int n2 = 1;
		while(n2 < 100)
		{
			System.out.print(n2 + " ");
			n2 += 2;
		}
		
		System.out.println();
		
		System.out.println("Stampa dei multipli di un numero");
		 for (int i = 7; i <= 7 * 10; i += 7) {
			System.out.print(i + " ");			
		}
		
		
		
		
		
		
		
		
	}

}
