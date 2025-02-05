class concatination {
    public static void main(String[] args) {
        // Initialize the two strings
        String str1 = "sharda";
        String str2 = "university";

        // Concatenate the two strings
        String concatenatedStr = str1 + str2;

        // Extract "sharda" from the concatenated string using substring
        String extractedStr = concatenatedStr.substring(0, str1.length());

        // Print the result
        System.out.println("Concatenated String: " + concatenatedStr);
        System.out.println("Extracted String: " + extractedStr);
    }
}