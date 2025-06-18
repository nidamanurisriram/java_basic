// Synchronized is a keyword used in multi thread programming. Synchronized keyword is used to achieve synchronization.

// In multi thread programming if a shared resource executed through multiple threads then both thread run same time with shared resource and produced inconsistance output.

// Synchronized keyword locks an block of code or method of a shared resource in multiple threads. After complete execution of a synchronized block code another thread can access synchronized shared resource. 

// Synchronized keyword applies on block of code or a method then it makes the block of code or method is accessible for a single thread at a time.

// Synchrozied block of code or method cannot be accessed by multiple threads at a time. Only thread can access at a time and after complete execution of block of or method another thread can access the block of code or method.

package fundamental;

class Message {
	
	public synchronized void message(int n) {
		for(int i =1; i<=n; i++) {
			System.out.println(i + " . Hi");
		}
	}
	
}

class Thread1 extends Thread {
	
	Message message = new Message();
	
	@Override
	public void run() {
		message.message(4);
	}
}

class Thread2 extends Thread {
	
	Message message = new Message();
	
	@Override
	public void run() {
		message.message(6);
	}
	
}
public class SynchronizedDemo {
	
	public static void main(String[] args) {
		
		Thread1 thread1 = new Thread1();
		
		Thread2 thread2 = new Thread2();
		
		thread1.run();
		
		thread2.run();
		
	}

}
