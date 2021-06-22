package controller;
import java.util.Scanner;

public class Utility {
	static Scanner input = new Scanner(System.in);

	//controlla se un numero è positivo
	public void isPositive(int num) {
		if (num>0) {
			System.out.println(num*2);
			System.out.println("è maggiore di 0");
		}
		else {
			System.out.println("è minore di 0");
			System.out.println(num*2);
		}
	}

	// controlla se un numero è Dispari
	public void isOdd(int num) {
		if((num%2)==0) {
			System.out.println(num*3);
			System.out.println("Pari");			
		}
		else {
			System.out.println(num*3);
			System.out.println("dispari");			
		}
	}

	//legge una stringa in input
	public int readString(String suggerimento) {
		System.out.println(suggerimento);
		return Integer.parseInt(input.nextLine());
	}
	
	//dati 5 numeri in input, devono essere compresi fra 5 e 15
	public boolean checkAllNumbers(int num1, int num2, int num3, int num4, int num5) {
		return (num1<=5 || num1>=15) && (num2<=5 || num2>=15) && (num3<=5 || num3>=15) && (num4<=5 || num4>=15) && (num5<=5 || num5>=15) ? false : true;
	}

	//calcola il Maggiore di 5 numeri
	public int maxOfFiveNum(int num1,int num2,int num3,int num4,int num5) {		
		return num1>num2 && num1>num3 && num1>num4 && num1>num5 ? num1 : num2>num3 && num2>num4 && num2>num4 && num2>num5 ? num2 :
			num3>num4 && num3>num4 && num2>num4 && num2>num5 ? num3 : num4>num5 ? num4 : num5;
	}
	
	// calcola il Minore di 5 numeri
	public int minOfFiveNum(int num1,int num2,int num3,int num4,int num5) {		
		return num1<num2 && num1<num3 && num1<num4 && num1<num5 ? num1 : num2<num3 && num2<num4 && num2<num4 && num2<num5 ? num2 :
			num3<num4 && num3<num4 && num2<num4 && num2<num5 ? num3 : num4<num5 ? num4 : num5;
	}

	// calcola la Media di 5 numeri
	public int averageNumber(int num1,int num2,int num3,int num4,int num5) {
		int somma = num1 + num2 + num3 + num4 + num5;
		int media = somma / 5;	
		return media;	
	}
	
	//per ogni numero uguale all'altro, conta +1
	public int counter(int num1,int num2,int num3,int num4,int num5) {
		int counter = 0;	
		//				return  num1 == num2 ? counter++ || num1 == num3 ? counter++ || num1 == num4 ? counter ++ || num1 == num5 ? counter++ || 
		//						num2 == num3 ? counter++ || num2 == num4 ? counter++ || num2 == num5 ? counter++ || num3 == num4 ? counter++ ||
		//						num3 == num5 ? counter++ || num4 == num5 ? counter++ : counter;		
		if(num1 == num2) {	
			counter++;
		}
		if(num1 == num3) {
			counter++;				
		}
		if(num1 == num4) {						 
			counter++;
		}
		if(num1 == num5) {						 
			counter++;
		}	
		if(num2 == num3) {
			counter++;
		}
		if(num2 == num4) {
			counter++;
		}
		if(num2 == num5) {
			counter++;
		}
		if(num3 == num4) {
			counter++;
		}
		if(num3 == num5) {
			counter++;
		}
		if(num4 == num5) {
			counter++;
		}		
		return counter;
	}
	
	//dati 5 numeri, dovrebbe restituire il numero centrale (attualmente non funziona)
	public int midOfFiveNum(int num1,int num2,int num3,int num4,int num5) {
			if(num1>num2 && num1>num3 && num1<num4 && num1<num5) {
				return num1;
			}
			if(num2>num1 && num2>num3 && num2<num4 && num2<num5) {
				return num2; 
			}
			if(num3>num1 && num3>num2 && num3<num4 && num3<num5) {
				return num3; 
			}
			if(num4>num1 && num4>num2 && num4<num3 && num4<num5) {
				return num4; 
			}
			if(num5>num1 && num5>num2 && num5<num3 && num5<num4) {
				return num5; 
			}
			else return 0;
		}
	
	//dati 5 numeri, dovrebbe restituire il numero centrale (attualmente non funziona)
	public int midNumbers(int num1,int num2,int num3,int num4,int num5) {
		int media = averageNumber(num1,num2,num3,num4,num5);
		if ((media >= num1 && media >= num2 && media >= num3 && media >= num4) && (media <= num1 && media <= num2 && media <= num3 && media <= num4)) {
			return num5;
		}
		if ((media >= num1 && media >= num2 && media >= num3 && media >= num5) && (media <= num1 && media <= num2 && media <= num3 && media <= num5)) {
			return num4;
		}
		if ((media >= num1 && media >= num2 && media >= num4 && media >= num5) && (media <= num1 && media <= num2 && media <= num4 && media <= num5)) {
			return num3;
		}
		if ((media >= num1 && media >= num3 && media >= num4 && media >= num5) && (media <= num1 && media <= num3 && media <= num4 && media <= num5)) {
			return num2;
		}
		if ((media >= num2 && media >= num3 && media >= num4 && media >= num5) && (media <= num2 && media <= num3 && media <= num4 && media <= num5)) {
			return num1;
		}
		else return media;
	}

}

