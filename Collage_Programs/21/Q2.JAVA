import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int n = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        int[][] a = new int[n + 1][n + 1];

        for (int i = 0; i < e; i++) {

            System.out.print("Enter u and v: ");
            int u = sc.nextInt();
            int v = sc.nextInt();

            a[u][v] = 1;
            a[v][u] = 1;
        }

        System.out.println("Adjacency Matrix:");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}