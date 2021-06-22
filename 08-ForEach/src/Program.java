import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		System.out.println("Inserisci una frase");
		Scanner lettura = new Scanner(System.in);
		lettura.nextLine(); //.nextLine , legge l'input della tastiera

        int vocali = 0, consonanti = 0, cifre = 0, punteggiatura = 0;

        for (String c : lettura)
       {
//        if ("aeiou".Contains(c.toLower(c)))
//            vocali++;
//            else
//                if (c.IsPunctuation(c)) // .IsPunctuation verifica se il carattere rispetto all'Unicode è un simbolo di punteggiatura.
//                punteggiatura++;
//            else
//                if (c.isDigit(c)) // .IsDigit verifica se il carattere rispetto all'Unicode è un simbolo numerico.
//                cifre++;
//            else
//                if (c.IsLetter(c)) // .Isletter verifica se il carattere rispetto all'Unicode è una lettera.
//                consonanti++;

        }
//        System.out.println("Vocali:" + vocali +  Consonanti: {consonanti}, Cifre: {cifre}, Punteggiatura: {punteggiatura} ");
	
	}
