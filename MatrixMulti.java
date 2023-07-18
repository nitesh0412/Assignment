import java.util.Scanner;

public class MatrixMulti {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows for matrix one: ");
        int rows1 = sc.nextInt();

        System.out.print("Enter the number of columns for matrix one: ");
        int cols1 = sc.nextInt();

        System.out.print("Enter the number of rows for matrix two: ");
        int rows2 = sc.nextInt();

        System.out.print("Enter the number of columns for matrix two: ");
        int cols2 = sc.nextInt();

        if (cols1 != rows2) {
            System.out.println("Cannot multiply matrices. Invalid dimensions.");
            return;
        }

        int[][] matrixone = new int[rows1][cols1];
        int[][] matrixtwo = new int[rows2][cols2];
        int[][] matrixans = new int[rows1][cols2];

        System.out.println("Enter the elements for matrix one:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrixone[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements for matrix two:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrixtwo[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    matrixans[i][j] += matrixone[i][k] * matrixtwo[k][j];
                }
            }
        }

        System.out.println("Result :");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(matrixans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
