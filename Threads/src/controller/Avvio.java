package controller;

import threads.*;

public class Avvio {

	public static void main(String[] args) {
//
//		ThreadPrimaStampante t1 = new ThreadPrimaStampante();
//		ThreadSecondaStampante t2 = new ThreadSecondaStampante();
//		Thread ogg = new Thread(t1);
//		ogg.run();
		
		
		try {
			System.out.println("Ciao a tutti!");
			Thread.sleep(300);				
				System.out.println("Sono nel Main!");
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
}
