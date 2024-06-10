import java.util.Scanner;

public class entryexit {

    public static void main(String[] args) {
        System.out.println("ENTER THE SIZE OF THE MATRIX:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter the elements of the matrix (0 or 1):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The input Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Traversing the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    System.out.println("Starting from (" + i + ", " + j + "):");

                    // Traversing South
                    for (int row = i; row < n; row++) {
                        if (matrix[row][j] == 1) {
                            System.out.println("South: (" + row + ", " + j + ")");
                            i = row;
                            break;
                        }
                    }

                    // Traversing East
                    for (int col = j; col < n; col++) {
                        if (matrix[i][col] == 1) {
                            System.out.println("East: (" + i + ", " + col + ")");
                            j = col;
                            break;
                        }
                    }

                    // Traversing North
                    for (int row = i; row >= 0; row--) {
                        if (matrix[row][j] == 1) {
                            System.out.println("North: (" + row + ", " + j + ")");
                            i = row;
                            break;
                        }
                    }

                    // Traversing West
                    for (int col = j; col >= 0; col--) {
                        if (matrix[i][col] == 1) {
                            System.out.println("West: (" + i + ", " + col + ")");
                            j = col;
                            break;
                        }
                    }
                }
            }
        }
    }
}
