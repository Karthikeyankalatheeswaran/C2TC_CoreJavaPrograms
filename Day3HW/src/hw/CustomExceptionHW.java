package hw;

// Custom Exception Creation
class InvalidBalanceException extends Exception {
	InvalidBalanceException (String message){
		super(message);
	}
}

public class CustomExceptionHW {
	
	static void withdraw(int balance) throws InvalidBalanceException {
		if (balance <= 100) {
			throw new InvalidBalanceException("insufficient Balance");
		}
		System.out.println("Withdrawal successful");
	}

	public static void main(String[] args) {
		try {
			withdraw(90);
		} catch (InvalidBalanceException e) {
			System.out.println(e.getMessage());
		}

	}

}
