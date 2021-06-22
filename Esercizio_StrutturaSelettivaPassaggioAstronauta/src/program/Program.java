package program;

public class Program {

	public static void main(String[] args) {
		// Il passaggio di un astronauta da una nave di servizio ad un satellite artificiale è permesso se: la nave ed il satellite sono uniti e alla
        // stessa pressione interna, oppure se sono separati e l’astronauta indossa una tuta pressurizzata.In entrambi i casi occorre inoltre che
        // le pile solari del satellite funzionino e giunga il consenso del controllo a terra.
        boolean nave = true;
        boolean satellite = true;
        boolean pressione_interna = nave && satellite;
        boolean tuta_pressurizzata = true;
        boolean pile_Solari = true;
        boolean consenso = true;

        if ((nave && satellite && pressione_interna && pile_Solari && consenso) || (nave && satellite && tuta_pressurizzata && consenso && pile_Solari))
            {
            System.out.println("Può avvenire il passaggio");
            }
        else
            {
            System.out.println("Mancano i prerequisiti per il passaggio");
            }         
        System.out.println("Nave \tPress \tSatel \tTuta \tPile \tConsenso \t");
        System.out.println(nave + "\t" + pressione_interna + "\t" + satellite + "\t" + tuta_pressurizzata + "\t" + pile_Solari + "\t" + consenso + "\t");
	}
}
