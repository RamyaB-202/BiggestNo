/**
 * The ArrayMax class finds the largest element in an array and prints it.
 */
public class ArrayMax {
    /**
     * The main function finds the largest element in an array and prints it.
     */
    public static void main(String[] args) {
        int[] arr = {10, 324, 45, 90, 9808};
        System.out.println("Largest in given array is " + findLargest(arr));
    }
  
    /**
     * The function finds the largest element in an array of integers.
     * 
     * @param arr The parameter "arr" is an array of integers.
     * @return The method findLargest is returning the largest element in the given array.
     */
    static int findLargest(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
  }
  