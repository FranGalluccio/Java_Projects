
public class Avvio {

	public static void main(String[] args) {
		byte b = 1;
		short s = 40;
		int i = 500;
		long l = 1500l;
		double d = 33.8;
		float f = 100.9f;		
		char c1 = 65;
		char c2 = 'A';
		char c3 = 97;
		boolean flag = true;		
		String nome = "Pippo";
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(flag);
		
		int n = 5;
		++n;
		n--;
		System.out.println(n++);
		n++;
		System.out.println(--n);
		
		int n1 = 3;
		int n2 = 23;
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
		System.out.println(!(n1 != n2));
		System.out.println(n1 > n2);	
	}
}
