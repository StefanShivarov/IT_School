package myonlineshop;

public class ChildrenBook extends Book{

    private int age;


    public ChildrenBook(double regularPrice, String publisher, int yearPublished, int age) {
        super(regularPrice, publisher, yearPublished);
        this.setAge(age);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    @Override
    public double computeSalePrice() {
        return super.getRegularPrice()*0.3;
    }

    @Override
    public String toString(){
        return String.format("%n%s:%n",this.getClass().getSimpleName())
                +super.toString()+
                String.format("Age: %d%nSale price: %.2f", this.getAge(), this.computeSalePrice());
    }
}
