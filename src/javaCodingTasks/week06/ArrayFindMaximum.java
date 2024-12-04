package javaCodingTasks.week06;

/*
***
 Java Coding Tasks - Week6:pushpin:

3. Array_FindMaximum
Write a method that can find the maximum number from an int Array
Ex: int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
***
 */

public class ArrayFindMaximum {

    public static void main(String[] args) {
        int[] arr = {12,99 , 23, 32, 44, 57, 6};
        int maxNumber = findMaximum(arr);
        System.out.println("Maximum number: " + maxNumber); // 99
    }


    public static int findMaximum(int[] arr) {
        // Accept the first element as maximum
        int max = arr[0];

        // Compare other elements in the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update when a greater value is found
            }
        }

        // Return maximum value
        return max;
    }

}
