/**
	 * 3. Understand producer-consumer problem and implement it.
	 */

	 public class ProducerConsumer {

	public static void main(String[] args) throws InterruptedException {
		final Processor processor = new Processor();
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				try{
					processor.producer();
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				
			}
			
		});
		Thread t2 = new Thread(new Runnable(){

			@Override
			public void run() {
				try{
					processor.consumer();
				}catch(InterruptedException e){
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