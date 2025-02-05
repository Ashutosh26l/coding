import java.util.*;/**
 * Innertemperatute
 */
/**
 * temperatute
 */
class temperatute {

    public static void main(String[] args) {
        Scanner celsius = new Scanner(System.in);
        int t = celsius.nextInt();
        int f = (t * 9 / 5) + 32;
        System.out.println(f); 
        celsius.close();
        }
    }

