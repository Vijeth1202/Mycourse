package in.ineuron.main;

class EvenThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("Even Numbers");
        for (int i = 2; i <= 10; i += 2) {
            System.out.print(i+" ");
        }

	}
}

class OddThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("Odd Numbers");
        for (int i = 1; i <= 9; i += 2) {
            System.out.print(i+" ");
        }

	}
}

public class TwoThreads {
	public static void main(String[] args) {
		EvenThread evenThread = new EvenThread();
		OddThread oddThread = new OddThread();
		
		evenThread.start();
		oddThread.start();
		
	}
}
