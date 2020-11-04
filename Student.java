package com.company;

public class Student {

    private String name;
    private double averageGrade;

    public Student(){

    }
    public Student(String name, double averageGrade){
        this.name = name;
        this.averageGrade = averageGrade;
    }
    public double getAverageGrade(){
        return this.averageGrade;
    }
    public String getName(){
        return this.name;
    }
    }

