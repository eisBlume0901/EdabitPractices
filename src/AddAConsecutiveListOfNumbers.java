

public class AddAConsecutiveListOfNumbers {
    public static int addUpTo(int n) {
        /* Adding consecutive numbers using for loop. Formula from:
        https://www.programiz.com/java-programming/examples/sum-natural-numbers
         */
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The total sum of all consecutive numbers is: " + sum);
        return sum;

        // Taking the last number of a consecutive list of numbers using Ternary operator

    }
    public static void main(String[] args) {
        addUpTo(5);
    }
}
