package zadachi;

import java.util.List;

public class Teacher extends Person{

    private double salary;
    private List<Student> students;
    private School school;

    public Teacher(String name, int age, String placeOfBirth, School school, double salary) {
        super(name, age, placeOfBirth);
        this.setSchool(school);
        this.setSalary(salary);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
