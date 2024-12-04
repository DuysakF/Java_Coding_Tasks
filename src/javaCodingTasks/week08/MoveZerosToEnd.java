package javaCodingTasks.week08;

public class MoveZerosToEnd {

        public static void main(String[] args) {
            int[] arr = {5, 0, 2, 0, 3, 0, 4, 0};
            moveZerosToEnd(arr);

            // Print the result

            for (int num : arr) {
                System.out.print(num + " ");
            }
        }

        public static void moveZerosToEnd(int[] arr) {
            int lastNonZeroIndex = 0;

            // Traverse the array and move non-zero elements to the front

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    arr[lastNonZeroIndex++] = arr[i];
                }
            }

            // Fill the remaining positions in the array with zeros

            while (lastNonZeroIndex < arr.length) {
                arr[lastNonZeroIndex++] = 0;
            }
        }


    }

