package zad19;

public class Student extends Person{

    private String classStatus;
    public Student(String name, String address, String phoneNumber, String email, String classStatus) {
        super(name, address, phoneNumber, email);
    }

    @Override
    public String toString(){

        return super.toString()+String.format(", Class Status: %s",this.classStatus);
    }
}
