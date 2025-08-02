import java.util.*;

public class MoveZeroes {
    public static void moveZeroes(int[] arr) {
        int nonZeroPos = 0;
        // Move all non-zero elements to front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroPos++] = arr[i];
            }
        }
        // Fill rest with zeros
        while (nonZeroPos < arr.length) {
            arr[nonZeroPos++] = 0;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Array ka size daal bhai: ");
            int n = sc.nextInt();
            if (n < 0) {
                System.out.println("Galat hai bhai, size negative nahi ho sakta!");
                return;
            }
            int[] arr = new int[n];
            if (n > 0) {
                System.out.print(n + " numbers daal (space se alag): ");
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
            }
            System.out.println("Original array: " + Arrays.toString(arr));
            moveZeroes(arr);
            System.out.println("Array after moving zeroes: " + Arrays.toString(arr));
        } catch (java.util.InputMismatchException e) {
            System.out.println("Bhai, sahi se integer daal na!");
        }
    }
}


// Notes:

// Logic Explained: Two-pointer technique use karta hai. Ek pointer (nonZeroPos) non-zero elements ko front mein lata hai, phir baki positions ko zero se fill karta hai.
// Edge Cases:

// Empty array: No change.
// All zeros: Array same rahega.
// No zeros: Array unchanged rahega.


// Time Complexity: $ O(n) $, ek pass non-zeros ke liye, ek pass zeros ke liye.
// Space Complexity: $ O(1) $, in-place operation.
// TCS NQT Relevance: Direct NQT question (“Move zeros to end”). In-place manipulation skills dikhata hai.


// Task: Code run kar, test cases try kar: [0, 1, 0, 3, 12], [1, 2, 3], [0, 0, 0].