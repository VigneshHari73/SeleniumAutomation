package tests;

public class SwapNumbers {
	
	public static void main(String[] args) {
		
		
		int number1= 1;
		int  number2 = 77;
		
		int temp;
		
		temp = number2;
		number2 = number1;
		number1 = temp;
		
		System.out.println("number1"+number1+"number2"+number2);
	}

}
