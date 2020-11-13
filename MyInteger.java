package zad15_ex3;

public class MyInteger {

    private int value;

    public MyInteger(int value){
        setValue(value);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isEven(){
        if(this.getValue()%2==0){
            return true;
        }else{
            return false;
        }
    }

    public boolean isOdd(){
        if(!this.isEven()){
            return true;
        }else{
            return false;
        }
    }

    public boolean isPrime(){
        for(int i = 2; i <= this.getValue()/2; i++){
            if(this.getValue()%i==0){
                return false;
            }
        }
        return true;
    }

    public boolean equals(int value){
        return this.getValue() == value;
    }
    public boolean equals(MyInteger myInteger){
        return this.equals(myInteger.getValue());
    }
    public int parseInt(char[]charArr){
        int result = 0;
        for(int i = 0; i < charArr.length; i++){
            result*=10;
            result+=Integer.parseInt(String.valueOf(charArr[i]));
        }
        return result;
    }
    public int parseInt(String string){
        char[]symbolsArr = string.toCharArray();
        return this.parseInt(symbolsArr);
    }

}
