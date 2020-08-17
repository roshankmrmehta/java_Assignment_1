interface CalculatorDemo{
	public int calculateDemo(int a, int b);
}

public class Calculator {
	
	public int add(int a, int b) {
		return a+b;
	}
		
	public int difference(int a, int b) {
		return a-b;	
	}
	
	public int product(int a, int b) {
		return a*b;	
	}
				
	public int safeDivision(int a, int b) {
		return a/b;
	}
	
	public static void main(String[] args) {
	  
		Calculator calculator = new Calculator();
		CalculatorDemo c1 = calculator::add;
		int addition=c1.calculateDemo(2, 7);
		System.out.println(addition);
		
		CalculatorDemo c2 = calculator::difference;
		int diff=c2.calculateDemo(7,5);
		System.out.println(diff);
		
		CalculatorDemo c3 = calculator::product;
		int multiply=c3.calculateDemo(2, 7);
		System.out.println(multiply);
		
		CalculatorDemo c4 = calculator::safeDivision;
		int division=c4.calculateDemo(25,10);
		System.out.println(division);

	}

}