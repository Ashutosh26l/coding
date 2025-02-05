
import java.util.*;

class Arraylist  {

    public static void main(String[] args)
    {

       
        List<String> fruit = new ArrayList<>();

        
        String[] fruits = {"apple", "orange", "guava", "banana", "mango"};
        for (String f : fruits) {
            fruit.add(f);
       }

        System.out.println("Elements of List are:");

       
        for (String s : fruit) {
            System.out.println(s);
        }

        
        System.out.println("Element at Index 1: "+ fruit.get(1));

        
        fruit.set(1, "pomogranate");
        System.out.println("Updated List: " + fruit);

        
        fruit.remove("apple");
        System.out.println("List After Removing Element: " + fruit);
    }
}

