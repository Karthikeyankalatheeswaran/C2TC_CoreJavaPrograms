package hw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchHW {

	public static void main(String[] args) {
		
		System.out.println("This is a Division with Error Messages");
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			try {
				System.out.println("Enter A number: ");
				a = sc.nextInt();
				System.out.println("Enter B number: ");
				b = sc.nextInt();
				c = a / b;
				System.out.println("Division is " + c);
				break;
			} catch (InputMismatchException e){
				System.out.println("Invalid input. Please enter integers only." + e);
				break;
			} catch (ArithmeticException e){
				System.out.println("Exception caught: " + e.getMessage());
				 break;
			} catch (Exception e) {
				System.out.println("Exception caught: " + e.getMessage());
				 break;
			}
		}
	}

}
