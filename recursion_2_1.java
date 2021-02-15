package testProject;

public class recursion_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(even(24));//true
		System.out.println(even(17));//false
		
		System.out.println(odd(105));//true
		System.out.println(odd(66));//false
	}
	
	public static boolean even(int n) {
		if(n < 0) {
			return even(-n);
		}else if(n == 1) {
			return false;
		}else if(n == 0) {
			return true;
		}else {
			return even(n-2);
		}
	}
	
	public static boolean odd(int n) {
		if(n < 0) {
			return odd(-n);
		}else if(n == 1) {
			return true;
		}else if(n == 0) {
			return false;
		}else {
			return odd(n-2);
		}
	}

}
