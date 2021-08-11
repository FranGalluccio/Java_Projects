package controller;

import model.Account;
import utility.Crud;
import view.GestoreIO;

public class Avvio {

	public static void main(String[] args) {
		
		boolean exit = true;
		Crud crud = new Crud();
		Account u = null;
		do {
			Integer scelta = GestoreIO.getInstance().readInt("1)Create \n2)Read \n3)ReadList \n4)Delete");
			switch(scelta) {
			case 1:
				u = new Account();
				GestoreIO.getInstance().inserimento(u);
				crud.create(u);
				break;
			case 2:
				GestoreIO.getInstance().schedaUtente(crud.read(GestoreIO.getInstance().readInt("Inserisci l'id della persona da cercare: ")));
				break;
			case 3:
				System.out.println(crud.readList());
				break;
			case 4:
				
				break;
			case 5:
				break;
			}
		} while(exit);
	}
}
