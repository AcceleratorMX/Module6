package src.constructor.shape;

public class Circle extends Shape {

    {
        System.out.println("In initialize block of Circle");
    }
    public Circle() {
        super("Input from circle");
        System.out.println("Circle non parameter constructor");
    }
}
