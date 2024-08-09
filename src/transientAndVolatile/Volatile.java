package transientAndVolatile;

public class Volatile extends Thread{
	
	volatile boolean working = true;
	
	public void run() {
		long count = 0;
		while(working) {
			count++;
		}
		System.out.println("Thread terminated: " + count);
	}

	public static void main(String[] args) throws InterruptedException {
		Volatile v = new Volatile();
		v.start();
		Thread.sleep(2000);
		System.out.println("After sleeping in Main");
		v.working = false;
		v.run();
		System.out.println("Working set to: " + v.working);
	}

}
