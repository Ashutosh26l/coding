public class FibonacciSeries {
    
    // Using a for loop
    public static void generateFibonacciForLoop(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series (For Loop): " + a);
        
        for (int i = 1; i < n; i++) {
            System.out.print(", " + b);
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    // Using a while loop
    public static void generateFibonacciWhileLoop(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series (While Loop): " + a);
        int count = 1;
        
        while (count < n) {
            System.out.print(", " + b);
            int next = a + b;
            a = b;
            b = next;
            count++;
        }
        System.out.println();
    }

    // Using a do-while loop
    public static void generateFibonacciDoWhileLoop(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series (Do-While Loop): " + a);
        int count = 1;
        
        do {
            System.out.print(", " + b);
            int next = a + b;
            a = b;
            b = next;
            count++;
        } while (count < n);
        System.out.println();
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the number of Fibonacci terms as a command-line argument.");
            return;
        }

        int n = Integer.parseInt(args[0]);
        if (n <= 0) {
            System.out.println("Please provide a positive integer.");
            return;
        }

        generateFibonacciForLoop(n);
        generateFibonacciWhileLoop(n);
        generateFibonacciDoWhileLoop(n);
    }
}
