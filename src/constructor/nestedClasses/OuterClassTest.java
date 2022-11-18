package src.constructor.nestedClasses;

public class OuterClassTest {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        System.out.println(outerClass.operate(4,5));

        OuterClass.SumOperator sumOperator = new OuterClass.SumOperator();
        System.out.println("sumOperator.sum(6,7) = " + sumOperator.sum(6, 7));
    }
}