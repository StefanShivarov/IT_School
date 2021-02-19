package testProject;

public class recursion_4_4 {

	public static void main(String[]args) {
		
		int [] arr = {5, 6, 7, 8, 9};
		System.out.println(average(arr));//7
	}
	
	public static double average(int[] arr) {
		return average(arr, arr.length);
	}
	
	public static double average(int[]arr, int n) {
		
		return sum(arr, n, 0) / n;
	}
	public static double sum(int[]arr, int n, int result) {
		if(n == 0) {
			return result;
		}
		
		return sum(arr, n-1, result+arr[n-1]);
	}
}
