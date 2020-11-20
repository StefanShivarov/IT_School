package zad16;

public class Course {

    private String courseName;
    private String[] students;
    private int numberOfStudents;

    public Course(String courseName){
        this.setCourseName(courseName);
        this.setNumberOfStudents(0);
        this.setStudents(new String[numberOfStudents]);
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }
    public void setStudents(String[] students) {
        this.students = students;
    }

    public String getCourseName() {
        return courseName;
    }
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    public String[] getStudents() {
        return students;
    }
    public void addStudent(String student){
        this.setNumberOfStudents(this.getNumberOfStudents()+1);
        this.students[this.students.length-1] = student;
    }
    public void dropStudent(String student){
        for(int i = 0; i < this.students.length; i++){
            if(this.students[i].equals(student)){

                this.students[i] = "";
                this.setNumberOfStudents(this.getNumberOfStudents()-1);

            }
        }
    }
}
