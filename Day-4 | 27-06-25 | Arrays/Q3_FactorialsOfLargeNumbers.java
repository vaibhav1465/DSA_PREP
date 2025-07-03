import java.util.ArrayList;
import java.util.Collections;

public class Q3_FactorialsOfLargeNumbers {
    

        // Method to calculate the factorial of a number n
    public static ArrayList<Integer> factorial(int n) {
        // ArrayList to store the result of the factorial
        ArrayList<Integer> number = new ArrayList<>();
        // Initializing the result with 1 (since 0! = 1 and 1! = 1)
        number.add(1);

        // Loop from 2 to n, multiplying the current result by i at each step
        for (int i = 2; i <= n; i++) {
            multiply(i, number);
        }

        Collections.reverse(number);
        return number; // Return the factorial as a list of digits
    }

    // Helper method to multiply the current result by n
    private static void multiply(int n, ArrayList<Integer> number) {
        int carry = 0; // Initialize carry to handle values greater than 9

        // Traverse each digit in the current result
        for (int i = 0; i < number.size(); i++) {
            // Multiply n with the current digit
            int num = n * number.get(i);
            // Set the last digit of (num + carry) to current position
            number.set(i, (num + carry) % 10);
            carry = (num + carry) / 10;
        }

        // Handle remaining carry, if any, by adding additional digits to the result
        while (carry > 0) {
            // Add the last digit of carry to the result
            number.add(carry % 10);
            // Update carry by removing the last digit
            carry /= 10;
        }
    }

    public static void main(String[] args) {
        

        // Factorials of large numbers
        // Examples:
        // Input: n = 5
        // Output: [1, 2, 0]
        // Explanation: 5! = 1*2*3*4*5 = 120
        // Input: n = 10
        // Output: [3, 6, 2, 8, 8, 0, 0]
        // Explanation: 10! = 1*2*3*4*5*6*7*8*9*10 = 3628800
        // Input: n = 1
        // Output: [1]
        // Explanation: 1! = 1 

        ArrayList<Integer> result = factorial(5);
        System.out.println(result);
    }
}
