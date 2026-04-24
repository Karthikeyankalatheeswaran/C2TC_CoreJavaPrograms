package hw;

import java.util.Scanner;

public class FinallyHW {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter the number : ");
			int number = scanner.nextInt();
			System.out.println((number % 2 == 0 )? " is Even" : " is Odd"); //Ternary operator
			return;
		} catch (Exception e){
			System.err.println("Error : " + e);
		} finally {
			System.out.println(" This Finally blocks always prints.");
			scanner.close();
		}

	}

}
