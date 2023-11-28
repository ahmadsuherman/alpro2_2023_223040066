package PRA_UTS;

public class MatrixPattern {
    public static void main(String[] args) {
        // Membuat matriks 5x5
        String[][] matrix = new String[5][5];

        // Mengisi matriks sesuai dengan pola
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 2 || j == 2) {
                    matrix[i][j] = "+";
                } else {
                    matrix[i][j] = "x";
                }
            }
        }

        // Mencetak matriks
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

