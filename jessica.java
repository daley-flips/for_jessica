// javac jessica.java && java jessica
// =============================================================================
import java.util.*;

public class jessica {
    static List<int[]> edges = Arrays.asList(
        new int[]{0, 1}, new int[]{0, 2}, new int[]{0, 3}, new int[]{0, 4},
        new int[]{1, 3}, new int[]{2, 4}, new int[]{3, 4}, new int[]{3, -30},
        new int[]{4, -40}
    );

    static Map<Integer, List<Integer>> graph = new HashMap<>();
    static List<Integer> path = new ArrayList<>();
// =============================================================================




// **YOU CODE**
// =============================================================================
// implement dfs
// =============================================================================
    public static void dfs(int curr, Map<Integer, List<Integer>> graph) {
        return;
    }
// =============================================================================
// =============================================================================




// **YOU CODE**
// =============================================================================
// main method
// build graph from edges list
// =============================================================================
    public static void main(String[] args) {
        // Build the graph 
        
// =============================================================================
// =============================================================================





// =============================================================================
// tests
// =============================================================================
        // Perform DFS starting at node 0
        dfs(0, graph);

        // Check result
        List<Integer> expectedPath = Arrays.asList(0, 1, 3, 4, 2, -40, -30);
        if (path.equals(expectedPath)) {
            System.out.println("dfs success");
        } else {
            System.out.println("try again");
            System.out.println(path);
        }
    }
}