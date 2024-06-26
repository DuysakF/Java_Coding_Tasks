package javaCodingTasks.week05;

public class FindUnique {

    public static void main(String[] args) {
        String input = "AAABBBCCCDEF";
        System.out.println("Unique characters: " + unique(input)); // Output: DEF
    }



    public static String unique(String input) {
        // Array to store the frequency of each character (assuming ASCII characters)
        int[] charCount = new int[256];

        // Count the occurrences of each character
        for (char c : input.toCharArray()) {
            charCount[c]++;
        }

        // Build the result string with characters that appear exactly once
        StringBuilder uniqueChars = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (charCount[c] == 1) {
                uniqueChars.append(c);
            }
        }

        return uniqueChars.toString();



    }



}
