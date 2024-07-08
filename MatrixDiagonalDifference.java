public class MatrixDiagonalDifference {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 0},
            {4, 5, 6},
            {7, 8, 9}
        };
        int result = diagonalDifference(matrix);
        System.out.println(result); // Output: 3
    }

    public static int diagonalDifference(int[][] matrix) {
        int n = matrix.length;
        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;

        for (int i = 0; i < n; i++) {
            primaryDiagonal += matrix[i][i];
            secondaryDiagonal += matrix[i][n - 1 - i];
        }

        return Math.abs(primaryDiagonal - secondaryDiagonal);
    }
}
