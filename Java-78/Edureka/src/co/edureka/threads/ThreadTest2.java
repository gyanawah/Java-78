package co.edureka.threads;
class MyTask2 extends Thread{
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("--- "+t);
	} 	
}

public class ThreadTest2 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("No of Active Threads = "+ Thread.activeCount());
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		MyTask2 ct = new MyTask2();		
		ct.start();
		//ct.join();
		System.out.println("No of Active Threads = "+ Thread.activeCount());
	}
}
