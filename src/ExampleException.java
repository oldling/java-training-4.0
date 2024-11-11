package src;

public class ExampleException {

    public static int rectangleArea(int a, int b) {
            if (a > 0 && b > 0) {
                return a * b;
            } else {
                throw new IllegalArgumentException("Length and width should be more than 0");
            }
    }
}