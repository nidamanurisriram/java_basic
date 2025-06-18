// Thread is path of execution.

// Thread is part of a process.

// Main method is the default thread of a program.

// Threads of a program runs simultaneously along with other threads like main method. 

// Instead of line by line execution if thread code has been written in the program then the thread code will be executed line by line along with other threads like main method.

// There two ways of implementing the threads 1. Thread Class 2. Runnable Interface.

// 1. Thread Class

// A class has to inherit thread class and it's abstract method 'run' that has to be implemented and create instance of class and the run method has to called using start method with instance reference variable.

// 2. Runnable Interface

// A class has to implement the runnable interface and has to implement it's abstract method 'run' and create instance of the class and class run method has to be called using run method with instance reference variable.  

// The difference between using 'extends or thread class' and 'implements or runnable interface' for creating thread program is by implementing runnable interface another class can be inherited but by using thread extends another class cannot be inherited. 

// Since all threads of a program run simultaneously the results can be vary and the flow of threads execution can be controlled using thread execution control default methods to control the execution flow of the threads.

package fundamental;

class One extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("One Thread");
	}
}

class Two implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
	System.out.println("Two Thread");	
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
	
		One thread1 = new One();
		
		Two thread2 = new Two();
		
		thread1.start();
		
		thread2.run();
		
		System.out.println("Main Thread");

		
	}
	
}
