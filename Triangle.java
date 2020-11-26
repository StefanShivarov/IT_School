package zad18;

public class Triangle implements GeometricObject{

    private double side1;
    private double side2;
    private double side3;

    private void setSide1(double side1) {
        this.side1 = side1;
    }
    private void setSide2(double side2){
        this.side2 = side2;
    }
    private void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getSide1() {
        return side1;
    }
    public double getSide2() {
        return side2;
    }
    public double getSide3() {
        return side3;
    }

    public Triangle(){
        setSide1(1);
        setSide2(1);
        setSide3(1);
    }

    public Triangle(double side1, double side2, double side3){
        setSide1(side1);
        setSide2(side2);
        setSide3(side3);
    }

    @Override
    public double getArea(){
        double p = (this.side1+this.side2+this.side3)/2;
        return Math.sqrt(p*(p-this.side1)*(p-this.side2)*(p-this.side3));
    }

    @Override
    public double getPerimeter() {

        return this.side1+this.side2+this.side3;

    }

    @Override
    public String printRectangle() {

        return String.format("Triangle: side1 = %.1f, side2 = %.1f, side3 = %.1f",this.getSide1(), this.getSide2(), this.getSide3());
    }
}
