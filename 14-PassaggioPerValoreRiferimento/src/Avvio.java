
public class Avvio {

	public static void main(String[] args) {
//		Operazioni op = new Operazioni(); // @5acf9800
		Utility u = new Utility();
//		int n1 = 5;
//		op.operazione = "Divisione";
//		u.passaggioValore(n1);
//		System.out.println("Sono nel main" + n1);
//		u.passaggioRiferimento(op);
//		System.out.println(op.operazione);
		
		Operazioni[] op1 = new Operazioni[3];
		op1[0] = new Operazioni();
		op1[1] = new Operazioni();
		op1[2] = new Operazioni();
		op1[0].operazione = "Addizione";
		op1[1].operazione = "Sottrazione";
		op1[2].operazione = "Moltiplicazione";
		u.passaggioRiferimento(op1);		
		
	}
}
