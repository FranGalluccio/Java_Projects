public class ConversioneBinario {

	public static void main(String[] args) {
        {
            // da decimale a Binario con operatore >> e & (senza l'utilizzo di cicli)
        	Utility input = new Utility();
        	int numero = Integer.parseInt(input.leggiStringa("Inserisci il numero da convertire:"));
            int g = 7;

            System.out.println(numero >> g & 1);
            System.out.println(numero >> --g & 1);
            System.out.println(numero >> --g & 1);
            System.out.println(numero >> --g & 1);
            System.out.println(numero >> --g & 1);
            System.out.println(numero >> --g & 1);
            System.out.println(numero >> --g & 1);
            System.out.println(numero >> --g & 1);
        }
	}
}
