import java.util.Scanner;

public class Palindroma {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input= new Scanner(System.in);
		System.out.println("Inserire parola/frase/numeri da controllare se sia Palindroma:");
		String word = input.nextLine();
		boolean isPalindroma = isPalindroma(word);
		if(isPalindroma){
			System.out.println("La parola/frase/numeri '"+word+"' è Palindrima");			
		} else{
			System.out.println("La parola/frase/numeri '"+word+"' NON è Palindrima");		
		}
	}
	public static boolean isPalindroma(String word) {
		boolean palindroma = true;
		word.toLowerCase();
		int startIndex = 0;
		int endIndex = word.length()-1;

		for(; startIndex < endIndex; startIndex++, endIndex-- ) {
			if(word.charAt(startIndex) != word.charAt(endIndex)) {
				palindroma = false;
				break;
			}
		}		
		return palindroma;
	}
} 