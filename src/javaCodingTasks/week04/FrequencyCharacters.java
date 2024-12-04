package javaCodingTasks.week04;
import java.util.Arrays;

public class FrequencyCharacters {
    public static String FrequencyOfChars(String str) {
        // Convert string to character array and sort
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);

        StringBuilder result = new StringBuilder();
        int length = charArray.length;

        for (int i = 0; i < length; i++) {
            char currentChar = charArray[i];
            int count = 1;

            // Count occurrences of the current character
            while (i + 1 < length && charArray[i + 1] == currentChar) {
                count++;
                i++;
            }

            // Add the character and its count to the result
            result.append(currentChar).append(count);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(FrequencyOfChars("AAABBCDD")); // Output: A3B2C1D2
    }
}


/*String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

 */