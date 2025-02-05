import java.util.Scanner;

public class MatrixMultiplication {

    // Method to take input for a matrix
    public static int[][] inputMatrix(int rows, int columns, Scanner scanner) {
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter elements of the matrix (" + rows + "x" + columns + "):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix, int rows1, int columns1, int columns2) {
        int[][] resultMatrix = new int[rows1][columns2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < columns1; k++) {
                    resultMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
        return resultMatrix;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dimensions of the first matrix
        System.out.print("Enter the number of rows in the first matrix: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter the number of columns in the first matrix: ");
        int columns1 = scanner.nextInt();

        // Input dimensions of the second matrix
        System.out.print("Enter the number of rows in the second matrix: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter the number of columns in the second matrix: ");
        int columns2 = scanner.nextInt();

        // Ensure that the number of columns in the first matrix equals the number of rows in the second matrix
        if (columns1 != rows2) {
            System.out.println("Matrix multiplication is not possible. The number of columns in the first matrix must equal the number of rows in the second matrix.");
            
        }

        // Input the matrices
        int[][] firstMatrix = inputMatrix(rows1, columns1, scanner);
        int[][] secondMatrix = inputMatrix(rows2, columns2, scanner);

        // Multiply the matrices
        int[][] resultMatrix = multiplyMatrices(firstMatrix, secondMatrix, rows1, columns1, columns2);

        // Display the resulting matrix
        System.out.println("Resulting matrix after multiplication:");
        displayMatrix(resultMatrix);

        scanner.close();
    }
}
