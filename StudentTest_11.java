package com.company;

import java.util.Scanner;

public class StudentTest_11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Student[] studentsArr = new Student[5];
        System.out.println("Students with grades bigger than 5.50 will get scholarship.");
        for(int i = 0; i < studentsArr.length; i++){

            String[] inputArr = scanner.nextLine().split("\\s+");
            String name = inputArr[0];
            double grade = Double.parseDouble(inputArr[1]);
            studentsArr[i]= new Student(name, grade);
        }

        getStudentsWithScholarship(studentsArr);

    }

    public static boolean canGetScholarship(Student student){

        if(student.getAverageGrade()>=5.50){

            return true;
        }else{
            return false;
        }
    }
    public static void getStudentsWithScholarship(Student[] studentsArr){

        int eligibleStudents = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("The students that will get scholarship are: ").append(System.lineSeparator());
        for(int i = 0; i < studentsArr.length; i++){

            if(canGetScholarship(studentsArr[i])){

                eligibleStudents++;
                sb.append(studentsArr[i].getName()).append(System.lineSeparator());
            }
        }

        if(eligibleStudents==0){
            System.out.println("No students are eligible for scholarship.");
        }else{

            System.out.println(sb);
        }
    }

}
