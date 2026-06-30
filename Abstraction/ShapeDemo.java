//abstract class
abstract class Shape {
    //abstract method
    abstract double calculateArea();
}

//circle class
class Circle extends Shape {
    private double radius;
    public Circle (double radius){
        this.radius = radius;
    }

    @Override
    double calculateArea(){
        return Math.PI * radius * radius;
    }
}

//rectangle class
class Rectangle extends Shape {
    private double length;
    private double breadth;
    public Rectangle (double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double calculateArea(){
        return length * breadth;
    }
}

// main class
public class ShapeDemo {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rect = new Rectangle(20, 10);

        System.out.println("Circle Area = " + circle.calculateArea() + " sq. units");
        System.out.println("Rectangle Area = " + rect.calculateArea() + " sq. units");
    }
}
