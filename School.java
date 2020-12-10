package zadachi;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class School {

    private String name;
    private String address;
    private List<Student> students;
    private List<Teacher> teachers;

    public School(String name, String address){
        this.setName(name);
        this.setAddress(address);
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
