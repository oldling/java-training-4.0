package src;

/**
 * Compute the sum and average for running integers using loop.
 */
public class SumAverage {

    /**
     * Computes sum of running integers from a lower bound to an upper bound.
     *
     * @param lowerBound lower bound
     * @param upperBound upper bound
     * @return sum of integers
     */
    public static int sum(int lowerBound, int upperBound) {
        int sum = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * Computes sum of running integers from a lower bound to an upper bound within an array.
     *
     * @param numbers running integers array
     * @return sum of integers
     */
    public static int sum(int[] numbers) {
        int sum = 0;
        for (int i: numbers) {
            sum += i;
        }
        return sum;
    }

    /**
     * Computes average of running integers from a lower bound to an upper bound.
     *
     * @param lowerBound lower bound
     * @param upperBound upper bound
     * @return average of integers
     */
    public static double average(int lowerBound, int upperBound) {
        int sum = 0;
        int count = 0;
        while (lowerBound <=  upperBound) {
            sum += lowerBound;
            count++;
            lowerBound++;
        }
        try {
            return (double) sum / count;
        } catch (Exception e) {
            throw new ArithmeticException("Error: Cannot divide a number by zero.");
        }
    }

    /**
     * Computes average of running integers from a lower bound to an upper bound within an array.
     *
     * @param numbers running integers array
     * @return average of integers
     */
    public static double average(int[] numbers) {
        int count = 0;
        int sum = 0;
        do {
            sum += numbers[count];
            count++;
        }
        while (count < numbers.length);

        try {
            return (double) sum / count ;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Error: Cannot divide a number by zero.");
        }
    }
}