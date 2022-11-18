package src.constructor.nestedClasses;

public class OuterClass {
    public int operate(int x, int y) {
        SumOperator operator = new SumOperator();
        return operator.sum(x, y);
    }


    public static class SumOperator {
        public int sum(int x, int y) {
            return x+y;
        }
    }

}
