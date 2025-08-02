import java.util.Scanner;

public class FindMaxElement {
    public static int findMax(int[] arr) {
        if (arr.length == 0)
            return -1; // Edge case: empty array
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
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
            int result = findMax(arr);
            System.out.println("Maximum element: " + (result == -1 ? "Array khali hai!" : result));
        } catch (java.util.InputMismatchException e) {
            System.out.println("Bhai, sahi se integer daal na!");
        }
    }
}


// Notes:

// Logic Explained: Array ko traverse karo, har element ko current max se compare karo, agar bada hai toh update karo.
// Edge Cases:

// Empty array: Return -1.
// Single element: Return wo element.
// All negative numbers: Largest negative return karega.


// Time Complexity: $ O(n) $, kyunki pura array ek baar traverse hota hai.
// Space Complexity: $ O(1) $, sirf ek max variable use hota hai.
// TCS NQT Relevance: Basic problem, NQT mein “find max/min” ya “second max” ke roop mein aata hai.


// Task: Code run kar, test cases try kar: [3, 7, 2, 9, 1], [], [5], [-1, -5, -2].