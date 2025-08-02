
import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(arr[i], i);
        }
        return new int[] {}; // No solution found
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
            System.out.print("Target sum daal: ");
            int target = sc.nextInt();

            int[] result = twoSum(arr, target);
            System.out.println("Indices: " + Arrays.toString(result));
        } catch (java.util.InputMismatchException e) {
            System.out.println("Bhai, sahi se integer daal na!");
        }
    }
}

// Notes:

// Logic Explained: HashMap mein har element aur uska index store karo. Har
// element ke liye check karo ki target - arr[i] map mein hai ya nahi. Agar hai,
// toh dono indices return karo.
// Edge Cases:

// Empty array: Empty array return.
// No solution: Empty array return.
// Duplicate elements: Map first occurrence store karta hai.

// Time Complexity: $ O(n) $, single pass with HashMap.
// Space Complexity: $ O(n) $, HashMap ke liye.
// TCS NQT Relevance: Interviews mein common (like “Find pair summing to
// target”). HashMap optimization dikhata hai.

// Task: Code run kar, test cases try kar: [2, 7, 11, 15], target=9, [3, 2, 4],
// target=6, [1, 2], target=5.