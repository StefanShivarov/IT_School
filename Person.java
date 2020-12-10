package zadachi;

public class Person {

    private String name;
    private int age;
    private String placeOfBirth;

    public Person(String name, int age, String placeOfBirth){
        this.setName(name);
        this.setAge(age);
        this.setPlaceOfBirth(placeOfBirth);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }
}
