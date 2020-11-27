package zad19;

public class Employee extends Person{

    private double salary;
    private String dateHired;

    public Employee(String name, String address, String phoneNumber, String email, String office, double salary, String date) {
        super(name, address, phoneNumber, email);
        this.salary = salary;
        this.dateHired = date;
    }

    @Override
    public String toString(){

        return super.toString()+String.format(", Salary: %.2f, Date hired: %s",this.salary, this.dateHired);
    }
}
