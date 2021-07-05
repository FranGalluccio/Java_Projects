import java.util.Scanner;
import java.util.function.*;

public class Avvio {

	public static void main(String[] args) {

		
		//ControlloEccezione.metodo1();
		try {
			ControlloEccezione.metodo2();
		} catch (EntityIllegalException e) {
			System.out.println("Argomento illegale");
		} catch (Exception e) {
			System.out.println("Errore generico");
		}
		
//		try {
//			throw new EntityIllegalException();
//		}
//		catch(EntityIllegalException e) {
//			System.out.println("Attenzione!!! L'entità inserita non appartiene alla gerarchia prevista!!!");
//		}
//		catch(Exception e) {
//			System.out.println("Errore generico!!!");
//		}
//		finally {
//			//chiudere le operazioni io
//			//per evitare la corruzione dei dati
//			new Scanner(System.in).close();
//		}




	}

}
