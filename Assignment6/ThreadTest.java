/**
	 * 1. Create five threads, let them print out “A”, “B”, “C”, “D”, “E” individually.
	 * The result shows on the screen should be: “ABCDEABCDEABCDE…...”
	 */
	 public class ThreadTest {

	private Object lock = new Object();

	public void printAlphabets() {

		synchronized (lock) {
			Thread t1 = new Thread(new Runnable() {

				@Override
				public void run() {
					System.out.print("A");
				}
			});
			t1.start();
		}

		synchronized (lock) {
			Thread t2 = new Thread(new Runnable() {

				@Override
				public void run() {
					System.out.print("B");
				}

			});
			t2.start();
		}

		synchronized (lock) {
			Thread t3 = new Thread(new Runnable() {

				@Override
				public void run() {
					System.out.print("C");

				}

			});
			t3.start();
		}

		synchronized (lock) {
			Thread t4 = new Thread(new Runnable() {

				@Override
				public void run() {
					System.out.print("D");

				}

			});
			t4.start();
		}
		synchronized (lock) {
			Thread t5 = new Thread(new Runnable() {

				@Override
				public void run() {
					System.out.print("E");

				}

			});
			t5.start();
		}

	}

	public static void main(String args[]) {
		ThreadTest call = new ThreadTest();
		while (true)
			call.printAlphabets();

	}

}
