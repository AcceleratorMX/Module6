package src.constructor.shape;

public class Shape {

    {
        System.out.println("In initialize block of Shape");
    }
    public Shape(){
        System.out.println("Shape non parameter constructor");
    }

    public Shape(String input) {
        System.out.println("Shape parametrized constructor" + input);
    }

}

