public class insertioninarray {
    
        public static void main(String[] args) {
            // Original array
            int[] originalArray = {1, 2, 3, 4};
            
            // Element to be added
            int newElement = 5;
            
            // Create a new array with one more position
            int[] newArray = new int[originalArray.length + 1];
            
            // Copy elements from the original array to the new array
            for (int i = 0; i < originalArray.length; i++) {
                newArray[i] = originalArray[i];
            }
            
            // Add the new element at the last position
            newArray[newArray.length - 1] = newElement;
            
            // Print the new array
            for (int i = 0; i < newArray.length; i++) {
                System.out.print(newArray[i] + " ");
            }
        }
    }
    