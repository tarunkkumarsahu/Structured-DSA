import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] graph = new int[5][5];

        // Input
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                graph[i][j] = sc.nextInt();
            }
        }

        // Output
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}