package view;

import java.util.*;

import model.Account;
import model.Dipendente;


public final class GestoreIO {
	
private static GestoreIO instance = null;
	
	private GestoreIO() {}
	public static GestoreIO getInstance() {
		if(instance == null) {
			instance = new GestoreIO();
		}
		return instance;
	}

	public String readString(String stringa) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println(stringa);
		return input.nextLine();
	}
	public Integer readInt(String stringa) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		Integer readInt = 0;
		boolean flag = true;
		do {
			try {
				flag = false;
				System.out.println(stringa);
				readInt = Integer.parseInt(input.nextLine());
			} catch(NumberFormatException e) {
				flag = true;
				System.out.println("Inserire un valore numerico");
			}
		} while(flag);
		return readInt;
	}
	public Double readDouble(String stringa) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		Double readDouble = 0.0;
		boolean flag = true;
		do {
			try {
				flag = false;
				System.out.println(stringa);
				readDouble = Double.parseDouble(input.nextLine());
			} catch(NumberFormatException e) {
				flag = true;
				System.out.println("Inserire un valore numerico");
			}
		} while(flag);
		return readDouble;
	}
	
	public void inserimento(Account u) {
		//u.setId(readInt("Inserisci l'id: "));
		u.setUsername(readString("Inserisci username: "));
		u.setPassw(readString("Inserisci password: "));
	}
	
	public void searchfor(List<Account> list) {
		Integer id = readInt("inserisci l'id: ");
		boolean trovato = false;
		if(list != null) {
			for(int i = 0; i < list.size(); i++) {
				if(id == list.get(i).getId()) {
					System.out.println(list.get(i).getId());
					trovato = true;
				}
			}
		} if (!trovato) {
			System.out.println("Utente non prensente nel database");
		}
	}
	
	public void schedaUtente(Dipendente d) {
		System.out.println("Utente:\n"+ d.getId() + "\n" + d.getAccount().getUsername() + "\n" + d.getAccount().getPassw() + 
				"\n" + d.getNome() + "\n" + d.getCognome() + "\n" + d.getStipendio() + "\n" + d.getCodice_fiscale());
	}
}
