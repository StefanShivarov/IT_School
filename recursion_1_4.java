package testProject;

public class recursion_1_4 {

	public static void main(String[]args) {
		
		System.out.println("Recursive: "+xOnNthDegreeRecursive(2, 4));
		System.out.println("Iterative: "+xOnNthDegreeIterative(2, 4));
	}
	
	public static int xOnNthDegreeRecursive(int x, int n) {
		
		if(n==0) {
			return 1;
		}
		
		return x*xOnNthDegreeRecursive(x, n-1);
	}
	
	public static int xOnNthDegreeIterative(int x, int n) {
		
		int result = 1;
		for(int i = 0; i < n; i++) {
			result*=x;
		}
		return result;
	}
}
