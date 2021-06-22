package DoWhile;
import java.util.Scanner;

public class Prova {

	public static void main(String[] args) {
	
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Indovina qual'è il numero perfetto:");				
			do{
			if (Integer.parseInt(input.next()) == 3)
			{			
				break;
			}
			else
			{
				System.out.println("Non E' lui, riprova...");	
			}		
			}while(true);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println("E' 3, Bravo/a!");	
	}
}