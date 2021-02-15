package testProject;

public class recursion_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(dec2Bin(13));//1101
		System.out.println(dec2Bin(74));//1001010
	}

	public static String dec2Bin(int value) {
		int x = 1;
		if(value == 0) {
			return "";
		}
		return (dec2Bin(value/2)+String.format("%d", value%2));
	}
}
