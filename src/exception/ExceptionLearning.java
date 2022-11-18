package src.exception;

public class ExceptionLearning {
    public static void main(String[] args) {

        int x = 10, y = 0;

        try {
            System.out.println(x/y);
        } catch (Exception e) {
            System.out.println("Catched exception division by zero");
        } finally {
            System.out.println("In finaly block");
        }
    }
}
