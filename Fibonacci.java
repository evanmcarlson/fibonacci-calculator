public class Fibonacci {

    public int fibonacci (int n, String type) {
        if(type.equals("iterative")) {
            return fibonacci_iterative(n);
        }
        if (type.equals("recursive")) {
            return fibonacci_recursive(n);
        }
        return 0;
    }

    public int fibonacci_iterative(int n) {
        int previous = 0;
        int current = 1;


        for (int i = 2; i <= n; i++) {
            int temp = current;
            current += previous;
            previous = temp;
        }

        return current;
    }

    public int fibonacci_recursive(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        return fibonacci_recursive(n - 1) + fibonacci_recursive(n - 2);
    }
}
