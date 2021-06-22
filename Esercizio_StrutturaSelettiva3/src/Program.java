
public class Program {

	public static void main(String[] args) {
		Utility input = new Utility();
		String username = input.leggiStringa("Inserisci Username");
		String password = input.leggiStringa("Inserisci Password");	
		
		if(password.equals("1234") && username.equals("root")) {
			System.out.println("Login effettuato con successo");
		}
		else {
			System.out.println("Username o Password errati");
		}		
	}
}
