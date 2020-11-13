package zad15_ex3;

public class MyInteger_Test {

    public static void main(String[] args) {


        MyInteger myInteger = new MyInteger(24);
        System.out.println(myInteger.getValue());//24
        System.out.println(myInteger.isEven());//true
        System.out.println(myInteger.isOdd());//false
        System.out.println(myInteger.isPrime());//false
        System.out.println(myInteger.equals(26));//false
        System.out.println(myInteger.equals(24));//true
        System.out.println(myInteger.equals(new MyInteger(27)));//false
        System.out.println(myInteger.equals(new MyInteger(24)));//true
        char[]arr = {'1','2','3','4','5'};
        System.out.println(myInteger.parseInt(arr));//12345
        String stringNum = "421451";
        System.out.println(myInteger.parseInt(stringNum));//421451

    }
}
