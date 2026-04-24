package hw;

public class WrapperHW {

	public static void main(String[] args) {
		
		// int -> obj
		int num = 32;
		Integer nums = Integer.valueOf(num);
		System.out.println(nums);
		
		//obj -> int
		int number = nums;
		System.out.println(number);
	}

}
