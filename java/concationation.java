public class concationation {
    
        public static void main(String[] args) {
            
            String str1 = "sharda";
            String str2 = "university";
    
            
            String concatenatedStr = str1 + str2;
    
            String extractedStr = concatenatedStr.substring(0, str1.length());
    
            System.out.println("Concatenated String: " + concatenatedStr);
            System.out.println("Extracted String: " + extractedStr);
        }
}
