package Controller;

import Model.ModelloScarpe;
import Model.Scarpe;
import Model.ScarpeCrud;
import View.GestoreIO;

public class Avvio {

	public static void main(String[] args) {
		Scarpe s = null;
		ScarpeCrud scrud = new ScarpeCrud();
		boolean exit = false;

		do {
			Integer chose = GestoreIO.getInstance().readInteger("1) Create \n2) Read \n3) Update \n4) Delete \n5) Exit");
			switch(chose) {
			case 1:
				s = new ModelloScarpe();
				GestoreIO.getInstance().insert(s);
				scrud.create(s);
				break;
			case 2:
				GestoreIO.getInstance().search(scrud.readList());
				break;
			case 3:
				GestoreIO.getInstance().update(s);
				break;
			case 4:
				GestoreIO.getInstance().delete(scrud.readList());
				break;
			case 5:
				exit = true;
				break;
			}
		} while(!exit);
	}
}
