package zad19;

public class Staff extends Employee{

    private String title;

    public Staff(String name, String address, String phoneNumber, String email, String office, double salary, String date, String title) {
        super(name, address, phoneNumber, email, office, salary, date);
        this.title = title;
    }

    @Override
    public String toString(){

        return super.toString()+String.format(", Title: %s",this.title);
    }
}
