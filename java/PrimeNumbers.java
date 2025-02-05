public class PrimeNumbers {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If divisible by any number other than 1 and itself, it's not prime
            }
        }
        return true; // Number is prime
    }

    // Method to check if a string is a valid integer
    public static boolean isValidInteger(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i == 0 && c == '-') {
                // Negative numbers are allowed, so skip the '-' sign check for the first character
                if (str.length() == 1) {
                    return false; // Just a '-' sign is not a valid number
                }
                continue;
            }
            if (c < '0' || c > '9') {
                return false; // Not a digit
            }
        }
        return true;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a list of numbers as command-line arguments.");
            return;
        }

        System.out.println("Prime numbers from the list:");
        for (String arg : args) {
            if (isValidInteger(arg)) {
                int num = Integer.parseInt(arg);
                if (isPrime(num)) {
                    System.out.print(num + " ");
                }
            } else {
                System.out.println("\"" + arg + "\" is not a valid integer.");
            }
        }
        System.out.println(); // Newline at the end of the output
    }
}
