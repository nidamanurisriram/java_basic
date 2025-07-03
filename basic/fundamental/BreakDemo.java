//Break statement used inside a loop to stop iterative execution if it matches a given condition

package fundamental;

public class BreakDemo {
	
	public void printNumbers() {
		
		System.out.println("Print 1 to 10 numbers -- break statement");
		
		for(int i=0; i<=10; i++) {
			if(i==3) {
				break;
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		BreakDemo demo = new BreakDemo();
		
		demo.printNumbers();
		
	}

}
