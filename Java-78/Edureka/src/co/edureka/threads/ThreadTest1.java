package co.edureka.threads;
class MyTask1 implements Runnable{
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("--- "+t);
	} 	
}

public class ThreadTest1 {
	public static void main(String[] args) {
		System.out.println("No of Active Threads = "+ Thread.activeCount());
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		MyTask1 task = new MyTask1();
		//task.run();
		Thread ct = new Thread(task);
		ct.start();
		
		System.out.println("No of Active Threads = "+ Thread.activeCount());
	}
}
