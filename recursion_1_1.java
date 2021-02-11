package testProject;
public class recursion_1_1 {

	public static void main(String[] args) {
	   	 System.out.println("Sum is " + xMethod(5));//15
	   	 System.out.println("Sum is " + xMethod(10));//55
	}

	//iterative
	public static int xMethod(int n) {
		
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum+=i;
		}
		return sum;
	}
	
}	
