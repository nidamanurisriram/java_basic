// Process is a whole single unit of a program.

// A program that is executed by the processor is process.

// Process includes all the code and its memory in heap and stack.

// Thread is a single unit of execution in a process and process is whole single unit of program.

package fundamental;

class ThreadImplementation implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("A single thread.");
	}
	
}

public class ProcessDemo {
	
	public static void main(String[] args) {
		
		ThreadImplementation threadImplementation = new ThreadImplementation();
		
		threadImplementation.run();
		
		System.out.println("The process of program execution has one default main and a custom thread.");
		
	}

}
