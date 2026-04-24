package hw;

public class NestedTryHW {

	public static void main(String[] args) {
		try {
            int[] numbers = {1, 2, 3};
            System.out.println("Outer try Attempting to access an array element...");
            System.out.println(numbers[5]); 

            try {
                System.out.println("Inner try Performing division...");
                int result = 10 / 0; 
            } catch (ArithmeticException e) {
                System.out.println("Inner catch ArithmeticException caught - " + e.getMessage());
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: ArrayIndexOutOfBoundsException caught - " + e.getMessage());
            
            try {
                System.out.println("Recovery try Attempting to fix or log error...");
                String nullString = null;
                System.out.println(nullString.length()); 
            } catch (NullPointerException npe) {
                System.out.println("Recovery catch NullPointerException caught during recovery - " + npe.getMessage());
            }
        } finally {
            System.out.println("Finally This block always executes regardless of exceptions.");
        }
        
        System.out.println("Program continues execution");

	}

}
