package com.company;

public class Circle {

    private double radius;

    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    public void setRadius(double newRadius){
        this.radius = newRadius;
    }


}
