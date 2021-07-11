package View;

import java.util.ArrayList;
import java.util.Scanner;

import Model.ModelloScarpe;
import Model.Scarpe;
import Model.ScarpeCrud;

//Singleton class
public class GestoreIO {
	private static GestoreIO instance = null;
	ScarpeCrud scrud = new ScarpeCrud();

	private GestoreIO() {}

	public static GestoreIO getInstance() {
		if(instance == null)
			instance = new GestoreIO();
		return instance;
	}
	public String readString(String strings) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println(strings);
		return input.nextLine();
	}
	public Double readDouble(String strings) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		Double doubleInput = 0.0;
		do {
			try {
				flag = false;
				System.out.println(strings);
				doubleInput = Double.parseDouble(input.nextLine());
			} catch(NumberFormatException e) {
				System.out.println("Insert a number");
			}
		}while(flag);
		return doubleInput;
	}
	public Integer readInteger(String strings) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		Integer intInput = 0;
		do {
			try {
				flag = false;
				System.out.println(strings);
				intInput = Integer.parseInt(input.nextLine());
			} catch(NumberFormatException e) {
				System.out.println("Insert a number");
			}
		}while(flag);
		return intInput;
	}

	public void insert(Scarpe s) {
		s.setTipo(readString("Insert the type:"));
		s.setNumero(readDouble("Insert the number:"));
		s.setId(readInteger("Insert the id:"));
		if(s instanceof ModelloScarpe) {
			((ModelloScarpe) s).setMarca(readString("Insert the brand:"));
			((ModelloScarpe) s).setModello(readString("Insert the model:"));
		}
	}

	public void search(ArrayList<Scarpe> shoes) {
		Integer id = readInteger("Insert the id: ");
		if(scrud.readList() != null) {
			for (Scarpe scarpe : shoes) {
				if(id == scarpe.getId()) {
					System.out.println(scarpe);
				}
			}
		}
	}
	public void searchfor(ArrayList<Scarpe> shoes) {
		Integer id = readInteger("Insert the id: ");
		if(scrud.readList() != null) {
			for(int i = 0; i < scrud.readList().size(); i++) {
				if(id == shoes.get(i).getId()) {
					System.out.println(shoes.get(i).getId());
				}
			}
		}
	}
	public void printList(ArrayList<Scarpe> shoes) {
		for(Scarpe scarpe : shoes) {
			System.out.println(scarpe.toString());
		}
	}

	public void update(Scarpe s) {
		String str;
		Double i = 0.0;
		Integer in = 0;
		str = readString("Type " + "[" +s.getTipo()+"]");
		if(str != null) {
			s.setTipo(str);
		}
		i = readDouble("Number " + "[" +s.getNumero()+"]");
		if(str != null) {
			s.setNumero(i);
		}
		in = readInteger("ID " + "[" +s.getId()+"]");
		if(str != null) {
			s.setId(in);
		}
		if(s instanceof ModelloScarpe) {
			str = readString("Model " + "[" + ((ModelloScarpe) s).getModello()+"]");
			if(str != null) {
				((ModelloScarpe)s).setModello(str);
			}
			str = readString("Brand " + "[" + ((ModelloScarpe) s).getMarca()+"]");
			if(str != null) {
				((ModelloScarpe)s).setMarca(str);
			}
		}
	}

	public void delete(ArrayList<Scarpe> shoes) {
		Integer id = readInteger("Insert the id:");
		if(shoes != null) {
			for(int i = 0; i < shoes.size(); i++) {
				if(id == shoes.get(i).getId()) {
					shoes.remove(i);
				}
			}
		}
	}
}

