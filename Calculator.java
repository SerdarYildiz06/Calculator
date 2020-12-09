package calculator;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
		double number1= sc.nextDouble();
		System.out.print("Enter the second number : ");
		double number2= sc.nextDouble();
		
		
		System.out.print("Enter the transaction you want to do(For example: +,-,*,/) : ");
		char operation= sc.next().charAt(0);
		
		if (operation=='+') {
			System.out.println("Result: "+(number1+number2));
		}
		else if (operation=='-') {
			System.out.println("Result: "+(number1-number2));
		}
		else if (operation=='*') {
			System.out.println("Result: "+(number1*number2));
		}
		else if (operation=='/') {
			System.out.println("Result: "+(number1/number2));
		}
		else {
			System.out.println("You entered an invalid transaction.");
		}
		
		
		
	}
	
}

