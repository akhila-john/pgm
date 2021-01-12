package threads;

public class Waiter implements Runnable {

	private Message msg;
	
	public Waiter(Message msg) {
		this.msg = msg;
	}
	
	public void run() {
		String name = Thread.currentThread().getName();
		synchronized (msg) {
			try {
				System.out.println(name +"waiting to get notified at time" + 
			   System.currentTimeMillis());
				msg.wait();
			} catch (InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(name + "waiter thread got notified at time" +
			   System.currentTimeMillis());
			//process themessage now
			System.out.println(name + "processed " + msg.getMsg());
		}
	}
}
