package zad19;

public class Faculty extends Employee{

    private int officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String email, String office, double salary, String date,
                   int hours, String rank) {
        super(name, address, phoneNumber, email, office, salary, date);
        this.officeHours = hours;
        this.rank = rank;
    }

    @Override
    public String toString(){

        return super.toString()+String.format(", Office hours: %d, Rank: %s",this.officeHours, this.rank);
    }
}
