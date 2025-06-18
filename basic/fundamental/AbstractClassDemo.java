// A class that is declared abstract referred to abstract class.

// Syntax : abstract class ClassName { }

// Abstract means concrete or no implementation.

// If a method declared as abstract then it must not be empty.

// An abstract class may or may not contain abstract methods in it.

// Abstract class abstract methods are implemented by the sub classes.

// Abstract classes instances or objects cannot be created or initialized.

// Abstract key word is used declare abstract methods to achieve abstraction.

// To call the abstract classes methods they has to accessed by implementation class instances or objects.

// -------------------------------------------------------------------------------------------------------

// Abstract class method implementation

// Abstract methods objects or instances cannot be initialized or created.

// Standard way of implementing abstract class is through sub class instances or objects.

// Another way of implementing abstract class methods is in it's own constructor.

// Syntax : AbstactClass referenceVariable = new AbstractClass() { method implementation };

// After following this implementation pattern using the instance or object reference variable calling the method.

package fundamental;

abstract class Sweep {
	
	public void purchase() {
		System.out.println("Purchase a sweeper.");
	}
	
	abstract void sweep();
	
	// Abstract and implemented methods in abstract class.
	
}

abstract class Wet {
	
	abstract void wet();
	
}

abstract class Mop {
	
	public abstract void mop();
	
	// Abstract methods only in abstract class.
	
}

abstract class Clean {
	
	public void clean() {
		System.out.println("Clean the floor.");
	}
	
	// Implemented methods only in abstract class.
	
}


class SweepImplementation extends Sweep {
	
	public void sweep() {
		System.out.println("Sweep the floor.");
	}
	
}

class MopImplementation extends Mop {
	
	public void mop () {
		System.out.println("Mop the floor.");
	}
	
}

class CleanImplementation extends Clean {
	
}

public class AbstractClassDemo {

	public static void main(String[] args) {
	
		SweepImplementation sweepImplementation = new SweepImplementation();
		
		sweepImplementation.purchase();
		
		sweepImplementation.sweep();
		
		Wet wet = new Wet () {

			@Override
			void wet() {
				// TODO Auto-generated method stub
				System.out.println("Wet the floor");
			}
			
		};
		
		wet.wet();
		
		MopImplementation mopImplementation = new MopImplementation();
		
		mopImplementation.mop();
		
		CleanImplementation cleanImplementation = new CleanImplementation();

		cleanImplementation.clean();
		
	}	
	
}
