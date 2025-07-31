public class CalculatorMain{
	
	public static void main(String[] args){
		Calculator c = new Calculator();
	
		System.out.println("Sum of 10 and 5 : " + c.add(10,5));
		System.out.println("Subtraction of 10 and 5 : " + c.subtract(10,5));
		System.out.println("Multiplication of 10 and 5 : " + c.multiply(10,5));
		System.out.println("Division of 10 and 5 : " + c.divide(10,5));
		System.out.println("The end");

	}
}