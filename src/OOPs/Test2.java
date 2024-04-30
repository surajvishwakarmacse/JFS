package OOPs;

class Shape {
    void draw()
    {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape{
    @Override
    void draw() {
        //super.draw();  // it will call parent method
        System.out.println("Drawing circle");
    }
}

class Rectangle extends Shape{
    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class Test2{
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();
        Circle circle = new Circle();
        circle.draw();
        Rectangle rectangle = new Rectangle();
        rectangle.draw();

        System.out.println("===============");
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();
        shape1.draw();
        shape2.draw();
    }
}


