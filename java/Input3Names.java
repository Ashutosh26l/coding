import java.util.Scanner;


public class Input3Names {
    public static void main(String[] args) {
        // Declare Variables
        String[] names = new String[3];

        // Accept User Input
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Please Enter Name " + (i + 1) + ": ");
            names[i] = keyboard.nextLine();
        }

        // Print Names using a loop
        System.out.println("The names you entered are:");
        for (int i = 0; i < 3; i++) {
            System.out.println(names[i]);
        }
        
        keyboard.close();
    }
}
