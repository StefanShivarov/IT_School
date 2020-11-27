package zad19;

public class test19_1 {

    public static void main(String[] args) {

        Person person = new Person("James", "London", "0882424524", "james.mail@gmail.com");
        Student student = new Student("James", "London", "0882424524", "james.mail@gmail.com"
                , "junior");
        Employee employee = new Employee("James", "London", "0882424524", "james.mail@gmail.com", "Office"
                , 4500, "25th Feb");
        Faculty faculty = new Faculty("James", "London", "0882424524", "james.mail@gmail.com", "Office"
                , 4500, "25th Feb", 125, "rank");
        Staff staff = new Staff("James", "London", "0882424524", "james.mail@gmail.com", "Office"
                , 4500, "25th Feb", "title");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());

    }
}
