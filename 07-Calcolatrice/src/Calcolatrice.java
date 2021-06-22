public class Calcolatrice {

	public static void main(String[] args) {

		Utility u = new Utility();
		//		int scelta = u.leggiIntero(" 1) Addizione \n 2) Sottrazione \n 3) Moltiplicazione \n 4) Divisione");
		//		
		//		if(scelta == 1) {
		//			System.out.println("Addizione");
		//			System.out.println(u.somma(u.leggiIntero("Inserisci il primo numero"), u.leggiIntero("Inserisci il secondo numero")));
		//			
		//		}
		//		else if(scelta == 2) {
		//			System.out.println("Sottrazione");
		//			System.out.println(u.sottrazione(u.leggiIntero("Inserisci il primo numero"), u.leggiIntero("Inserisci il secondo numero")));
		//		}		
		//		else if(scelta == 3) {
		//			System.out.println("Moltiplicazione");
		//			System.out.println(u.moltiplicazione(u.leggiIntero("Inserisci il primo numero"), u.leggiIntero("Inserisci il secondo numero")));
		//		}
		//		else if(scelta == 4) {
		//			System.out.println("Divisione");
		//			System.out.println(u.divisione(u.leggiIntero("Inserisci il primo numero"), u.leggiIntero("Inserisci il secondo numero")));
		//		}

		do {			
			int scelta = u.leggiIntero(" 1) Addizione \n 2) Sottrazione \n 3) Moltiplicazione \n 4) Divisione \n 5) Exit");
			boolean sceltaCorretta = (scelta == 1) || (scelta == 2) || (scelta == 3) || (scelta == 4) || (scelta == 5);

			if(sceltaCorretta)
				switch(scelta) {
				case 1:
					System.out.println("Addizione");
					System.out.println(u.somma(u.leggiIntero("Inserisci il primo numero"), u.leggiIntero("Inserisci il secondo numero")));			
					break;
				case 2: 
					System.out.println("Sottrazione");
					System.out.println(u.sottrazione(u.leggiIntero("Inserisci il primo numero"), u.leggiIntero("Inserisci il secondo numero")));
					break;	
				case 3:
					System.out.println("Moltiplicazione");
					System.out.println(u.moltiplicazione(u.leggiIntero("Inserisci il primo numero"), u.leggiIntero("Inserisci il secondo numero")));
					break;
				case 4:
					System.out.println("Divisione");
					System.out.println(u.divisione(u.leggiIntero("Inserisci il primo numero"), u.leggiIntero("Inserisci il secondo numero")));
					break;
				case 5:
					System.out.println("Grazie per aver usato la calcolatrice, alla prossima!");
					break;
				default:
					System.out.println("Inserisci un numero da 1 a 4");
					break;
				}
			else {
				System.out.println("Inserisci un numero valido");
			}
			System.out.println("Digita 5 per uscire, un qualsiasi altro numero e invio per continuare");
		}while(u.leggiIntero("") != 5);		
	}
}
