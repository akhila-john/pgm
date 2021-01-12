package threads;

public class ThreadWithoutSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Thread thread1 = new Thread (new MyClass("thread1"));
    Thread thread2 = new Thread (new MyClass("thread2"));
    thread1.start();
    thread2.start();
    boolean thread1IsAlive = true;
    boolean thread2IsAlive = true;if (thread1IsAlive && !thread1.isAlive()) {
		thread1IsAlive = false;
		System.out.println("thread 1 is dead");
    
    do {
    	if (thread1IsAlive && !thread1.isAlive()) {
    		thread1IsAlive = false;
    		System.out.println("thread 1 is dead");
    	}
    	if (thread1IsAlive && !thread1.isAlive()) {
    		thread1IsAlive = false;
    		System.out.println("thread 1 is dead");
    	}
    } while (thread1IsAlive || thread2IsAlive);
	}
}

}