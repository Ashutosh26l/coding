import java.util.*;

public class posorneg {
    public static void main(String[] args) {
        Scanner num= new Scanner(System.in);
        int n = num.nextInt();
        if(n>0){
            System.out.println("Positive");
        }
        else if(n<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
        num.close();

    }
    
    
}
