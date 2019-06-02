import java.util.Scanner;

public class FibonacciCalculator {

    protected String [] types;


    // Constructor for the class.
    public FibonacciCalculator () {
        types = new String [] {"recursive", "iterative"};
    }


    // Main driver code
    public static void main(String[] args) {
        Scanner input_scanner = new Scanner(System.in);

        // to do: input validation

        System.out.print("Please enter the Fibonacci index you would like to compute: ");
        int num = input_scanner.nextInt();

        System.out.print("Please enter the method of computation (iterative/recursive): ");
        String type = input_scanner.next();
        type.toLowerCase();

        Fibonacci fib = new Fibonacci();
        int result = fib.fibonacci(num, type);

        System.out.print("The Fibonacci number of " + num + " is " + result);

    }


    /*
       THE FOLLOWING FUNCTIONS ARE NOT USED IN THIS PROGRAM BUT USEFUL FOR DEBUGGING AND ANALYSIS
    */


    // This function tests three sample values of the Fibonacci function.
    public boolean testFibonacci() {
        Fibonacci fibonacci = new Fibonacci();
        int[][] expectedValues = {{1, 1}, {4, 3}, {10, 55}};

        for (String type : types) {
            for (int i = 0; i < expectedValues.length; i++) {
                if (fibonacci.fibonacci(expectedValues[i][0], type) != expectedValues[i][1]) {
                    return false;
                }
            }
        }
        return true;
    }


    // This is a stub for testing the timing
    public void testPerformance() {
        // to do - compare recursion to iteration using wall clock speed
    }

}
