package threads;


public class ThreadSecondaStampante extends Thread{
	@Override
	public void run() {
		System.out.println("Ciao Mondo!");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
