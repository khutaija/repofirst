import java.util.LinkedList;
import java.util.Random;

public class Processor {

	private LinkedList<Integer> list = new LinkedList<Integer>();
	private final int LIMIT = 10;
	private Object lock = new Object();

	public void producer() throws InterruptedException {

		int value = 0;
		
		while (true) {
			synchronized (lock) {
				while (list.size() == LIMIT) {
					lock.wait();
				}
				list.add(value++);
				lock.notify();
			}
			
		}
	}

	public void consumer() throws InterruptedException {

		while (true) {
			synchronized (lock) {
				while (list.size() == 0){
					lock.wait();
				}
				System.out.print("List size is: " +list.size());
				int listValue = list.removeFirst();
				System.out.println(". Value is: " +listValue);
				lock.notify();
			}
			pause();
		}
	}
	
	public void pause() throws InterruptedException
	{
		Random random = new Random();
		Thread.sleep(random.nextInt(100));
	}

}
