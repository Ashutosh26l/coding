import java.util.*;
public class lcmandhcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int hcf = 1;
        int lcm = (a*b)/hcf;
        System.out.println("the hcf is" +hcf);
        System.out.println("the lcm is"+lcm);
        sc.close();
    }
    
}
