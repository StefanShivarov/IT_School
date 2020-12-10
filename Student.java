package zadachi;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{

    private List<Double> grades;
    private School school;

    public Student(String name, int age, String placeOfBirth, School school) {
        super(name, age, placeOfBirth);
        this.grades = new ArrayList<>();
        this.setSchool(school);
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
