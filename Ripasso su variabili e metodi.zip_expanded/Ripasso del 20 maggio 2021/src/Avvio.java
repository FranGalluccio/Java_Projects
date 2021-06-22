import java.util.Scanner;

public class Avvio {

	
	public static void main(String[] args) {
		
		//Creo l'indirizzo di memoria dell'ambasciatore della classe ClasseSupporto
		//Tale indirizzo lo conservo in una scatola che identifico come "cs"
		ClasseSupporto cs = new ClasseSupporto();
		
		//Oggettino di tipi Scanner
		Scanner input = new Scanner(System.in);
		
		//Visualizzo il contenuto della scatola identificata come "cs":
		//System.out.println("Indirizzo di memoria: "+cs); //col println visualizzo quello che c'è all'interno di "cs"
		
		
		//CHIAMATA dei metodi della classe: ClasseSupporto
		//1)Metodo void senza argomenti
		cs.metodo1();
		
		//2)Metodo void con un argomento
		String messaggio1 = "Ciao dal metodo 2!";
		
		System.out.println("Inserisci un messaggio al metodo 2:");
		String messaggio2 = input.nextLine();
		
		//Caso 1
		cs.metodo2(messaggio1);
		
		//Caso 2
		cs.metodo2(messaggio2);
		
		//Caso 3
		cs.metodo2("Ciao dal metodo 2!");
		
		//Caso 4
		System.out.println("Inserisci un messaggio al metodo 2:");
		cs.metodo2(input.nextLine());
		
		//3)Metodo void con due argomenti
		cs.metodo3("Ciao dal", "metodo3()");
		
		//4)Metodo con tipo di ritorno int con due argomenti diversi
		int numero = cs.metodo4("Ciao dal metodo4()\n", 5);
		System.out.println(numero);
		
		System.out.println(cs.metodo4("Il metodo diventa il numero: ", 18));
		
		//5)Metodo con tipo di ritorno int con due argomenti diversi e struttura condizionale
		System.out.println(cs.verificaLunghezzaUsername("ug"));
		System.out.println(cs.verificaLunghezzaUsername("ugolinougolinolino"));
		System.out.println(cs.verificaLunghezzaUsername("ugo"));
		
		//Metodi che giocano con l'uppercase ed il lowercase
		cs.capsString1("pippooooooo!!!");
		
		System.out.println(cs.capsString2("peppeeeeeeeeee!!!"));
		
		cs.reduxString("GELTRUDEEE!!!");
		
		cs.reduxString(cs.capsString2("ugoooooooooooo!!!"));
		
		//Metodo che pulisce le stringhe dagli spazi agli estremi
		cs.pulisciEstremi(" Ciao Emma,come va?  ", "  Todos bien, gracias!!! ");
		
		//Metodo che ripulisce da tutti gli spazi
		cs.signoraErmelindaPulisciTutto("  ciao Valentinaaaa, baci da Emma ehyla!!!!  ");
		
		//Metodo che sostituisce un carattere con un altro
		cs.changeCarattere("Emma", 'm', 'b');
		
		System.out.println("Scegli il carattere da sostituire:");
		char c1 = input.nextLine().charAt(0);
		System.out.println("Scegli il carattere sostituto:");
		char c2 = input.nextLine().charAt(0);
		cs.changeCarattere("Fabiano", c1, c2);
	}

}
