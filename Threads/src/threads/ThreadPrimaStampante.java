package threads;

public class ThreadPrimaStampante implements Runnable{

	@Override
	public void run() {
		System.out.println("Hello World!");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
