package testProject;

public class recursion_1_3 {

	public static void main(String[]args) {
		
		System.out.println("Recursive: "+twoNthDegreeRecursive(4));
		System.out.println("Iterative: "+twoNthDegreeIterative(4));
	}
	
	public static int twoNthDegreeRecursive(int x) {
		
		if(x==0) {
			return 1;
		}
		
		return 2*twoNthDegreeRecursive(x-1);
	}
	
	public static int twoNthDegreeIterative(int x) {
		int result = 1;
		for(int i = 1; i <= x; i++) {
			
			result*=2;
		}
		return result;
	}
	
}	