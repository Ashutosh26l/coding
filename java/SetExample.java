import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        // Using HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Orange");
        hashSet.add("Grapes");
        hashSet.add("Apple"); // Duplicate entry

        System.out.println("HashSet (Unordered, no duplicates):");
        System.out.println(hashSet);

        // Using LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Banana");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Grapes");
        linkedHashSet.add("Apple"); // Duplicate entry

        System.out.println("\nLinkedHashSet (Ordered, no duplicates):");
        System.out.println(linkedHashSet);

        // Using TreeSet
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Orange");
        treeSet.add("Grapes");
        treeSet.add("Apple"); // Duplicate entry

        System.out.println("\nTreeSet (Sorted, no duplicates):");
        System.out.println(treeSet);
    }
}
