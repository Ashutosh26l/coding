import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,5  ,87);
    }
    static void fun(int...v){
        System.out.println(Arrays.toString(v));
    }
        
    }
    

