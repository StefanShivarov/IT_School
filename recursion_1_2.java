package testProject;

public class recursion_1_2 {
	
	public static void main(String[] args) {
	   	 xMethod(1234567);
	   	 System.out.println();
	   	 xMethod(987654321);
	}

	//iterative
	public static void xMethod(int n) {
	   	 while(n!=0) {
	   		 System.out.print(n%10);
	   		 n/=10;
	   	 }
	 }


}
