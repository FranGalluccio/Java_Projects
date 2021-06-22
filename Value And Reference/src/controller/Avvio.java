package controller;
import model.Persona;

public class Avvio {

	public static void main(String[] args) {
		System.out.println("Passaggio per riferimento:");
		Persona persona1 = new Persona("Alfredo", "Barabba");
		Persona persona2 = new Persona("Giancarlo", "Braida");
		Persona persona3 = new Persona("Alfredo", "Barabba");
		
		System.out.println(persona1.equals(persona2) ? "Le persone sono uguali" : "Le persone sono diverse");
		System.out.println(persona1.equals(persona3) ? "Le persone sono uguali" : "Le persone sono diverse");
		
		System.out.println("\nPrima del setNome:" + persona1);
		persona1.setNome("Giancarlo");
		System.out.println("Dopo il setNome:" + persona1);

		System.out.println("\n\nPassaggio per valore:");
		int numero = 5;
		int numero1 = 9;
		System.out.println("Prima dello scambio numero vale:" + numero + " e numero1 vale:" + numero1);
		int tmp = 0;
		tmp = numero;
		numero = numero1;
		numero1 = tmp;
		System.out.println("Dopo lo scambio numero vale:" + numero + " e numero1 vale:" + numero1);
	}
}
