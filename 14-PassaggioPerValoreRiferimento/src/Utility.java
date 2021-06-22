
public class Utility {
	public void passaggioValore(int n1) {
		n1 = 50;
		System.out.println("Sono nel metodo " + n1);	
	}
	
	public void passaggioRiferimento(Operazioni op) {
		op.operazione = "Moltiplicazione"; 
	}
	
	public void passaggioRiferimento(Operazioni[] op) {
		System.out.println(op[0].operazione + " " + op[1].operazione + " " + op[2].operazione);
	} 
}
