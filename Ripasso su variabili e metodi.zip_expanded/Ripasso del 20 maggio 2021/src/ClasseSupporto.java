
public class ClasseSupporto {

	//DICHIARAZIONE DEI METODI DELLA CLASSE: ClasseSupporto
	//1)Metodo void senza argomenti
	public void metodo1() {
		System.out.println("Metodo 1 chiamato!");
	}

	//2)Metodo void con un argomento
	public void metodo2(String messaggio) {
		System.out.println(messaggio);
	}

	//3)Metodo void con due argomenti
	public void metodo3(String messaggioParte1, String messaggioParte2) {
		System.out.println(messaggioParte1+" "+messaggioParte2);
	}

	//4)Metodo con tipo di ritorno int con due argomenti diversi
	public int metodo4(String messaggio, int numero) {
		System.out.print(messaggio);
		return numero;
	}

	//5)Metodo con tipo di ritorno int con due argomenti diversi e struttura condizionale
	public String verificaLunghezzaUsername(String username) {
		//Ammettiamo di accettare solo gli user maggiori di 2 caratteri e minori di 12
		if(username.length()>=3 && username.length()<=12) {
			return "L'username inserito è compatibile con i nostri criteri";
		}
		else {
			return "Attento!!! L'username deve essere compreso tra 3 e 12 caratteri";
		}
	}

	//6)Metodo void che rende in capslock le stringhe in ingresso
	public void capsString1(String stringa) {
		System.out.println(stringa.toUpperCase());
	}

	//7)Metodo con tipo di ritorno String che rende in capslock le stringhe in ingresso
	public String capsString2(String stringa) {
		return stringa.toUpperCase();
	}
	
	//8)Metodo void che riduce in minuscolo i caratteri di una stringa
	public void reduxString(String stringa) {
		System.out.println(stringa.toLowerCase());
	}
	
	//9)Metodo che pulisce le stringhe dagli spazi agli estremi
	public void pulisciEstremi(String s1, String s2) {
		System.out.println("Prima del trim:***"+s1+"***");
		System.out.println("Prima del trim:***"+s2+"***");
		System.out.println("Dopo il trim:***"+s1.trim()+"***");
		System.out.println("Dopo il trim:***"+s2.trim()+"***");
	}
	
	//10)Metodo che elimina tutti gli spazi
	public void signoraErmelindaPulisciTutto(String stringaDaRipulire) {
		System.out.println("Stringa ripulita: "+stringaDaRipulire.replaceAll(" ", ""));
	}
	
	//11)Metodo che sostituisce un carattere con un altro
	public void changeCarattere(String s, char c1, char c2) {
		System.out.println("Prima del cambio: "+s);
		System.out.println("Dopo il cambio: "+s.replace(c1, c2));
	}



}
