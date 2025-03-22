// javac jessicaTwo.java && java jessicaTwo
// =============================================================================
import java.util.*;

public class jessicaTwo {
    // Sorted list for binary search tests
    static List<Integer> sortedList = Arrays.asList(1, 3, 5, 7, 9, 11, 13, 15, 17, 19);
// =============================================================================
// =============================================================================




// **YOU CODE**
// =============================================================================
// implement binarySearch 
// =============================================================================
    public static int binarySearch(List<Integer> list, int target) {
        return -1;
    }
// =============================================================================
// =============================================================================





// =============================================================================
// main method: tests
// =============================================================================
    public static void main(String[] args) {
        // Test: element exists (middle element)
        int foundIndex = binarySearch(sortedList, 7);
        // Test: element does not exist
        int notFoundIndex = binarySearch(sortedList, 8);
        // Additional Test: first element
        int firstIndex = binarySearch(sortedList, 1);
        
        // Check results for test case 1 & 2
        if (foundIndex != -1 && sortedList.get(foundIndex) == 7 && notFoundIndex == -1) {
            System.out.println("success 1");
        } else {
            System.out.println("try again for middle element test");
            System.out.println("Index for 7: " + foundIndex);
            System.out.println("Index for 8: " + notFoundIndex);
        }
        
        // Check result for additional test case (first element)
        if (firstIndex == 0) {
            System.out.println("success 2");
        } else {
            System.out.println("Test case for first element failed, index: " + firstIndex);
        }
    }
}
