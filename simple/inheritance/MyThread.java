
public class MyThread {

	public static void main(String[] args) {

		Runnable runnable = new Runnable() {
			public void run() {
				System.out.println("Starting at " + new java.util.Date());
				// TODO something useful
				System.out.println("Terminating at " + new java.util.Date());
			}
		};
		
		// create a thread and pass the anonymous class instance as the task and start the thread
		new Thread(runnable).start();
	}

}
