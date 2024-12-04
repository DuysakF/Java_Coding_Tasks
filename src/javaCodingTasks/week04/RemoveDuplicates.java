package javaCodingTasks.week04;

public class RemoveDuplicates {
    public static String removeDup(String str) {
        // Initialize a StringBuilder to build the result without duplicates
        StringBuilder result = new StringBuilder();

        // Iterate through the string
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // Check if the current character is already in the result
            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                result.append(currentChar);
            }
        }

        // Convert the StringBuilder to a string and return it
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDup("AAABBBCCC")); // Output: ABC
    }
}


/*
String -- Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC

 */