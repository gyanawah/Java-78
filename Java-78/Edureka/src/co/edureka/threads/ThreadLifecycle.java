package co.edureka.threads;

public class ThreadLifecycle {

	public static void main(String[] args) throws InterruptedException {
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		for(int i=1;i<=10;i++) {
			System.out.println(t.getName()+" - "+i);
			Thread.sleep(2000);
			if(i==4)
				t.stop();
		}
	}
}
