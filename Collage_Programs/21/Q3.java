import java.util.*;

public class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int n = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        LinkedList<Integer>[] adj = new LinkedList[n + 1];

        // Create linked lists
        for (int i = 1; i <= n; i++) {
            adj[i] = new LinkedList<>();
        }

        // Add edges
        for (int i = 0; i < e; i++) {

            System.out.print("Enter u and v: ");
            int u = sc.nextInt();
            int v = sc.nextInt();

            adj[u].add(v);
            adj[v].add(u);
        }

        // Display adjacency list
        System.out.println("Adjacency List:");

        for (int i = 1; i <= n; i++) {

            System.out.print(i + " -> ");

            for (int v : adj[i]) {
                System.out.print(v + " -> ");
            }

            System.out.println("NULL");
        }
    }
}