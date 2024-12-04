package javaCodingTasks.week04;
import java.util.Arrays;

public class SameLetters {
    public static boolean same(String str1, String str2) {
        // If lengths are different, return false
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort the character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        System.out.println(same("abc", "cab")); // Output: true
        System.out.println(same("abc", "abb")); // Output: false
    }
}



/*String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false

 */