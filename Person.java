package zad19;

public class Person {

    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    public Person(String name, String address, String phoneNumber, String email){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString(){

        return String.format("Name: %s, Address: %s, Phone number: %s, Email: %s",this.name, this.address, this.phoneNumber
        , this.email);
    }
}
