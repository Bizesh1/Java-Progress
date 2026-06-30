class Shape1 {
    public void draw() {
        System.out.println("Drawing a Shape");
    }
}

class Circle1 extends Shape1 {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle1 extends Shape1 {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class ShapeDemo1 {
    public static void main (String[] args) {
        Shape1 s1 = new Shape1();
        Shape1 s2 = new Circle1();
        Shape1 s3 = new Rectangle1();

        s1.draw();
        s2.draw();
        s3.draw();
    }
}
