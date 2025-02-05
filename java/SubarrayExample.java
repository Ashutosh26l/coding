public class SubarrayExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4}; 
        generateSubarrays(array);
    }

    public static void generateSubarrays(int[] array) {
        
        int subarrayCount=0; 
        int totalSum=0; 

        
        for (int i = 0; i < array.length; i++) {
            
            for (int j = i; j < array.length; j++) {
                int subarraySum = 0; 
                for (int k = i; k <= j; k++) {
                    System.out.print(array[k] + " ");
                    subarraySum += array[k];
                }
                System.out.println();
                subarrayCount++; 
                totalSum += subarraySum; 
            }
        }
    }
}
