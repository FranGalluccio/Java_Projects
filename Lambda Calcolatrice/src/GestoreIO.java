import java.util.Scanner;

public class GestoreIO {

	//Classe Singleton
	private static GestoreIO INSTANCE = null;

	private GestoreIO() {}

	public static GestoreIO getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new GestoreIO();
		}
		return INSTANCE;
	}

	public String leggiStringa(String stringa) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println(stringa);
		return input.nextLine();
	}

	public Double leggiDouble(String stringa) {
		Double leggiDouble = null;
		boolean flag = true;
		do {
			flag = false;
			try {
				System.out.println(stringa);
				@SuppressWarnings("resource")
				Scanner input = new Scanner(System.in);
				leggiDouble = Double.parseDouble(input.nextLine());
			} catch (Exception e) {
				System.out.println("Inserire un numero");
				flag = true;
			}
		} while(flag);
		return leggiDouble;
	}
	public Integer leggiInt(String stringa) {
		Integer leggiInt = null;
		boolean flag = true;
		do {
			flag = false;
			try {
				System.out.println(stringa);
				@SuppressWarnings("resource")
				Scanner input = new Scanner(System.in);
				leggiInt = Integer.parseInt(input.nextLine());
			} catch (Exception e) {
				System.out.println("Inserire un numero");
				flag = true;
			}
		} while(flag);
		return leggiInt;
	}

}
