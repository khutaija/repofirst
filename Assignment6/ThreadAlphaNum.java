/**
	 * 2. Create two threads, one prints out number 1 to 52, another prints out A to Z.
	 * The result shows on the screen should be: “12A34B56C78D…”
	 */
public class ThreadAlphaNum {
	public static void main(String[] args) throws InterruptedException {

		final PrintNumAlpha processor = new PrintNumAlpha();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					processor.printNum();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}

		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					processor.printAlpha();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}

		});

		t1.start();
		t2.start();
		t1.join();
		t2.join();

	}
}

class PrintNumAlpha {

	private Object lock = new Object();

	public void printNum() throws InterruptedException {

		while (true) {
			synchronized (lock) {
				for (int i = 1; i <= 52; i += 2) {
					System.out.print(i + " " + (i + 1) + " ");
					lock.notify();
					lock.wait();
				}
			}
			Thread.sleep(1000);
		}

	}

	public void printAlpha() throws InterruptedException {

		while (true) {
			synchronized (lock) {
				for (char i = 'A'; i <= 'Z'; i++) {
					System.out.print(i + " ");
					lock.notify();
					lock.wait();
				}
			}
			Thread.sleep(1000);
		}
	}
}