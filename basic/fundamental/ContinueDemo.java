//Continue statement is used to skip a particular iterative execution in a loop if matches given condition

package fundamental;

public class ContinueDemo {
	
	public void printNumbers() {
		
		System.out.println("Print 1 to 10 numbers -- continue statement");
		
		for(int i=0; i<=10; i++) {
			if(i==3) {
			continue;  
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		ContinueDemo demo = new ContinueDemo();
		
		demo.printNumbers();
		
	}
	
}
